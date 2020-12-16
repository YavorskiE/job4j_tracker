package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 1),
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 2),
                new Job("Impl task", 0),
                new Job("Reboot server", 5)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Comparator<Job> comb = new JobDescByNameLn()
                .thenComparing(new JobDescByPriority())
                .thenComparing(new JobDescByName());
        Collections.sort(jobs, comb);
        System.out.println(jobs);
        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority = Comparator.comparing(Job::getPriority);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);
        Collections.sort(jobs, combine);
        System.out.println(jobs);
    }
}
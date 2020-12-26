package ru.job4j.bank;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() ) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
//        for (User user : users.keySet()) {
//            if (user.getPassport().equals(passport)) {
//                return user;
//            }
//        }
//        return null;
//
//        return users.keySet()
//                .stream()
//                .filter(u -> u.getPassport().equals(passport))
//                .findFirst()
//                .orElse(null);

        Optional<User> rsl = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
        return rsl;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
//        User user = findByPassport(passport);
//        if (user != null) {
//            List<Account> accounts = users.get(user);
//            int index = accounts.indexOf(new Account(requisite, 0));
//            if (index != -1) {
//                return accounts.get(index);
//            }
//            return users.get(user)
//                    .stream()
//                    .filter(a -> a.getRequisite().equals(requisite))
//                    .findFirst()
//                    .orElse(null);
//        }
//        return null;
        Optional<Account> rsl = Optional.empty();
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            for (Account account : users.get(user.get())) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = Optional.of(account);
                    break;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                            String destPassport, String destRequisite, double amount) {
        boolean rsl =  false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && amount <= srcAccount.get().getBalance()) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

package ru.jo4bj.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String unknown = "Неизвестное слово. " + eng;
        return unknown;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String res = dic.engToRus("unknown");
        System.out.println(res);
    }
}

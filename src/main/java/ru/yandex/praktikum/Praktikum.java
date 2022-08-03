package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {
        String testName = "1234567";
        Account account = new Account(testName);
        System.out.println(account.checkNameToEmboss());
    }

}

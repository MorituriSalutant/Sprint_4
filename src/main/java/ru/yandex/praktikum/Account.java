package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19) {
            if (!name.startsWith(" ") || !name.endsWith(" ")) {
                return name.indexOf(' ') == name.lastIndexOf(' ') && name.contains(" ");
            }
        }
        return false;
    }
}

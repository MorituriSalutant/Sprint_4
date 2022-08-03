package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(name.length()>=3 && name.length()<=19 ){
            System.out.println("в строке не меньше 3 и не больше 19 символов");
            return true;
        }
        if (name.startsWith(" ") || name.endsWith(" ")) {
            System.out.println("пробел стоит не в начале и не в конце строки.");
            return true;
        }
        if(name.indexOf(' ') == name.lastIndexOf(' ') && name.contains(" ")){
            System.out.println("в строке есть только один пробел");
            return true;
        }
        return false;
    }

}

package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return false;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
                Её получится напечатать, если соблюдены требования:
                - в строке не меньше 3 и не больше 19 символов,
                — в строке есть только один пробел,
                — пробел стоит не в начале и не в конце строки.
         */
    }

}

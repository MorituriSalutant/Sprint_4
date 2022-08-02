package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(name.length()>=3 && name.length()<=19 ){
            System.out.println("Больше 3 и меньше 20");
            for (int i = 0; i < name.length(); i++) {
                if (Character.isWhitespace(name.charAt(i))) {
                    System.out.println("Содержит 1 пробел");
                }
                    return true;
                }
        }
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

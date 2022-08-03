package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expectBoolean;

    public AccountTest(String name, boolean expectBoolean) {
        this.name = name;
        this.expectBoolean = expectBoolean;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Ша", false},
                {"ШаловейГригорийШаловейГригорий", false},
                {" Шаловей Григорий", false},
                {"Шаловей Григорий ", false},
                {" Шаловей Григорий ", false},
                {"ШаловейГригорий", false},
                {"Шал овейГриг орий", false},
                {"Шаловей Григорий", true},
        };
    }

    @Test
    public void checkNameToEmbossTrueTest() {
        Account account = new Account(name);

        boolean actualBoolean = account.checkNameToEmboss();

        assertEquals(expectBoolean, actualBoolean);
    }
}

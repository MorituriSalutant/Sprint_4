package ru.yandex.praktikum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    @Test
    public void checkNameToEmbossTrueTest() {
        Account account = new Account("Шаловей Григорий");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameToEmbossFalseTest() {
        Account account = new Account("ШаловейГригорий");
        assertFalse(account.checkNameToEmboss());
    }
}

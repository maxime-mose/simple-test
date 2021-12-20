package ru.maxime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Простые тесты")
public class SimpleTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Запущены тесты.");
    }

    @Test
    @DisplayName("Простой тест 1")
    public void firstTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, 2 + 2, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(4, 2 * 2, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(2, 8 / 4, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(4, 6 - 2, "Результат отличается от ожидаемой.")
        );
    }

    @Test
    @DisplayName("Простой тест 2")
    public void secondTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, 2 + 2, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(4, 2 * 2, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(2, 8 / 4, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(4, 6 - 2, "Результат отличается от ожидаемой.")
        );
    }

    @Test
    @DisplayName("Простой тест 3")
    public void thirdTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(4, 2 + 2, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(4, 2 * 2, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(2, 8 / 4, "Результат отличается от ожидаемой."),
                () -> Assertions.assertEquals(4, 6 - 2, "Результат отличается от ожидаемой.")
        );
    }
}

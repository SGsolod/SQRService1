package ru.netology.srq;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRService1Test {
    @ParameterizedTest
    @CsvSource(value = {
            "positive values, 6, 100, 250",
            "positive values, 8, 100, 300",
            "positive values, 5, 100, 200"

    })
    public void shouldRangeNumbersInTheRange(String testName, int expected, int lowerRange, int upperRange) {
        SQRService1 service = new SQRService1(); // Создаем сервис


        int actual = service.rangeNumbers(lowerRange, upperRange);
        assertEquals(expected, actual);


    }
}
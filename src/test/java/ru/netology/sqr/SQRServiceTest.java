package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    void shouldCountSquareNumberInGivenRange(int firstNumberRanged, int lastNumberRanged, int expected) {
        SQRService counter = new SQRService();

        // вызываем целевой метод:
        int actual = counter.squareСounter(firstNumberRanged, lastNumberRanged);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}

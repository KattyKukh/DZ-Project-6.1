package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/validValueTestResources.csv")
    public void validValue(int expected, int minLimit, int maxLimit) {
        SQRService service = new SQRService();
        int actual = service.calcAmountSqr(minLimit, maxLimit);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/borderValueTestResources.csv")
    public void borderValue(int expected, int minLimit, int maxLimit) {
        SQRService service = new SQRService();
        int actual = service.calcAmountSqr(minLimit, maxLimit);
        Assertions.assertEquals(expected, actual);
    }
}

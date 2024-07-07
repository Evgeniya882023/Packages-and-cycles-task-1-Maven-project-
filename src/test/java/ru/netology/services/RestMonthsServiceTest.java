package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestMonthsServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restMonths.csv")
    public void testCountRestMonths(int expected, int income, int expenses, int threshold) {
        RestMonthsService service = new RestMonthsService();
// вызываем целевой метод:
        int countMonths = service.calculate(income, expenses, threshold);

// производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, countMonths);

    }
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import ru.netology.services.RestMonthsService;

//public class RestMonthsServiceTest {
    //@Test
    //void CountWorkingMonths1() {
    //RestMonthsService service = new RestMonthsService();

    // подготавливаем данные:
    //int income = 100000; //доход от работы
    // int expenses = 60000; // обязательные месячные траты
    //int threshold = 150000; //денежный порог, остаток, позволяющий отдыхать
    //int expected = 2;

    // вызываем целевой метод:
    //int countMonths = service.calculate(income, expenses, threshold);

    // производим проверку (сравниваем ожидаемый и фактический):
    //Assertions.assertEquals(expected, countMonths);
}

//@Test
//void CountWorkingMonths2() {
// RestMonthsService service = new RestMonthsService();

// подготавливаем данные:
//int income = 10000; //доход от работы
//int expenses = 3000; // обязательные месячные траты
// int threshold = 20000; //денежный порог, остаток, позволяющий отдыхать
// int expected = 3;

// вызываем целевой метод:
// int countMonths = service.calculate(income, expenses, threshold);

// производим проверку (сравниваем ожидаемый и фактический):
// Assertions.assertEquals(expected, countMonths);

//}

//}

package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestMonthsService service = new RestMonthsService();
        int income = 100000; //доход от работы
        int expenses = 60000; // обязательные месячные траты
        int threshold = 150000; //денежный порог, остаток, позволяющий отдыхать
        int countMonths = service.calculate(income, expenses, threshold);
        System.out.println(countMonths);
        }
    }
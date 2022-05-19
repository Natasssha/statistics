package ru.netology.stats;

public class StatsService {

    public int sumOfSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }


    public int averageAmountOfSalesPerMonth(int[] sales) {
        int average = sumOfSales(sales) / sales.length;

        return average;

    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {

                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int belowAverage(int[] sales) {
        int count = 0;
        int average = averageAmountOfSalesPerMonth(sales);
        for (int i : sales) {
            if (i < average) {
                count++;
            }
        }

        return count;
    }


    public int aboveAverage(int[] sales) {
        int count = 0;
        int average = averageAmountOfSalesPerMonth(sales);
        for (int i : sales) {
            if (i > average) {
                count++;
            }
        }
        return count;
    }
}
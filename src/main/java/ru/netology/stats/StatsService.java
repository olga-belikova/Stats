package ru.netology.stats;

public class StatsService {

    // 1
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    // 2
    public long midSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    // 3
    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // 4
    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // 5
    public int belowMidSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < midSales(sales)) {
                month++;
            }
        }
        return month;
    }

    // 6
    public int aboveMidSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > midSales(sales)) {
                month++;
            }
        }
        return month;
    }
}

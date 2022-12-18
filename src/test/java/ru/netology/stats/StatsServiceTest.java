package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMidSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 15;
        long actual = service.midSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthBelowMid() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.belowMidSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthAboveMid() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 5;
        int actual = service.aboveMidSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}

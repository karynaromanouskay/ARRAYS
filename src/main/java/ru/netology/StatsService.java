package ru.netology;

public class StatsService {
    public int sumOfAllSales(long[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = (int) (summa + sales[i]);
        }
        return summa;
    }

    // средняя сумма продаж в месяц
    public int averageSalesMonth(long[] sales) {
        int summa = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = (int) (summa + sales[i]);
        }
        return summa = summa / sales.length;
    }
    //номер месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    //номер месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(long[] sales) {
        long sumMonth = 0;
        long avg = averageSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                sumMonth = sumMonth + 1;
            }
        }
        return (int) sumMonth;
    }


    //количество месяцев, в которых продажи были выше среднего
    public int salesHigherAverage(long[] sales) {
        long sumMonths = 0;
        long avg = averageSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                sumMonths = sumMonths + 1;
            }
        }
        return (int) sumMonths;
    }
}
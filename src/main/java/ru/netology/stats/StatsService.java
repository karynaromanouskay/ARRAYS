package ru.netology.stats;


public class StatsService {
    //Сумма всех продаж

    public int sumOfAllSales(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa;
    }

    // средняя сумма продаж в месяц
    public int averageSalesMonth(int[] sales) {
        int summa = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa = summa / sales.length;
    }

    //номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    //номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(int[] sales) {
        int sumMonth = 0;
        long avg = averageSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int salesHigherAverage(int[] sales) {
        int sumMonths = 0;
        long avg = averageSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                sumMonths = sumMonths + 1;
            }
        }
        return sumMonths;
    }
}







package com.company;

public class Main {
    public static void main(String[] args) {
        byte a = 1;  // 1-ое задание: переменные
        short b = 10;
        int c = 100;
        long d = 1000;
        float e = 1.1f;
        double f = 1.11;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
        boolean g = a == 10;
        System.out.println("утверждение " + g);

        double weight = 78.2;    //2-ое задание
        double weight2 = 82.7;
        double weightAll = weight + weight2;
        System.out.println("Общий вес=" + weightAll);
        double weight3 = weight - weight2;
        System.out.println("Разница веса " + weight3);

        double bananas = 80; // 3-ие задание
        double milk = 105;
        double ice_cream = 100;
        double eggs = 70;
        double breakfast = 5 * bananas + 2 * milk + 2 * ice_cream + 4 * eggs;
        System.out.println("весс завтрака " + breakfast + "гр.");
        System.out.println("весс завтрака в кг " + breakfast / 1000 + "кг.");

        int preponderance = 7000;  // 4-ое задание
        int diet1 = 250;
        int diet2 = 500;
        int days1 = preponderance / diet1;
        System.out.println("В первом случае похудеет за " + days1 + " дней");
        int days2 = preponderance / diet2;
        System.out.println("Во втором случае похудеет за " + days2 + " дней");
        int days3 = (days1 + days2) / 2;
        System.out.println("всреднем худеет " + days3 + " дней");

        int zpM = 67760;    // 5-ое задание
        int zpD = 83690;
        int zpK = 76230;
        int zpM1 = zpM + zpM / 10;
        int zpD1 = zpD + zpD / 10;
        int zpK1 = zpK + zpK / 10;
        System.out.println("Маша теперь получает " + zpM1 + " рублей, разница за год состовляет " + (zpM1 - zpM) * 12 + " рублей");
        System.out.println("Денис теперь получает " + zpD1 + " рублей, разница за год состовляет " + (zpD1 - zpD) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + zpK1 + " рублей, разница за год состовляет " + (zpK1 - zpK) * 12 + " рублей");


    }
}
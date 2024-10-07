public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        int savings = 0;
        short month = 0;
        final float procents = 1.01f;
        final short monthlySavings = 15_000;
        while (savings <= 2459000) {
            savings *= procents;
            savings += monthlySavings;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        // 2 задание
        System.out.println();
        for (byte num = 0; num < 10; num += 1) System.out.print(num + " ");
        System.out.println();
        for (byte num = 0; num >= 1; num -= 1) System.out.print(num + " ");
        System.out.println();

        //3 задание
        System.out.println();
        final byte birthRate = 17;
        final byte mortalityRate = 8;
        int population = 12_000_000;
        for (int i = 1; i <= 10; i += 1) {
            population += population / 1000 * (birthRate-mortalityRate);
            System.out.println("Год " + i +", численность населения составляет " + population);
        }

        // 4 задание
        System.out.println();
        final float monthlyProcents = 1.07f;
        int money = 15_000;
        month = 0;
        final int needToSave = 12_000_000;
        do { 
            money *= monthlyProcents;
            month += 1;
            System.out.println("Месяц " + month + ", накоплено " + money);
        } while (money < needToSave);

        // 5 задание
        System.out.println();
        money = 15_000;
        month = 0;
        do { 
            money *= monthlyProcents;
            month += 1;
            if (month % 6 == 0) System.out.println("Месяц " + month + ", накоплено " + money);
        } while (money < needToSave);

        // 6 задание
        System.out.println();
        money = 15_000;
        month = 0;
        final byte monthsInNineYears = 12 * 9;
        for (int i = 0; i <= monthsInNineYears; i+= 1) {
            money *= monthlyProcents;
            month += 1;
            if (month % 6 == 0) System.out.println("Месяц " + month + ", накоплено " + money);
        }

        // 7 задание
        System.out.println();
        int friday = 3;
        final byte daysInMonth = 31;
        final byte daysInWeek = 7;
        while (friday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + friday +"-е число. Необходимо подготовить отчет");
            friday += daysInWeek;
        }

        // 8 задание
        System.out.println();
        short year = 2024;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (int i = yearBefore; i <= yearAfter; i += 1) {
            if (i % 79 == 0) System.out.println(i);
        }
    }
}

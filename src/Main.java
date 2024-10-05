public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        int savings = 0;
        short month = 0;
        while (savings <= 2459000) {
            savings += 15000;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        // 2 задание
        System.out.println();
        byte num = 0;
        while (num < 10) {
            num ++;
            System.out.print(num + " ");
        }
        System.out.println();
        while (num >= 1) {
            System.out.print(num + " ");
            num --;
        }
        System.out.println();

        //3 задание
        System.out.println();
        int people = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            people += people / 1000 * (17-8);
            System.out.println("Год " + i +", численность населения составляет " + people);
        }

        // 4 задание
        System.out.println();
        int money = 15_000;
        month = 0;
        do { 
            money *= 1.07;
            month ++;
            System.out.println("Месяц " + month + ", накоплено " + money);
        } while (money < 12_000_000);

        // 5 задание
        System.out.println();
        money = 15_000;
        month = 0;
        do { 
            money *= 1.07;
            month ++;
            if (month % 6 == 0) System.out.println("Месяц " + month + ", накоплено " + money);
        } while (money < 12_000_000);

        // 6 задание
        System.out.println();
        money = 15_000;
        month = 0;
        for (int i = 0; i <= 12 * 9; i++) {
            money *= 1.07;
            month ++;
            if (month % 6 == 0) System.out.println("Месяц " + month + ", накоплено " + money);
        }

        // 7 задание
        System.out.println();
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday +"-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        // 8 задание
        System.out.println();
        short year = 2024;
        for (int i = year - 200; i <= year + 100; i++) {
            if (i % 79 == 0) System.out.println(i);
        }
    }
}

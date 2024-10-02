public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        for (byte i = 0; i <= 10; i ++) {
            System.out.println(i);
        }

        // 2 задание
        for (byte i = 10; i >= 1; i --) {
            System.out.println(i);
        }

        //3 задание
        for (byte i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        // 4 задание
        for (byte i = 10; i >= -10; i --) {
            System.out.println(i);
        }

        // 5 задание
        for (short i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }

        // 6 задание
        for (byte i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        // 7 задание
        for (short i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        // 8 задание
        int savings = 0;
        for (byte i = 0; i <= 12; i ++) {
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        // 9 задание
        savings = 0;
        for (byte i = 0; i <= 12; i ++) {
            savings *= 1.01;
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
        }

        // 10 задание
        for (byte i = 1; i <= 10; i ++) {
            System.out.println("2*" + i + "=" + i*2);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        int intVar = 2147000000;
        byte byteVar = 126;
        short shortVar = 32766;
        long longVar = -9223372036854775807L;
        float floatVar = -842.427f;
        double doubleVar = 382427.832941;
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        // 2 задание
        float firstNum = 27.12f;
        long secondNum = 987678965549L;
        float thirdNum = 2.786f;
        short fourthNum = 569;
        short fifthNum = -159;
        short sixthNum = 27897;
        byte seventhNum = 67;

        // 3 задание
        byte students = 23 + 27 + 30;
        System.out.println("На каждого ученика рассчитано " + 480 / students + " листов бумаги");

        // 4 задание
        byte speedPerMin = 16 /2;
        int speedPerDay = speedPerMin * 60 * 24;
        System.out.println("За 20 минут машина произвела " + speedPerMin * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + speedPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + speedPerDay * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + speedPerDay * 30 + " штук бутылок");

        // 5 задание
        byte classes = 120 / (2 + 4);
        System.out.println("В школе, где " + classes + " классов, нужно " + classes * 2 + " банок белой краски и " + classes * 4 + " банок коричневой краски");
        
        // 6 задание
        byte banana = 80;
        byte milk = 105;
        byte icecream = 100;
        byte egg = 70;
        int breakfast = banana * 5 + milk * 2 + icecream * 2 + egg * 4;
        System.out.println("Спортзавтрак в граммах - " + breakfast);
        System.out.println("Спортзавтрак в килограммах - " + breakfast / 1000);

        // 7 задание
        short needToLose = 7 * 1000;
        int loses250 = needToLose / 250;
        int loses500 = needToLose / 500;
        System.out.println("Если спортсмен теряет по 250 грамм в день, то ему понадобится " + loses250 + " дней");
        System.out.println("Если спортсмен теряет по 500 грамм в день, то ему понадобится " + loses500 + " дней");
        System.out.println("В среднем спортсмену понадобится " + (loses250 + loses500) / 2 + " дней");

        // 8 задание
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        System.out.println("Маша теперь получает " + (int)(masha * 1.1) + " рублей. Годовой доход вырос на " + (int)(masha * 0.1) + " рублей");
        System.out.println("Денис теперь получает " + (int)(denis * 1.1) + " рублей. Годовой доход вырос на " + (int)(denis * 0.1) + " рублей");
        System.out.println("Кристина теперь получает " + (int)(kristina * 1.1) + " рублей. Годовой доход вырос на " + (int)(kristina * 0.1) + " рублей");
    }
}

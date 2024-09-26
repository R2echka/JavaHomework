public class Main {
    public static void main(String[] args) throws Exception {
        int intVar = 2147000000;
        byte byteVar = 126;
        short shortVar = 32766;
        long longVar = -9223372036854775807l;
        float floatVar = -842.427f;
        double doubleVar = 382427.832941;
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        float firstNum = 27.12f;
        long secondNum = 987678965549l;
        float thirdNum = 2.786f;
        short fourthNum = 569;
        short fifthNum = -159;
        short sixthNum = 27897;
        byte seventhNum = 67;

        byte students = 23 + 27 + 30;
        System.out.println("На каждого ученика рассчитано " + 480 / students + " листов бумаги");

        byte speedPerMin = 16 /2;
        int speedPerDay = speedPerMin * 60 * 24;
        System.out.println("За 20 минут машина произвела " + speedPerMin * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + speedPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + speedPerDay * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + speedPerDay * 30 + " штук бутылок");

        byte classes = 120 / (2 + 4);
        System.out.println("В школе, где " + classes + " классов, нужно " + classes * 2 + " банок белой краски и " + classes * 4 + " банок коричневой краски");
        
        byte banana = 80;
        byte milk = 105;
        byte icecream = 100;
        byte egg = 70;
        int breakfast = banana * 5 + milk * 2 + icecream * 2 + egg * 4;
        System.out.println("Спортзавтрак в граммах - " + breakfast);
        System.out.println("Спортзавтрак в килограммах - " + breakfast / 1000);

        short needToLose = 7 * 1000;
        int loses250 = needToLose / 250;
        int loses500 = needToLose / 500;
        System.out.println("Если спортсмен теряет по 250 грамм в день, то ему понадобится " + loses250 + " дней");
        System.out.println("Если спортсмен теряет по 500 грамм в день, то ему понадобится " + loses500 + " дней");
        System.out.println("В среднем спортсмену понадобится " + (loses250 + loses500) / 2 + " дней");

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        System.out.println("Маша теперь получает " + Masha * 1.1 + " рублей. Годовой доход вырос на " + Masha * 0.1 + " рублей");
        System.out.println("Денис теперь получает " + Denis * 1.1 + " рублей. Годовой доход вырос на " + Denis * 0.1 + " рублей");
        System.out.println("Кристина теперь получает " + Kristina * 1.1 + " рублей. Годовой доход вырос на " + Kristina * 0.1 + " рублей");
    }
}

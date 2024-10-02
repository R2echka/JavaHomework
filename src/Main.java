public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        byte age = 20;
        System.out.print("Если возраст человека равен " + age + " лет, то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

        // 2 задание
        byte temp = 0;
        System.out.print("На улице " + temp + " градусов, ");
        if (temp < 5) {
            System.out.println("нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
        }

        //3 задание
        int speed = 129;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        // 4 задание
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (2 <= age && age <= 6) {
            System.out.println(" в детский сад");
        } else if (7 <= age && age <= 17) {
            System.out.println("в школу");
        } else if (18 <= age && age <= 24) {
            System.out.println("в университет");
        } else {
            System.out.println("на работу");    
        }

        // 5 задание
        byte childAge = 10;
        System.out.print("Если возраст ребенка равен " + childAge + ", то ему");
        if (childAge < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (childAge < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }

        // 6 задание
        byte peopleInVagon = 102;
        System.out.print("Если в вагоне " + peopleInVagon + " человек, то в вагоне ");
        if (peopleInVagon < 60) {
            System.out.println("остались сидячие места");
        } else if (peopleInVagon < 102) {
            System.out.println("остались только стоячие места");
        } else {
            System.out.println("не осталось мест");
        }

        //7 задание
        int one = 1, two = 2, three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}

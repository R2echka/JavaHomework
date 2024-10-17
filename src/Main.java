
public class Main {
    // 1 задание
    public static String leapYear(int year) {
        if (year % 400 == 0) {
            return year + " год - високосный";
        } else if (year % 100 == 0) {
            return year + " год - не високосный";
        } else if (year % 4 == 0) {
            return year + " год - високосный";
        } else {
            return year + " год - не високосный";
        }
    }

    // 2 задание
    public static String appVersion(int clientOS, int clientDeviceYear) {
        // В задании написано про текущий год конечно, но допустим
        int currentYear = 2015;
        switch (clientOS) {
            case 0 -> {
                if (clientDeviceYear >= currentYear) {
                    return "Установите версию приложения для iOS по ссылке";
                } else {
                    return "Установите облегченную версию приложения для iOS по ссылке";
                }
            }
            default -> {
                if (clientDeviceYear >= currentYear) {
                    return "Установите версию приложения для Android по ссылке";
                } else {
                    return "Установите облегченную версию приложения для Android по ссылке";
                }
            }
            }
    }

    // 3 задание
    public static String delieveryTime(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance < 20) {
            return "Потребуется дней: " + days;
        } else if (deliveryDistance < 60) {
            days ++;
            return "Потребуется дней: " + days;
        } else if (deliveryDistance < 100) {
            days += 2;
            return "Потребуется дней: " + days;
        } else {
            return "Так далеко доставки нет";
        }
    }

    public static void main(String[] args) throws Exception {
        // 1 задание
        System.out.println(leapYear(2024));
        System.out.println(leapYear(1342));

        // 2 задание
        System.out.println();
        System.out.println(appVersion(1, 2020));
        System.out.println(appVersion(0, 2024));

        // 3 задание
        System.out.println();
        System.out.println(delieveryTime(15));
        System.out.println(delieveryTime(52));
        System.out.println(delieveryTime(60));
        System.out.println(delieveryTime(138));
    }
}

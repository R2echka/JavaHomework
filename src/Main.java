

public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // 2 задание
        short clientDeviceYear = 2015;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } 
                break;
            default:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
        }

        //3 задание
        short year = 2024;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // 4 задание
        byte deliveryDistance = 95;
        byte deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance < 60) {
            deliveryTime ++;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance < 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Так далеко доставки нет");
        }
        // 5 задание
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Зима");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Зима");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Весна");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Весна");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Весна");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Лето");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Лето");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Лето");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Осень");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Осень");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Осень");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону Зима");
                break;
        }
    }
}

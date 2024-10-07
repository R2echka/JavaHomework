
public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        int[] spent = {200, 1429, 20718, 802, 3520};
        int sum = 0;
        for (int i: spent) sum += i;
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");

        // 2 задание
        System.out.println();
        int minSpent = 999999;
        int maxSpent = -1;
        for (int i: spent) {
            if (i > maxSpent) maxSpent = i;
            if (i < minSpent) minSpent = i;
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpent + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpent + " рублей");

        // 3 задание
        System.out.println();
        float avgSpent = (float) sum / (float) spent.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgSpent + " рублей");

        // 4 задание
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}

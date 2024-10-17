
public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        // 2 задание
        System.out.println();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        // 3 задание
        System.out.println();
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName.replace("ё", "е"));
    }
}

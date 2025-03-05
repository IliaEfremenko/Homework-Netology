import java.util.Scanner;


public class Main {

    // Метод, возвращающий количество дней в году
    public static int yearDays(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        }
        return 365;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int days = scanner.nextInt();
            if (yearDays(year) != days) {
                System.out.println("Неправильно! В этом году " + yearDays(year) + " дней!");
                break;
            }
            count++;
        }
        System.out.println("Набрано очков: " + count);
    }
}
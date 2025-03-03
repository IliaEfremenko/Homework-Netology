import java.util.Scanner;

public class Main {

    // УСН доходы
    public static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }

    // УСН доходы минус расходы
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        }
        return 0;
    }

    // Метод программы рассчета наилучшего УСН
    public static void runProgram() {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.next();
            if (input.equals("end")) {
                System.out.println();
                break;
            }

            switch (Integer.parseInt(input)) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    earnings += scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    spendings += scanner.nextInt();
                    break;
                case 3:
                    System.out.println();
                    int tax1 = taxEarnings(earnings);
                    int tax2 = taxEarningsMinusSpendings(earnings, spendings);
                    if (tax1 < tax2) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + tax1 + " рублей");
                        System.out.println("Налог на другой системе: " + tax2 + " рублей");
                        System.out.println("Экономия: " + (tax2 - tax1) + " рублей");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + tax2 + " рублей");
                        System.out.println("Налог на другой системе: " + tax1 + " рублей");
                        System.out.println("Экономия: " + (tax1 - tax2) + " рублей");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        runProgram();
        System.out.println("Программа завершена!");
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {50, 14, 80};
        int[] basket = new int[products.length];
        printProducts(products, prices);

        int sumProducts = 0;
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            int currentPrice = prices[productNumber];

            basket[productNumber] += productCount;

            sumProducts += currentPrice * productCount;
        }
        printBasket(products, prices, basket);
        System.out.println("Итого " + sumProducts + " руб");

    }

    public static void printProducts(String[] products, int[] prices) {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
    }

    public static void printBasket(String[] products, int[] prices, int[] basket) {
        for (int i = 0; i < products.length; i++) {
            if (basket[i] > 0) {
                System.out.println(products[i] + " " + basket[i] + " шт "
                        + prices[i] + " руб/шт "
                        + (prices[i] * basket[i]) + " руб в сумме"
                );
            }
        }
    }
}

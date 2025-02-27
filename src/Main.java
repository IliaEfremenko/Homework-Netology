import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int mass = scanner.nextInt();
        int poshlina = CustomsService.calculateCustoms(price, mass);
        System.out.println("Размер пошлины (в руб.) составит: " + poshlina);
    }
}

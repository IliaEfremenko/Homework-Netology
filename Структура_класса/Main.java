package Структура_класса;

import java.util.Scanner;

public class Main {

    public static void leanMoreAboutBook(Book book) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваш взор сразу же падает на книгу \"" + book.title + "\"...");
        if (book.estimatePrice() <= 3000) {
            System.out.println("Книга, вроде, не такая уж и дорогая.. всего " + book.estimatePrice() + " рублей..");
        } else {
            System.out.println("Книга кажется дорогая.. аж " + book.estimatePrice() + " рублей");
        }
        System.out.println("Вы долистываете до форзаца книги, чтобы посмотреть, осилите ли вы ее и хватит ли у вас времени, и в конце концов, силы воли дочитать книгу до конца");
        if (book.isBig()) {
            System.out.println("Кажется книга большевата.. аж " + book.pages + " страниц");
        } else {
            System.out.println("Кажется книга небольшая.. всего " + book.pages + " страниц");
        }
        System.out.println("Интересно, в а этой книги встречается слово.. \n(Введите слово, которое вы хотите найти):");
        String word = scanner.next();
        if (book.matches(word)) {
            System.out.println("Да, там такое слово есть");
        } else {
            System.out.println("Нет, там такого слова нет");
        }
    }


    public static void main(String[] args) {
        Author author = new Author("Mehmet", "Cevdet", 38);
        Book book = new Book("All tomorrow's", "4.10.2006", author, 308);

        System.out.println("*Наконец вы забретаете в библиотеку*");
        leanMoreAboutBook(book);
    }
}

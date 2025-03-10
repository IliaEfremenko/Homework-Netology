package Структура_класса;

public class Book {
    public String title;
    public String releaseYear;
    public Author author;
    public int pages;

    public Book(String title, String releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        if (title.contains(word)) {
            return true;
        }
        if (author.name.contains(word)) {
            return true;
        }
        if (author.surname.contains(word)) {
            return true;
        }
        return false;
    }

    public int estimatePrice() {
        int price = (int) Math.floor(3 * pages * Math.sqrt(author.rating));
        return Math.max(250, price);
    }
}

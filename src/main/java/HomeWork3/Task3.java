//3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
// в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

package HomeWork3;

import java.util.ArrayList;
import java.util.List;

import static HomeWork2.Task1.isPrime;

public class Task3 {
    public static void main(String[] args) {
        List<Book> books = GetBooks();
        System.out.println("Названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно:");
        for(Book book: books) {
            if(book.author.contains("А") && book.year >= 2010)
            {
                if(isPrime(book.pages)){
                    System.out.println(book.name);
                }
            }
        }
    }

    public static List<Book> GetBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Дом-фантом в приданое", "Устинова", 320.0,1999,351));
        books.add(new Book("Сразу после сотворения мира", "УстиновА", 170.0,2010,349));
        books.add(new Book("Дармоеды в огороде", "Абросимов", 420.0, 1985,637));
        books.add(new Book("Лающие на балконе", "Горностаев", 72.5,2017,270));
        books.add(new Book("Легко ли быть бестолковым", "Александров", 318.0,2022,907));
        books.add(new Book("Жена на год", "Чучелов", 462.5,2014,290));
        return books;
    }

}

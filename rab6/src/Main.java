import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Горе от ума", "Александр Грибоедов", 1824));
        library.addBook(new Book("Ночь перед рождеством", "Николай Гоголь", 1832));
        library.addBook(new Book("Анна Каренина", "Лев Толстой", 1877));
        library.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        library.printAllBooks();
        library.removeBook("Война и мир");
        library.removeBook("Капитал");
        ArrayList<Book> tolstoyBooks = library.findBookByAuthor("Лев Толстой");
        System.out.println("Книги автора Лев Толстой:");
        Iterator var3 = tolstoyBooks.iterator();

        while(var3.hasNext()) {
            Book book = (Book)var3.next();
            System.out.println(book.toString());
        }

        library.printAllBooks();
    }
}
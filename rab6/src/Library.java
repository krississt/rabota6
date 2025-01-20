import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    ArrayList<Book> books = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Книга " + book.title + " добавлена в библиотеку. ");
    }

    public void removeBook(String title) {
        for(int i = 0; i < this.books.size(); ++i) {
            if (((Book)this.books.get(i)).title.equals(title)) {
                this.books.remove(i);
                System.out.println("Книга " + title + " удалена из библиотеки.");
                return;
            }
        }

        System.out.println("Книга " + title + " не найдена в библиотеке.");
    }

    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> result = new ArrayList();
        Iterator var3 = this.books.iterator();

        while(var3.hasNext()) {
            Book book = (Book)var3.next();
            if (book.author.equals(author)) {
                result.add(book);
            }
        }

        return result;
    }

    public void printAllBooks() {
        if (this.books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            System.out.println("Список всех книг в библиотеке:");
            Iterator var1 = this.books.iterator();

            while(var1.hasNext()) {
                Book book = (Book)var1.next();
                System.out.println(book.toString());
            }
        }

    }
}


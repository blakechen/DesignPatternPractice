package idv.blake.teddy;

import com.sun.source.tree.WhileLoopTree;
import org.junit.Test;

import java.util.Iterator;

public class IteratorTest {

    @Test
    public void testJava5IteratorableSupportsForEach() {
        BookList booksList = new BookList();
        booksList.addBook(new Book("Name1","author1","publisher1"));
        booksList.addBook(new Book("Name2","author2","publisher2"));
        booksList.addBook(new Book("Name3","author3","publisher3"));
        booksList.addBook(new Book("Name4","author4","publisher4"));
        booksList.addBook(new Book("Name5","author5","publisher5"));

        for (Iterator<Book> iterator = booksList.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("===================================");

        Iterator<Book> iterator = booksList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("===================================");
        for (Book book : booksList) {
            System.out.println(book.toString());
        }
    }
}

package idv.blake.teddy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookList implements Iterable<Book> {
    private List<Book> list;

    public BookList() {
        list = new LinkedList<Book>();
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookInterator(list);
    }
}

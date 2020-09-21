package idv.blake.teddy;

import java.util.Iterator;
import java.util.List;

public class BookInterator implements Iterator<Book> {

    private int position = 0;
    private List<Book> list;

    public BookInterator(List<Book> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position < list.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (this.hasNext()) {
            return list.get(position++);
        } else {
            throw new RuntimeException("End of book list");
        }
    }

    @Override
    public void remove() {
        throw new RuntimeException("Does not support remove operator");
    }
}

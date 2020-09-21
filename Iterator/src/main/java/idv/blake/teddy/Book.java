package idv.blake.teddy;

import com.sun.source.tree.LambdaExpressionTree;

public class Book {
    String name;
    String author;
    String publisher;

    public Book(String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

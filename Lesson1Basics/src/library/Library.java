package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    List books = new ArrayList();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List getBooks() {
        return books;
    }

    void addBook(Book b){
        books.add(b);
    }

    void removeBook(Book b){
        books.remove(b);
    }
}

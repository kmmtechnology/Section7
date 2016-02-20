package com.demo.section7;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 26-Jan-16.
 */
public class BookStore {

    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("aaaa1", "aa1"));
        books.add(new Book("aaaa2", "aa2"));
        books.add(new Book("aaaa3", "aa3"));
        books.add(new Book("aaaa4", "aa4"));
        books.add(new Book("aaaa5", "aa5"));
        books.add(new Book("aaaa6", "aa6"));
        return books;
    }


}

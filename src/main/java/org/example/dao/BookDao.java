package org.example.dao;

import org.example.model.Book;

public interface BookDao {
    void save(Book book);

    Book findBookById(int id);

    void updateBook(int id);

    boolean delete(int id);
}

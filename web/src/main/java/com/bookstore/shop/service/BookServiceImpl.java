/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 18:33
 */

package com.bookstore.shop.service;

import com.bookstore.shop.business.BookFactory;
import com.bookstore.shop.persistence.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookFactory bookFactory;

    @Autowired
    public BookServiceImpl(BookFactory bookFactory) {
        this.bookFactory = bookFactory;
    }

    @Override
    public Book create(Book book) {
        return bookFactory.create(book);
    }

    @Override
    public void delete(Long id) {

        bookFactory.delete(id);

    }

    @Override
    public Book update(Book book) {
        return bookFactory.update(book);
    }

    @Override
    public Book getBook(Long id) {
        return bookFactory.getBook(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookFactory.getAllBooks();
    }

    @Override
    public List<Book> getBooksByCategoryId(Long id) {
        return bookFactory.getBooksByCategoryId(id);
    }

    @Override
    public List<Book> getThreeRandomBooks() {

        List<Book> myList = bookFactory.getAllBooks();
        Collections.shuffle(myList);

        int randomBooksLimit = 3;

        return myList.subList(0, randomBooksLimit);
    }
}

/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 18:26
 */

package com.bookstore.shop.service;

import com.bookstore.shop.persistence.entity.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);
    void delete(Long id);
    Book update(Book book);

    Book getBook(Long id);
    List<Book> getAllBooks();
    List<Book> getBooksByCategoryId(Long id);

    List<Book> getThreeRandomBooks();
}

/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 18:37
 */

package com.bookstore.shop.business;

import com.bookstore.shop.persistence.entity.Book;

import java.util.List;

public interface BookFactory {
    Book create(Book book);
    void delete(Long id);
    Book update(Book book);

    Book getBook(Long id);
    List<Book> getAllBooks();
    List<Book> getBooksByCategoryId(Long id);
}

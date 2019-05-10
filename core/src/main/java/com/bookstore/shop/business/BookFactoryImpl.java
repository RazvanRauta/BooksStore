/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 18:38
 */

package com.bookstore.shop.business;

import com.bookstore.shop.persistence.entity.Book;
import com.bookstore.shop.persistence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookFactoryImpl implements BookFactory {

    private final BookRepository bookRepository;

    @Autowired
    public BookFactoryImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {
       return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
         bookRepository.deleteById(id);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBook(Long id) {
        return bookRepository.getOne(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getBooksByCategoryId(Long id) {
        return bookRepository.findByCategory_Id(id);
    }
}

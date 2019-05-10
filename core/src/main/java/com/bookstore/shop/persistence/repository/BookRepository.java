/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 18:41
 */

package com.bookstore.shop.persistence.repository;

import com.bookstore.shop.persistence.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByCategory_Id(Long category_id);
}

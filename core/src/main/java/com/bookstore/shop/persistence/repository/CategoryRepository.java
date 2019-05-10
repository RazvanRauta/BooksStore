/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 18:41
 */

package com.bookstore.shop.persistence.repository;

import com.bookstore.shop.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

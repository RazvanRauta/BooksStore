/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 11:45
 */

package com.bookstore.shop.business;

import com.bookstore.shop.persistence.entity.Category;

import java.util.List;

public interface CategoryFactory {
    Category create(Category category);

    void delete(Long id);

    Category update(Category category);

    Category getCategory(Long id);

    List<Category> getAllCategories();
}

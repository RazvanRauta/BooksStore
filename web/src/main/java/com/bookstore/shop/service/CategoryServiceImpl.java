/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 16:47
 */

package com.bookstore.shop.service;

import com.bookstore.shop.business.CategoryFactory;
import com.bookstore.shop.persistence.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryFactory categoryFactory;

    @Autowired
    public CategoryServiceImpl(CategoryFactory categoryFactory) {
        this.categoryFactory = categoryFactory;
    }

    @Override
    public Category create(Category category) {
        return categoryFactory.create(category);
    }

    @Override
    public void delete(Long id) {
        categoryFactory.delete(id);
    }

    @Override
    public Category update(Category category) {
        return categoryFactory.update(category);
    }

    @Override
    public Category getCategory(Long id) {
        return categoryFactory.getCategory(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryFactory.getAllCategories();
    }
}

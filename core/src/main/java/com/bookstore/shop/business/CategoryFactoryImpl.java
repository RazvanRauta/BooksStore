/**
 * @author: Razvan Rauta
 * Date: 13.05.2019
 * Time: 16:49
 */

package com.bookstore.shop.business;

import com.bookstore.shop.persistence.entity.Category;
import com.bookstore.shop.persistence.repository.CategoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryFactoryImpl implements CategoryFactory {

    private final CategoryRepository categoryRepository;

    public CategoryFactoryImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}

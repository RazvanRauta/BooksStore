/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 15:46
 */

package com.bookstore.shop.controller;

import com.bookstore.shop.persistence.entity.Book;
import com.bookstore.shop.service.BookService;
import com.bookstore.shop.service.CategoryService;
import com.bookstore.shop.util.AttributeNames;
import com.bookstore.shop.util.ShopMappings;
import com.bookstore.shop.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ShopController {

    // == fields ==
    private final BookService bookService;
    private final CategoryService categoryService;


    // == constructor ==
    @Autowired
    public ShopController(BookService bookService, CategoryService categoryService) {
        this.bookService = bookService;
        this.categoryService = categoryService;
    }


    // == request methods==

    @GetMapping({ShopMappings.HOME, "/home"})
    public String home(Model model) {

        model.addAttribute(AttributeNames.RANDOM_BOOKS, bookService.getThreeRandomBooks());
        model.addAttribute(AttributeNames.ALL_BOOKS,bookService.getAllBooks());

        return ViewNames.HOME;
    }

    @GetMapping(ShopMappings.LOGIN)
    public String login(Model model) {
        return ViewNames.LOGIN;
    }

    @GetMapping(ShopMappings.ADD_BOOK)
    public String addBook(Model model) {


        model.addAttribute(AttributeNames.ALL_CATEGORIES, categoryService.getAllCategories());
        model.addAttribute("book", new Book());
        return ViewNames.ADD_BOOK;
    }

    @PostMapping(ShopMappings.ADD_BOOK_ACTION)
    public String addBookAction(@ModelAttribute Book book) {
        book.getCategory();
        bookService.create(book);
        return ShopMappings.REDIRECT_HOME;
    }

}

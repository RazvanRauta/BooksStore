/**
 * @author: Razvan Rauta
 * Date: 10.05.2019
 * Time: 15:46
 */

package com.bookstore.shop.controller;

import com.bookstore.shop.service.BookService;
import com.bookstore.shop.util.AttributeNames;
import com.bookstore.shop.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ShopController {

    // == fields ==
    private final BookService bookService;


    // == constructor ==
    public ShopController(BookService bookService) {
        this.bookService = bookService;
    }


    // == request methods==

    @GetMapping({"/","home"})
    public String home(Model model){

        model.addAttribute(AttributeNames.ALL_BOOKS,bookService.getAllBooks());

        return ViewNames.HOME;
    }
}

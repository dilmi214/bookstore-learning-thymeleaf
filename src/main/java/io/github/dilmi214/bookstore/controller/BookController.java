package io.github.dilmi214.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book-register")
    public String bookRegister(){
        return "bookRegister";
    }

    @GetMapping("/available-books")
    public String getAllBooks(){
        return "bookList";
    }
}

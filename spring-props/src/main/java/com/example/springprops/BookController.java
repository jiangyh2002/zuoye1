package com.example.springprops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {
    @Resource
    private Book book;
    @GetMapping("/book")
    public  String get(){
        return book.toString();
    }
}

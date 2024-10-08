package myproject.bookreview.domain.controller;

import myproject.bookreview.domain.dto.BookDTO;
import myproject.bookreview.domain.handler.BookDataHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    BookService


    @PostMapping("/add-Book")
    public BookDTO addBook(@RequestBody BookDTO bookDTO){

    }
}

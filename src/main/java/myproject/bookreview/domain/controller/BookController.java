package myproject.bookreview.domain.controller;

import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.dto.BookDto;
import myproject.bookreview.domain.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/addBook")
    public BookDto addBook(@RequestBody BookDto bookDTO){
        String bookName = bookDTO.getBookName();
        String author = bookDTO.getAuthor();
//        Instant createdAt = bookDTO.getCreatedAt();

        return bookService.bookSave(bookDTO);
    }
}

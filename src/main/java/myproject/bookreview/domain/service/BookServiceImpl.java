package myproject.bookreview.domain.service;

import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.dto.BookDto;
import myproject.bookreview.domain.handler.BookDataHandler;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{


    private final BookDataHandler bookDataHandler;

    @Override
    public BookDto bookSave(BookDto bookDTO) {
        String bookName = bookDTO.getBookName();
        String author = bookDTO.getAuthor();
//        Instant createdAt = bookDTO.getCreatedAt();

//        bookDataHandler.bookSave(bookName, author, createdAt);
        bookDataHandler.bookSave(bookName, author);

        return bookDTO;
    }

    @Override
    public BookDto bookFind(String bookName) {
        return null;
    }

    @Override
    public BookDto bookList() {
        return null;
    }
}

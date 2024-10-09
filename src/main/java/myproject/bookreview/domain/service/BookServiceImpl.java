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

    // 이건 왜 dto로 받았는지, 근데 오류는 안나는데 String으로 받을지는 고민 다시 해보자.
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

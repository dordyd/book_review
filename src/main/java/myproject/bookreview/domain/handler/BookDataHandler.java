package myproject.bookreview.domain.handler;

import myproject.bookreview.domain.entity.BookEntity;

import java.time.Instant;

public interface BookDataHandler {
//    BookEntity bookSave(String bookName, String author, Instant createdAt);
    BookEntity bookSave(String bookName, String author);
}

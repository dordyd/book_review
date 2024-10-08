package myproject.bookreview.domain.service;

import myproject.bookreview.domain.dto.BookDto;

public interface BookService {

    BookDto bookSave(BookDto bookDTO);

    BookDto bookFind(String bookName);

    BookDto bookList();
}

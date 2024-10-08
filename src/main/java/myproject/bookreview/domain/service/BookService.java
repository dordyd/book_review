package myproject.bookreview.domain.service;

import myproject.bookreview.domain.dto.BookDTO;

public interface BookService {

    BookDTO bookSave(BookDTO bookDTO);

    BookDTO bookFind(String bookName);

    BookDTO bookList();
}

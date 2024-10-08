package myproject.bookreview.domain.dao;

import myproject.bookreview.domain.entity.BookEntity;

public interface BookDao {
    BookEntity saveBook(BookEntity bookEntity);
}

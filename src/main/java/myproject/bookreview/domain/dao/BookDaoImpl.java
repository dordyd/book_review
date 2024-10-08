package myproject.bookreview.domain.dao;

import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.entity.BookEntity;
import myproject.bookreview.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao{

    private final BookRepository bookRepository;

    @Override
    public BookEntity saveBook(BookEntity bookEntity) {
        bookRepository.save(bookEntity);
        return bookEntity;
    }
}

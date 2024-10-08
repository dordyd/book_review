package myproject.bookreview.domain.handler;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.dao.BookDao;
import myproject.bookreview.domain.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Transactional
@RequiredArgsConstructor
public class BookDataHandlerImpl implements BookDataHandler{

    private final BookDao bookDao;
    private Long sequence = 0L;

    @Override
    public BookEntity bookSave(String bookName, String author) {
        BookEntity bookEntity = BookEntity.builder()
                .bookId(sequence++)
                .bookName(bookName)
                .author(author)
                .createdAt(Instant.now())
                .build();

        return bookDao.saveBook(bookEntity);
    }
//    public BookEntity bookSave(String bookName, String author, Instant createdAt) {
//        BookEntity bookEntity = BookEntity.builder()
//                .bookId(sequence++)
//                .bookName(bookName)
//                .author(author)
//                .createdAt(createdAt)
//                .build();
//
//        return bookDao.saveBook(bookEntity);
//    }
}

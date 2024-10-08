package myproject.bookreview.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Entity
@Getter
@ToString
public class BookEntity {

    @Id
    private Long bookId;

    private String bookName;
    private String author;
    private Instant createdAt;

    @Builder
    public BookEntity(Long bookId, String bookName, String author, Instant createdAt){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.createdAt = createdAt;
    }

    public BookEntity() {

    }
}

package myproject.bookreview.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import myproject.bookreview.domain.Genre;

import java.time.Instant;

@Entity
@Getter
@ToString
public class BookEntity {

    @Id @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    private String bookName;
    private String author;
    private Instant createdAt;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Builder
    public BookEntity(Long id, String bookName, String author, Instant createdAt){
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.createdAt = createdAt;
    }

    public BookEntity() {

    }
}

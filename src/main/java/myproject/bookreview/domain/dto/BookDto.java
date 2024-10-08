package myproject.bookreview.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class BookDto {
    private String bookName;
    private String Author;
//    private Instant createdAt;
}

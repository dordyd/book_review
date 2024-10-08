package myproject.bookreview.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Data
@AllArgsConstructor
public class BookDTO {
    private String bookName;
    private String Author;
    private Instant createdAt;
}

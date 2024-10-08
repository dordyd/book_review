package myproject.bookreview.domain.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import myproject.bookreview.domain.user.Gender;

@Entity
@Getter
@Table(name = "member")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {
    @Id
    private Long userId;

    private String username, password, nickname;
    private Integer age;
    private Gender gender;
}

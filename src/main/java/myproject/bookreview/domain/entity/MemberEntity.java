package myproject.bookreview.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import myproject.bookreview.domain.Gender;

@Entity
@Getter
@Table(name = "member")
@NoArgsConstructor
@ToString
public class MemberEntity {
    @Id
    private Long userId;

    private String memberId, username, nickname, password;
    private Integer age;
    private Gender gender;


    @Builder
    public MemberEntity(Long userId, String memberId, String username, String nickname, String password, Integer age, Gender gender) {
        this.userId = userId;
        this.memberId = memberId;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }
}

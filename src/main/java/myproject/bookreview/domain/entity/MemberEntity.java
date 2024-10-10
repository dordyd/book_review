package myproject.bookreview.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import myproject.bookreview.domain.Gender;
import myproject.bookreview.domain.Genre;

@Entity
@Getter
@Table(name = "member")
@NoArgsConstructor
@ToString
public class MemberEntity {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;
    private String nickname;
    private String password;
    private Integer age;
    private Gender gender;

    @Enumerated(EnumType.ORDINAL)
    private Gender gender;


    @Builder
    public MemberEntity(Long id, String username, String nickname, String password, Integer age, Gender gender) {
        this.id = id;;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }
}

package myproject.bookreview.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import myproject.bookreview.domain.Gender;

@Data
@AllArgsConstructor
public class MemberDto {
//    private Long userId;
    private String memberId;
    private String username;
    private String nickname;
    private String password;
    private int age;
    private Gender gender;

//    public MemberEntity toEntity(){
//        return MemberEntity.builder()
//                .userId(userId)
//                .username(username)
//                .password(password)
//                .nickname(nickname)
//                .age(age)
//                .gender(gender).build();
//    }
}

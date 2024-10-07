package myproject.bookreview.domain.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserDTO {
    private final String userId;
    private final String username;
    private final String password;
    private String nickname;
    private int age;
    private Gender gender;
}

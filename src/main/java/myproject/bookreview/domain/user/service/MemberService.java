package myproject.bookreview.domain.user.service;

import myproject.bookreview.domain.user.Gender;
import myproject.bookreview.domain.user.dto.MemberDTO;

public interface MemberService {

    MemberDTO saveMember(Long userId, String username, String nickname,
                         String password, int age, Gender gender);
}

package myproject.bookreview.domain.service;

import myproject.bookreview.domain.dto.MemberDTO;
import myproject.bookreview.domain.Gender;

public interface MemberService {

    MemberDTO saveMember(String memberId, String username, String nickname,
                         String password, int age, Gender gender);

    MemberDTO findMemberByName(Long userId);
}

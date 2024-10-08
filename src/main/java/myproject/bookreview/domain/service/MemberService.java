package myproject.bookreview.domain.service;

import myproject.bookreview.domain.dto.MemberDto;
import myproject.bookreview.domain.Gender;

public interface MemberService {

    MemberDto saveMember(String memberId, String username, String nickname,
                         String password, int age, Gender gender);

    MemberDto findMemberByName(Long userId);
}

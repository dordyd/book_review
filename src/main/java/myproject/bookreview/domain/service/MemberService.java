package myproject.bookreview.domain.service;

import myproject.bookreview.domain.dto.MemberDto;
import myproject.bookreview.domain.Gender;

public interface MemberService {

    MemberDto saveMember(MemberDto memberDto);

    MemberDto findMemberByName(Long userId);
}

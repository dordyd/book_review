package myproject.bookreview.domain.handler;

import myproject.bookreview.domain.dto.MemberDto;
import myproject.bookreview.domain.entity.MemberEntity;
import myproject.bookreview.domain.Gender;

public interface MemberDataHandler {

    MemberEntity saveMemberEntity(MemberDto memberDto);

    MemberEntity findMember(Long userId);
}

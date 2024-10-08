package myproject.bookreview.domain.handler;

import myproject.bookreview.domain.dto.MemberDTO;
import myproject.bookreview.domain.entity.MemberEntity;
import myproject.bookreview.domain.Gender;

public interface MemberDataHandler {

    public MemberEntity saveMemberEntity(String memberId, String username, String nickname,
                                         String password, int age, Gender gender);

    MemberEntity findMember(Long userId);
}

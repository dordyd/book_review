package myproject.bookreview.domain.user.handler;

import myproject.bookreview.domain.user.Gender;
import myproject.bookreview.domain.user.entity.MemberEntity;

public interface MemberDataHandler {

    public MemberEntity saveMemberEntity(Long userId, String username, String nickname,
                                         String password, int age, Gender gender);
}

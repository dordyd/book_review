package myproject.bookreview.domain.user.service;

import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.repository.MemberRepository;
import myproject.bookreview.domain.user.Gender;
import myproject.bookreview.domain.user.dto.MemberDTO;
import myproject.bookreview.domain.user.entity.MemberEntity;
import myproject.bookreview.domain.user.handler.MemberDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    MemberDataHandler memberDataHandler;

    @Autowired
    public MemberServiceImpl(MemberDataHandler memberDataHandler) {
        this.memberDataHandler = memberDataHandler;
    }

    @Override
    public MemberDTO saveMember(Long userId, String username, String nickname, String password, int age, Gender gender) {
        MemberEntity memberEntity = memberDataHandler.saveMemberEntity(userId, username,
                nickname, password, age, gender);

        MemberDTO memberDTO = new MemberDTO(memberEntity.getUserId(),
                memberEntity.getUsername(),
                memberEntity.getNickname(),
                memberEntity.getPassword(),
                memberEntity.getAge(),
                memberEntity.getGender());

        return memberDTO;
    }
}

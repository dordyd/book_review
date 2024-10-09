package myproject.bookreview.domain.handler;

import jakarta.transaction.Transactional;
import myproject.bookreview.domain.dao.MemberDao;
import myproject.bookreview.domain.dto.MemberDto;
import myproject.bookreview.domain.entity.MemberEntity;
import myproject.bookreview.domain.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberDataHandlerImpl implements MemberDataHandler {

    MemberDao memberDAO;
    private Long sequence = 0L;

    @Autowired
    public MemberDataHandlerImpl(MemberDao memberDAO) {
        this.memberDAO = memberDAO;
    }

//    @Override
//    public MemberEntity saveMemberEntity(String memberId, String username, String nickname,
//                                         String password, int age, Gender gender) {
////        MemberEntity memberEntity = new MemberEntity(++sequence, memberId, username,
////                nickname, password, age, gender);
//        MemberEntity memberEntity = MemberEntity.builder()
//                .userId(++sequence)
//                .memberId(memberId)
//                .username(username)
//                .nickname(nickname)
//                .password(password)
//                .age(age)
//                .gender(gender)
//                .build();
//
//        return memberDAO.saveMember(memberEntity);
//    }

    @Override
    public MemberEntity saveMemberEntity(MemberDto memberDto) {
        MemberEntity memberEntity = MemberEntity.builder()
                .userId(++sequence)
                .memberId(memberDto.getMemberId())
                .username(memberDto.getUsername())
                .nickname(memberDto.getNickname())
                .password(memberDto.getPassword())
                .age(memberDto.getAge())
                .gender(memberDto.getGender())
                .build();
        return memberDAO.saveMember(memberEntity);
    }

    @Override
    public MemberEntity findMember(Long userId) {
        return memberDAO.findMember(userId);
    }
}

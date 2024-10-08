package myproject.bookreview.domain.handler;

import jakarta.transaction.Transactional;
import myproject.bookreview.domain.dao.MemberDAO;
import myproject.bookreview.domain.dto.MemberDTO;
import myproject.bookreview.domain.entity.MemberEntity;
import myproject.bookreview.domain.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberDataHandlerImpl implements MemberDataHandler {

    MemberDAO memberDAO;
    private Long sequence = 0L;

    @Autowired
    public MemberDataHandlerImpl(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public MemberEntity saveMemberEntity(String memberId, String username, String nickname, String password, int age, Gender gender) {
        MemberEntity memberEntity = new MemberEntity(++sequence, memberId, username,
                nickname, password, age, gender);

        return memberDAO.saveMember(memberEntity);
    }

    @Override
    public MemberEntity findMember(Long userId) {
        return memberDAO.findMember(userId);
    }
}

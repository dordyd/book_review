package myproject.bookreview.domain.user.handler;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.user.Gender;
import myproject.bookreview.domain.user.dao.MemberDAO;
import myproject.bookreview.domain.user.dao.MemberDaoImpl;
import myproject.bookreview.domain.user.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MemberDataHandlerImpl implements MemberDataHandler {

    MemberDAO memberDAO;

    @Autowired
    public MemberDataHandlerImpl(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    @Override
    public MemberEntity saveMemberEntity(Long userId, String username, String nickname, String password, int age, Gender gender) {
        MemberEntity memberEntity = new MemberEntity(userId, username,
                nickname, password, age, gender);

        return memberDAO.saveMember(memberEntity);
    }
}

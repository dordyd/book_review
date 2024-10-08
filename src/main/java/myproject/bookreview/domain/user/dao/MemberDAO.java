package myproject.bookreview.domain.user.dao;

import myproject.bookreview.domain.user.entity.MemberEntity;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface MemberDAO {

    MemberEntity saveMember(MemberEntity member);

    MemberEntity findMember(Long id) throws ChangeSetPersister.NotFoundException;
}

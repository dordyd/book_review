package myproject.bookreview.domain.dao;

import myproject.bookreview.domain.entity.MemberEntity;


public interface MemberDao {

    MemberEntity saveMember(MemberEntity member);

    MemberEntity findMember(Long id) ;
}

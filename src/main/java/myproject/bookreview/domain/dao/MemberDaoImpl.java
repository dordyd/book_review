package myproject.bookreview.domain.dao;

import myproject.bookreview.domain.entity.MemberEntity;
import myproject.bookreview.domain.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDaoImpl implements MemberDAO {
    MemberRepository memberRepository;

    @Autowired
    public MemberDaoImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberEntity saveMember(MemberEntity memberEntity) {
        memberRepository.save(memberEntity);
        return memberEntity;
    }

    @Override
    public MemberEntity findMember(Long userId) {
        return memberRepository.findById(userId).
                orElseThrow(() -> new IllegalArgumentException("no data"));
    }


}

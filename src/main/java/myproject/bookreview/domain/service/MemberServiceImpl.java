package myproject.bookreview.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.bookreview.domain.dto.MemberDto;
import myproject.bookreview.domain.entity.MemberEntity;
import myproject.bookreview.domain.handler.MemberDataHandler;
import myproject.bookreview.domain.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    MemberDataHandler memberDataHandler;

    @Override
    public MemberDto saveMember(MemberDto memberDto) {
        MemberEntity memberEntity = memberDataHandler.saveMemberEntity(memberDto);

        MemberDto memberDTO = new MemberDto(
                memberEntity.getMemberId(),
                memberEntity.getUsername(),
                memberEntity.getNickname(),
                memberEntity.getPassword(),
                memberEntity.getAge(),
                memberEntity.getGender());

        return memberDTO;
    }

    @Override
    public MemberDto findMemberByName(Long userId) {
        MemberEntity memberEntity = memberDataHandler.findMember(userId);

        MemberDto memberDTO = new MemberDto(
                memberEntity.getMemberId(),
                memberEntity.getUsername(),
                memberEntity.getNickname(),
                memberEntity.getPassword(),
                memberEntity.getAge(),
                memberEntity.getGender()
                );
        log.info("service // userId={}", userId);
        return memberDTO;
    }
}

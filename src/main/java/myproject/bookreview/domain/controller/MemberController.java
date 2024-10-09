package myproject.bookreview.domain.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.bookreview.domain.dto.MemberDto;
import myproject.bookreview.domain.service.MemberService;
import myproject.bookreview.domain.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    MemberService memberService;


//    @PostMapping("/sign-up")
//    public String memgerSignUp(@RequestBody MemberDTO memberDTO){
//
//        Long userId = memberDTO.getUserId();
//        String username = memberDTO.getUsername();
//        String nickname = memberDTO.getNickname();
//        String password = memberDTO.getPassword();
//        int age = memberDTO.getAge();
//        Gender gender = memberDTO.getGender();
//
////        MemberEntity member = new MemberEntity(userId, username,
////                password, nickname, age, gender);
//
//        return memberService.saveMember(userId, username, nickname,
//                password, age, gender);
//    }
    @PostMapping("/sign-up")
    public MemberDto memberSignUp(@RequestBody MemberDto memberDTO){
        return memberService.saveMember(memberDTO);
    }
//    @GetMapping

    @GetMapping("/getMemberId/{userId}")
    public MemberDto findMember(@PathVariable Long userId){
        log.info("Controller // id={}", userId);
        return memberService.findMemberByName(userId);
    }


}

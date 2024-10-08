package myproject.bookreview.domain.user.controller;

import lombok.RequiredArgsConstructor;
import myproject.bookreview.domain.user.Gender;
import myproject.bookreview.domain.user.dao.MemberDAO;
import myproject.bookreview.domain.user.dto.MemberDTO;
import myproject.bookreview.domain.user.entity.MemberEntity;
import myproject.bookreview.domain.user.service.MemberService;
import myproject.bookreview.domain.user.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

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
    public MemberDTO memgerSignUp(@RequestBody MemberDTO memberDTO){

        Long userId = memberDTO.getUserId();
        String username = memberDTO.getUsername();
        String nickname = memberDTO.getNickname();
        String password = memberDTO.getPassword();
        int age = memberDTO.getAge();
        Gender gender = memberDTO.getGender();

//        MemberEntity member = new MemberEntity(userId, username,
//                password, nickname, age, gender);

        return memberService.saveMember(userId, username, nickname,
                password, age, gender);
    }
//    @GetMapping


}

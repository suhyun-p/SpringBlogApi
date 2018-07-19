package com.springblog.api.controller.api;

import com.springblog.api.domain.Member;
import com.springblog.api.dto.member.MemberJoinRequest;
import com.springblog.api.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Members")
public class MemberApiController {

    @Autowired
    MemberService memberService;

    @PostMapping(path = "joinMember")
    public ResponseEntity<Member> join(@Valid MemberJoinRequest memberJoinRequest) throws IOException {
        Member member = new Member();
        BeanUtils.copyProperties(memberJoinRequest, member);

        Member newMember = memberService.addMember(member);
        return new ResponseEntity<>(newMember, HttpStatus.OK);
    }

    @GetMapping("/getMemberByMemberNo/{memberNo}")
    public ResponseEntity<Member> getMemberByMemberNo(@PathVariable(name="memberNo") Long memberNo){
        Member member = memberService.getMemberByMemberNo(memberNo);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @GetMapping("/getMemberByMemberId/{memberId}")
    public ResponseEntity<Member> getMemberByMemberId(@PathVariable(name="memberId") String memberId){
        Member member = memberService.getMemberByMemberId(memberId);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @GetMapping("/getMembersAll")
    public ResponseEntity<List<Member>> getMembersAll(){
        List<Member> members = memberService.getMembersAll();
        return new ResponseEntity<>(members, HttpStatus.OK);
    }
}

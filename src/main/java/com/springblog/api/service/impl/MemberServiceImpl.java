package com.springblog.api.service.impl;

import com.springblog.api.domain.Member;
import com.springblog.api.repository.MemberRepository;
import com.springblog.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    @Transactional
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member getMemberByMemberNo(Long memberNo) {
        return memberRepository.findMemberByMemberNo(memberNo);
    }

    @Override
    public Member getMemberByMemberId(String memberId) {
        return memberRepository.findMemberByMemberId(memberId);
    }

    @Override
    public List<Member> getMembersAll() {
        return  memberRepository.findAll();
    }

    @Override
    @Transactional
    public Member modifyMember(Member member) {
        return null;
    }

    @Override
    @Transactional
    public Member deleteMember(String memberId) {
        return null;
    }
}

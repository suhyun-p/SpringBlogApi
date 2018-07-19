package com.springblog.api.service;

import com.springblog.api.domain.Member;

import java.util.List;

public interface MemberService {
    public Member addMember(Member member);

    public Member getMemberByMemberNo(Long memberNo);
    public Member getMemberByMemberId(String memberId);
    public List<Member> getMembersAll();

    public Member modifyMember(Member member);

    public Member deleteMember(String memberId);
}

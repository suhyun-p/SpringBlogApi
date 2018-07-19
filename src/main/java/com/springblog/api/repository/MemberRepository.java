package com.springblog.api.repository;

import com.springblog.api.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findMemberByMemberNo(Long memberNo);
    public Member findMemberByMemberId(String memberId);
}

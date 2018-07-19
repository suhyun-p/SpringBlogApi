package com.springblog.api.repository;

import com.springblog.api.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    public Post findPostByPostNo(Long postNo);
    public List<Post> findPostsByRegMemberId(String regMemberId);
}

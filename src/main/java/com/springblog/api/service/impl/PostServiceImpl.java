package com.springblog.api.service.impl;

import com.springblog.api.domain.Post;
import com.springblog.api.repository.PostRepository;
import com.springblog.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    @Transactional
    public Post writePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPost(Long postNo) {
        return postRepository.findPostByPostNo(postNo);
    }

    @Override
    public List<Post> getPostsByRegMemberId(String regMemberId) {
        return postRepository.findPostsByRegMemberId(regMemberId);
    }

    @Override
    public List<Post> getPostsAll(){
        return postRepository.findAll();
    }

    @Override
    @Transactional
    public Post modifyPost(Post post) {
        return null;
    }

    @Override
    @Transactional
    public Post deletePost(Long postNo) {
        return null;
    }
}

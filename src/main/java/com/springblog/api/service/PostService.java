package com.springblog.api.service;

import com.springblog.api.domain.Post;

import java.util.List;

public interface PostService {
    public Post writePost(Post post);

    public Post getPost(Long postNo);
    public List<Post> getPostsByRegMemberId(String regMemberId);
    public List<Post> getPostsAll();

    public Post modifyPost(Post post);

    public Post deletePost(Long postNo);

}

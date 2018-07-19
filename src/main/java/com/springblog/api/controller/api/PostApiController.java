package com.springblog.api.controller.api;

import com.springblog.api.domain.Member;
import com.springblog.api.domain.Post;
import com.springblog.api.dto.post.WritePostRequest;
import com.springblog.api.service.PostService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Posts")
public class PostApiController {

    @Autowired
    PostService postService;

    @PostMapping(path = "writePost")
    public ResponseEntity<Post> join(@Valid WritePostRequest writePostRequest) throws IOException {
        Post post = new Post();
        BeanUtils.copyProperties(writePostRequest, post);

        Post newPost = postService.writePost(post);
        return new ResponseEntity<Post>(newPost, HttpStatus.OK);
    }

    @GetMapping("/getPostByPostNo/{postNo}")
    public ResponseEntity<Post> getPostByPostNo(@PathVariable(name="postNo") Long postNo){
        Post post = postService.getPost(postNo);
        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @GetMapping("/getPostsByRegMemberId/{regMemberId}")
    public ResponseEntity<List<Post>> getPostsByRegMemberId(@PathVariable(name="regMemberId") String regMemberId){
        List<Post> posts = postService.getPostsByRegMemberId(regMemberId);
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping("/getPostsAll")
    public ResponseEntity<List<Post>> getPostsAll(){
        List<Post> posts = postService.getPostsAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
}

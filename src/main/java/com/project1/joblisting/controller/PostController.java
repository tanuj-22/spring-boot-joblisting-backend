package com.project1.joblisting.controller;

import com.project1.joblisting.repository.PostRepository;
import com.project1.joblisting.model.Post;
import com.project1.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping(value = "/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @PostMapping(value = "/insert")
    public Post addPost(@RequestBody Post post){
       return repo.save(post);
    }

    @GetMapping(value = "/posts/{text}" )
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }


}

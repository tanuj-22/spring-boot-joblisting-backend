package com.project1.joblisting.repository;

import com.project1.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);
}

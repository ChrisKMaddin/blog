package com.example.blog.services;


import com.example.blog.models.Post;
import com.example.blog.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository PostRepository;



    public void save(Post post) {
        PostRepository.save(post);
    }

    public Iterable<Post> findAll() {
        return PostRepository.findAll();
    }

    public Post findOne(long id) {
        return PostRepository.findOne(id);
    }

    public void delete(long id) {
        PostRepository.delete(id);
    }
}
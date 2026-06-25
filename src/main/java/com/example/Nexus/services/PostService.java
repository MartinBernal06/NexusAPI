package com.example.Nexus.services;

import com.example.Nexus.dto.PostRequest;
import com.example.Nexus.models.Post;
import com.example.Nexus.models.User;
import com.example.Nexus.repositories.PostRepository;
import com.example.Nexus.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserService userService;

    public Post createPost(PostRequest request) {
        User user = userService.getUserById(request.getUserId());
        Post post = new Post();
        post.setTitle(request.getTitle());
        post.setContent(request.getContent());
        post.setUser(user);
        return postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAllByOrderByCreatedAtDesc();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post no encontrado con ID: " + id));
    }
}

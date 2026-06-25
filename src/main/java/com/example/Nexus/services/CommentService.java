package com.example.Nexus.services;

import com.example.Nexus.dto.CommentRequest;
import com.example.Nexus.models.Comment;
import com.example.Nexus.models.Post;
import com.example.Nexus.models.User;
import com.example.Nexus.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    public Comment createComment(CommentRequest request) {
        Post post = postService.getPostById(request.getPostId());
        User user = userService.getUserById(request.getUserId());

        Comment comment = new Comment();
        comment.setText(request.getText());
        comment.setPost(post);
        comment.setUser(user);

        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByPost(Long postId) {
        // Validar que el post existe
        postService.getPostById(postId);
        return commentRepository.findByPostIdOrderByCreatedAtAsc(postId);
    }
}

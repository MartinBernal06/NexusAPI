package com.example.Nexus.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CommentRequest {
    @NotBlank(message = "El texto es obligatorio")
    private String text;

    private Long postId;
    private Long userId; // Para simular el usuario antes de JWT
}

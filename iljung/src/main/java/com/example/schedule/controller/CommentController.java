package com.example.schedule.controller;

import com.example.schedule.dto.CommentRequestDto;
import com.example.schedule.dto.CommentResponseDto;
import com.example.schedule.service.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<CommentResponseDto> createComment(
            @RequestParam Long scheduleId,
            @RequestParam Long userId,
            @Valid @RequestBody CommentRequestDto requestDto) {
        return ResponseEntity.ok(commentService.createComment(scheduleId, userId, requestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CommentResponseDto> updateComment(
            @PathVariable Long id,
            @Valid @RequestBody CommentRequestDto requestDto) {
        return ResponseEntity.ok(commentService.updateComment(id, requestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
        return ResponseEntity.ok("댓글이 삭제되었습니다.");
    }

    @GetMapping("/schedule/{scheduleId}")
    public ResponseEntity<List<CommentResponseDto>> getCommentsBySchedule(@PathVariable Long scheduleId) {
        return ResponseEntity.ok(commentService.getCommentsBySchedule(scheduleId));
    }
}

package com.example.schedule.service;

import com.example.schedule.dto.CommentRequestDto;
import com.example.schedule.dto.CommentResponseDto;

import java.util.List;

public interface CommentService {
    CommentResponseDto createComment(Long scheduleId, Long userId, CommentRequestDto requestDto);
    CommentResponseDto updateComment(Long commentId, CommentRequestDto requestDto);
    void deleteComment(Long commentId);
    List<CommentResponseDto> getCommentsBySchedule(Long scheduleId);
}

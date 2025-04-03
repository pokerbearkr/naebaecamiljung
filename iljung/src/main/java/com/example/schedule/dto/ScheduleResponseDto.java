package com.example.schedule.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ScheduleResponseDto {

    private Long id;
    private String title;
    private String description;
    private String username;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

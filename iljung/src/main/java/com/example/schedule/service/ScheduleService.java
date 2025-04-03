package com.example.schedule.service;

import com.example.schedule.dto.ScheduleRequestDto;
import com.example.schedule.dto.ScheduleResponseDto;

import java.util.List;

public interface ScheduleService {
    ScheduleResponseDto createSchedule(Long userId, ScheduleRequestDto requestDto);
    ScheduleResponseDto getSchedule(Long id);
    List<ScheduleResponseDto> getAllSchedules();
    ScheduleResponseDto updateSchedule(Long id, ScheduleRequestDto requestDto);
    void deleteSchedule(Long id);
}

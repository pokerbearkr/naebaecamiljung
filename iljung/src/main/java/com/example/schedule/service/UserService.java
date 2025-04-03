package com.example.schedule.service;

import com.example.schedule.dto.UserRequestDto;
import com.example.schedule.dto.UserResponseDto;
import com.example.schedule.entity.Users;

import java.util.List;

public interface UserService {
    UserResponseDto signup(UserRequestDto requestDto);
    List<UserResponseDto> getAllUsers();
    Users findByEmail(String email);
}

package com.satyen.user_management.controller;

import com.satyen.user_management.dto.user.UserResponse;
import com.satyen.user_management.entity.user.User;
import com.satyen.user_management.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getAllUser")
    public ResponseEntity<List<UserResponse>> findAll() {
        List<UserResponse> users = userService.findAll();
//        List<UserResponse> userResponses = users.stream().map(user -> UserResponse.builder()
//                .id(user.getId())
//                .firstName(user.getFirstName())
//                .lastName(user.getLastName())
//                .email(user.getEmail())
//                .build()).toList();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody @Valid UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.createUser(userRequest));
    }

    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody @Valid UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.updateUser(userRequest));
    }

}

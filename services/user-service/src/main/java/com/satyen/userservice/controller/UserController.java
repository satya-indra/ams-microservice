package com.satyen.userservice.controller;

import com.satyen.userservice.dto.user.UserRequest;
import com.satyen.userservice.dto.user.UserResponse;
import com.satyen.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getAllUser")
    public ResponseEntity<List<UserResponse>> findAll() {
        List<UserResponse> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping("/exists/{userId}")
    public ResponseEntity<Boolean> existsById(@PathVariable("userId") UUID id) {
        return ResponseEntity.ok().body(userService.existsById(id));
    }

    @GetMapping("/find/{userId}")
    public ResponseEntity<UserResponse> findById(@PathVariable("userId") UUID id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody @Valid UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.createUser(userRequest));
    }

    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody @Valid UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.updateUser(userRequest));
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable("userId") UUID id) {
        return ResponseEntity.ok().body(userService.deleteUser(id));
    }

}

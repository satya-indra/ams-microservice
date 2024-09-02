package com.satyen.userservice.service;

import com.satyen.userservice.dto.user.UserRequest;
import com.satyen.userservice.dto.user.UserResponse;
import com.satyen.userservice.entity.user.User;
import com.satyen.userservice.exception.UserNotFoundException;
import com.satyen.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponse> findAll() {
        List<User> users = userRepository.findAll();

        return userRepository.findAll().stream().map(userMapper::toUserResponse).toList();
    }

    @Override
    public String createUser(UserRequest userRequest) {
        User user = userRepository.save(userMapper.toUser(userRequest));
        return user.getId().toString();
    }

    @Override
    public String updateUser(UserRequest userRequest) {
        User user = userRepository
                .findById(userRequest.id())
                .orElseThrow(() -> new UserNotFoundException("Update failed. User not found for id: " + userRequest.id()));

        User mergedUser = mergeUser(userRequest, user);
        userRepository.save(mergedUser);
        return mergedUser.getId().toString();
    }

    @Override
    public Boolean existsById(UUID id) {
        return userRepository.existsById(id);
    }

    @Override
    public UserResponse findById(UUID id) {
        return userRepository.findById(id)
                .map(userMapper::toUserResponse)
                .orElseThrow(() -> new UserNotFoundException("User not found for id: " + id));
    }

    @Override
    public String deleteUser(UUID id) {
        userRepository.deleteById(id);
        return id.toString();
    }

    private User mergeUser(UserRequest userRequest, User user) {
        if (StringUtils.isNotBlank(userRequest.firstName())) {
            user.setFirstName(userRequest.firstName());
        }
        if (StringUtils.isNotBlank(userRequest.lastName())) {
            user.setLastName(userRequest.lastName());
        }
        if (StringUtils.isNotBlank(userRequest.email())) {
            user.setEmail(userRequest.email());
        }
        if (userRequest.address() != null) {
            user.setAddress(userRequest.address());
        }
        return user;
    }

}

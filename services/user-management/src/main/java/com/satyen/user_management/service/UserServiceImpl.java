package com.satyen.user_management.service;

import com.satyen.user_management.controller.UserRequest;
import com.satyen.user_management.dto.user.UserResponse;
import com.satyen.user_management.entity.user.User;
import com.satyen.user_management.exception.UserNotFoundException;
import com.satyen.user_management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponse> findAll() {
        
        return userRepository.findAll();
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

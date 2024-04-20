package com.studi.userManagement.service;

import com.studi.userManagement.dto.UserDto;
import com.studi.userManagement.entity.User;

public interface UserService {
    User findByUsername(String username);

    User save(UserDto userDto);

}

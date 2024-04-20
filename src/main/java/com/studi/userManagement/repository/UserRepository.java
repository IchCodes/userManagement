package com.studi.userManagement.repository;

import com.studi.userManagement.dto.UserDto;
import com.studi.userManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User save(UserDto userDto);
}

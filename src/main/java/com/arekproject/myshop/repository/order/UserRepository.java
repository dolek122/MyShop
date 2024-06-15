package com.arekproject.myshop.repository;

import com.arekproject.myshop.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDto, Long> {
    UserDto findByUsername(String username);
}

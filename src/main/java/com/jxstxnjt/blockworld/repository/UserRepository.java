package com.jxstxnjt.blockworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jxstxnjt.blockworld.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

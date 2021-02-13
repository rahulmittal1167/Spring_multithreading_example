package com.rahul.springboot.multithread.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.springboot.multithread.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

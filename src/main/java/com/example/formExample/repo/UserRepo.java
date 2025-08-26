package com.example.formExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.formExample.entity.User;

public interface UserRepo extends JpaRepository<User,Long>{

}

package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	@Query
	UserEntity findByUserId(String userId);

}

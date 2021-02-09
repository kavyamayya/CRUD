package com.kavya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kavya.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}

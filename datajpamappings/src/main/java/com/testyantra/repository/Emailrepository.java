package com.testyantra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testyantra.entity.Email;

public interface Emailrepository extends JpaRepository<Email, Integer> {

}

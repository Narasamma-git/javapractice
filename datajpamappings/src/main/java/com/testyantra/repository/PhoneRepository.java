package com.testyantra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testyantra.entity.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}

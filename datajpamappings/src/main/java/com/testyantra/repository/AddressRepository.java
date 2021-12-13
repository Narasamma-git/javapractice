package com.testyantra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testyantra.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}

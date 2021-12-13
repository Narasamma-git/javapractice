package com.testyantra.fsproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testyantra.fsproject.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}

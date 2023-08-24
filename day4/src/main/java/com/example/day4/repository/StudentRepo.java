package com.example.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.model.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}

package com.example.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.model.StudentEntity;
import com.example.day4.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
StudentRepo studentRepo;

//post
public StudentEntity savedetails(StudentEntity entity) {
	return studentRepo.save(entity);
}

//get
public List<StudentEntity> showInfo(StudentEntity entity){
	return studentRepo.findAll();
}

//get student by id
public Optional<StudentEntity> showInfoOfOneStudent(int id) {
	return studentRepo.findById(id);
}

//put by id
public StudentEntity updatebyId(int id,StudentEntity entity) {
	return studentRepo.saveAndFlush(entity);
}

//delete by id pathvariable
public void deletebyidPathVariable(int id) {
	studentRepo.deleteById(id);
}

//delete by id requestparameter
public void deletebyidRequestParam(int id) {
	studentRepo.deleteById(id);
}
}

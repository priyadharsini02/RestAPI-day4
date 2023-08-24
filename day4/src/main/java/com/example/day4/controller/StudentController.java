package com.example.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.model.StudentEntity;
import com.example.day4.service.StudentService;

@RestController
public class StudentController {
	@Autowired
StudentService studentService;
	
	@PostMapping("/")
	public StudentEntity add(@RequestBody StudentEntity entity) {
		return studentService.savedetails(entity);
	}
	
	@GetMapping("/")
	public List<StudentEntity> show(@RequestBody StudentEntity entity) {
		return studentService.showInfo(entity);
	}
	
	@GetMapping("{id}")
	public Optional<StudentEntity> showbyid(@PathVariable int id){
		return studentService.showInfoOfOneStudent(id);
	}
	
	@PutMapping("/{id}")
	public StudentEntity updatebyid(@PathVariable int id,@RequestBody StudentEntity entity ) {
		return studentService.updatebyId(id, entity);
	}
	
	//path variable
	@DeleteMapping("/{id}")
	public String deleteid(@PathVariable int id) {
		studentService.deletebyidPathVariable(id);
		return "Deleted";
	}
	
	//requestParam
		@DeleteMapping("/reqparam/{id}")
		public String deletebyidreqparam(@RequestParam int id) {
			studentService.deletebyidRequestParam(id);
			return "Deleted";
		}
}

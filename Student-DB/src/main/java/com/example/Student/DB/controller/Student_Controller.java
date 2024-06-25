package com.example.Student.DB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.DB.entity.Student_Entity;
import com.example.Student.DB.service.Student_Interface;

@RestController
@RequestMapping("/api/students")
public class Student_Controller {
	
	@Autowired
	Student_Interface studentInterfaceSercice;
	
	@PostMapping
	public ResponseEntity<Student_Entity> saveStudent(@RequestBody  Student_Entity stuEntity){
		
		return new ResponseEntity<Student_Entity>(studentInterfaceSercice.saveStudent(stuEntity),HttpStatus.CREATED);
	}

	//get all
	
	@GetMapping()
	public List<Student_Entity> getAllStudents(){
		
		return studentInterfaceSercice.getAllStudents();
	}
	
	//get particular student
	
	@GetMapping("{id}")
	public ResponseEntity<Student_Entity>getStudentbyId(@PathVariable long id){
		
		return new ResponseEntity<Student_Entity>(studentInterfaceSercice.getStudentById(id),HttpStatus.OK);
	}
	
	//update
	
	@PutMapping("{id}")
	public ResponseEntity<Student_Entity> updateStd (@RequestBody Student_Entity student ,@PathVariable("id") long id){
		
		return new ResponseEntity<Student_Entity>(studentInterfaceSercice.updateStudent(student,id),HttpStatus.OK);
	}
	
	//delete
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletestd(@PathVariable("id") long id){
		
		
		studentInterfaceSercice.deleteStudent(id);
		
		return new ResponseEntity<String>("Student Detials is  deleted sucessfully!!!",HttpStatus.OK);
		
		
	}
}

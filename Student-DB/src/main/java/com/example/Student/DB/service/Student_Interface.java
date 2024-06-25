package com.example.Student.DB.service;

import java.util.List;

import com.example.Student.DB.entity.Student_Entity;

public interface Student_Interface {


	//create

	Student_Entity  saveStudent(Student_Entity student);
	
	
	//get all
	
	List <Student_Entity> getAllStudents();
	
	//get particular id 
	
	Student_Entity getStudentById (long id);
	
	//update
	
	Student_Entity updateStudent (Student_Entity student, long id);
	
	//delete 
	
	void deleteStudent (long id);
}

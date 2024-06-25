package com.example.Student.DB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.DB.entity.Student_Entity;
import com.example.Student.DB.exception.Std_ResourceNotFoundException;
import com.example.Student.DB.repository.Student_Repository;

@Service
public class Student_ServiceImp  implements Student_Interface{
	
	@Autowired
	Student_Repository stdRepository;
	

	@Override
	public Student_Entity saveStudent(Student_Entity student) {

		return stdRepository.save(student);
	}

	//get all 
	
	@Override
	public List<Student_Entity> getAllStudents() {

		return stdRepository.findAll();
	}

	
	// get Particular id

	@Override
	public Student_Entity getStudentById(long id) {
	    return stdRepository.findById(id)
	            .orElseThrow(() -> {
	                throw new Std_ResourceNotFoundException("Student", "Id", id);
	            });
	}

	//update 
	
	@Override
	public Student_Entity updateStudent(Student_Entity student, long id) {
                   
		Student_Entity existStudent = stdRepository.findById(id).orElseThrow(()->
		new Std_ResourceNotFoundException("Student", "Id", id));
		
		//set
		
		existStudent.setName(student.getName());
		existStudent.setEmail(student.getEmail());
		existStudent.setContactNumber(student.getContactNumber());
		existStudent.setAddress(student.getAddress());
		
		//save
		stdRepository.save(existStudent);
		
		return existStudent;
	}

	//delete
	@Override
	public void deleteStudent(long id) {

		stdRepository.findById(id).orElseThrow(()->
		new Std_ResourceNotFoundException("student", "id", id));
		
		stdRepository.deleteById(id);
	}




}

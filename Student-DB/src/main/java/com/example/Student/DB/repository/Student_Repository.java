package com.example.Student.DB.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.DB.entity.Student_Entity;


public interface Student_Repository extends JpaRepository<Student_Entity,Long> {

}

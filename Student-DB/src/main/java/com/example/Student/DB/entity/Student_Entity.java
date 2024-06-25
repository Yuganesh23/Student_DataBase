package com.example.Student.DB.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="stdDetails")
public class Student_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column ( name = "Name" , nullable  = false)
	private  String name;
	
	@Column(name = "Email")
	private  String email;
	
	@Column(name="ContactNumber")
	private  String contactNumber;
	
	@Column(name= "Address")
	private  String address;
	
	
	
	
	//Getter Setter

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public   String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public  String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public  String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}

package com.Student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
private String email;
public Student(Long id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public Student() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
}


}

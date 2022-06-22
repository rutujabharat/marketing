package com.cruddemo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long Id;
private String name;
private String course;
private int fee;
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}

}

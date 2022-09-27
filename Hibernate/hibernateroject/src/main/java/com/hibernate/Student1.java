package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String city;
Certificate certificate;//entity reference
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Certificate getCertificate() {
	return certificate;
}
public void setCertificate(Certificate certificate) {
	this.certificate = certificate;
}
public Student1( String name, String city, Certificate certificate) {
	super();
	this.name = name;
	this.city = city;
	this.certificate = certificate;
}
public Student1() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
}

}

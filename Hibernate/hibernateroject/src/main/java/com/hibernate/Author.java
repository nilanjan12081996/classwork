package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
	private int aId;
	private String name;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author(int aId, String name) {
		super();
		this.aId = aId;
		this.name = name;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

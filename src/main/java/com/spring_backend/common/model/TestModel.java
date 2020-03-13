package com.spring_backend.common.model;

public class TestModel {

	private Integer id;
	private String name;
	private Integer birth;
	private String phnumber;

	public Integer getId() {
		return this.id;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

	public Integer getBirth() {
		return birth;
	}

	public void setBirth(Integer birth) {
		this.birth = birth;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
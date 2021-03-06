package com.mindtree.fileStream.entity;

import java.io.Serializable;
//openes in 1st batch-1
public class People implements Serializable {
	private String name;
	private int age;

	public People() {
		super();
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setAnme(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

}

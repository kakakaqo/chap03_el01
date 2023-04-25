package com.javalab.el;

public class Member {

	// 필드
	private String name;
	private int age;

	// 기본 생성자
	public Member() {
		super();
	}

	// 오버로딩 생성자
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
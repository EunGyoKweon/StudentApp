package com.example.lab2;



public class Student implements Comparable<Student> {

	int no;

	String name;

	int age;

	

	

	public Student(int i, String string, int j) {

		this.no = i;

		this.name = string;

		this.age = j;

		// TODO Auto-generated constructor stub

	}





	@Override

	public String toString() {

		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";

	}





	public int getNo() {

		return no;

	}





	public void setNo(int no) {

		this.no = no;

	}





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





	@Override

	public int compareTo(Student o) {

		// TODO Auto-generated method stub

		return name.compareTo(o.name);

	}



}
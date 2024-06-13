package com.learningsb.learn_spring_framework.test;

import java.io.Serializable;

class Pojo{
	private String text;
	
	private int number;
	
	public String toString() {
		return text + ":"+number;
	}
}

class JavaBean implements Serializable{
	//1. public no-arg. constructor
	public JavaBean() {
		
	}
	//2. getters and setters
	private String next;
	private int number;
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}

public class SpringBeanVsJavaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pojo pojo=new Pojo();
		System.out.println(pojo);
	}
}

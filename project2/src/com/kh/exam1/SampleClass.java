package com.kh.exam1;

public class SampleClass {
	
	public static void main(String[] args) {
		Person p1 = new Person(); // person 클래스를 이용해서 자료형이 person인 객체 p1을 생성하는 과정
		
		p1.name = "김철수"; // p1에서 name 값 설정 
		
		System.out.println(p1.getName());
		//System.out.println("Hello");
	}

}

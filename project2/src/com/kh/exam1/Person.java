package com.kh.exam1;

 class Person { // 클래스
	static String pNo = "111"; //  static 예약어 6개 필드부분
	String name;
	private char gender;
	private String address;
	private String phone;
	private int age;
	
	public Person() {} // 생성자
	public Person(int x) {}
	public Person(double x) {}
	public Person(int x, int y) {}
	public Person(int x, double y) {}
	
	public String getName() {
		//System.out.println("this -> " + this);
		return this.name;
	}
	
}

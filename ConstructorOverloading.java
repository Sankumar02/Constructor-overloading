package com.Challenge;

public class ConstructorOverloading {

	String name;
	int rollNo;
	double percentage;

	// creating constructor with one arguements
	public ConstructorOverloading(String name) {

		this.name = name;
	}

	// creating constructor with two arguements
	public ConstructorOverloading(String name, int rollNo) {

		this.name = name;
		this.rollNo = rollNo;
	}

	// creating constructor with three arguements
	public ConstructorOverloading(String name, int rollNo, double percentage) {

		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}

	// method
	void displayDetails() {
		System.out.println("-------Student details--------");
		System.out.println();
		System.out.println("Name :" + name);
		System.out.println("Registered number :" + rollNo);
		System.out.println("Percentage of mark :" + percentage);
		System.out.println();
	}

}

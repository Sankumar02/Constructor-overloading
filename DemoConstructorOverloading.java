package com.Challenge;

public class DemoConstructorOverloading  {

	public static void main(String[] args) {
		
		ConstructorOverloading details1 = new ConstructorOverloading("Kumar");
		ConstructorOverloading details2 = new ConstructorOverloading("Arya", 2116);
		ConstructorOverloading details3 = new ConstructorOverloading("Santhosh", 2117, 91.66);
		details1.displayDetails();
		details2.displayDetails();
		details3.displayDetails();

	}
}

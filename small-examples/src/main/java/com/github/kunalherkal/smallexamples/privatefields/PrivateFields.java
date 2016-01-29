package com.github.kunalherkal.smallexamples.privatefields;

public final class PrivateFields {

	public static void main(String[] args) {
		GoodStudent goodStudent = new GoodStudent();
		goodStudent.setRollNumber("10");
		goodStudent.setFirstName("Kunal");
		goodStudent.setLastName("Herkal");

		System.out.println("Good Student is: " + goodStudent);

		BadStudent badStudent = new BadStudent();
		badStudent.rollNumber = "20";
		badStudent.firstName = "Kunal";
		badStudent.lastName = "Herkal";

		System.out.println("Bad Student is: " + badStudent);
	}
}

package com.github.kunalherkal.smallexamples.privatefields;

public final class GoodStudent {
	private String rollNumber;
	private String firstName;
	private String lastName;

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "GoodStudent [rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

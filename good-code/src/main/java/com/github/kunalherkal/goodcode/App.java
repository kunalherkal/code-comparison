package com.github.kunalherkal.goodcode;

import com.github.kunalherkal.goodcode.dao.StudentDao;
import com.google.inject.Guice;
import com.google.inject.Injector;

public final class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Student student = new Student();
		student.setRollNumber(27);
		student.setFirstName("Kunal");
		student.setLastName("Herkal");
		
		Injector injector = Guice.createInjector(new AppInjector());
		StudentDao studentDao = injector.getInstance(StudentDao.class);
		studentDao.insert(student);
		
	}

}

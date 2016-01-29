package com.github.kunalherkal.smallexamples.meaningful;

import java.util.HashMap;
import java.util.Map;

public final class MeaningfulNamesDemo {

	public static void main(String[] args) {
		Map<String, GoodStudent> rollNumberToStudent = new HashMap<String, GoodStudent>();

		GoodStudent student1 = new GoodStudent("10", "Kunal", "Herkal");
		GoodStudent student2 = new GoodStudent("20", "Kaiser", "Herkal");

		rollNumberToStudent.put(student1.getRollNumber(), student1);
		rollNumberToStudent.put(student2.getRollNumber(), student2);
	}
}

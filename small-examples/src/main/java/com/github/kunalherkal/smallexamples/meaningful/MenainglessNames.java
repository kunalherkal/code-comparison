package com.github.kunalherkal.smallexamples.meaningful;

import java.util.HashMap;
import java.util.Map;

public final class MenainglessNames {

	public static void main(String[] args) {
		Map<String, BadStudent> map = new HashMap<String, BadStudent>();

		BadStudent s1 = new BadStudent("10", "Kunal", "Herkal");
		BadStudent s2 = new BadStudent("20", "Kaiser", "Herkal");

		map.put(s1.getRn(), s1);
		map.put(s2.getRn(), s2);
	}
}

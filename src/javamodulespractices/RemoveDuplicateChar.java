package javamodulespractices;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String A = "Akhil Testing Application using Selenium with Java";
		String B = removeduplicate(A);
		System.out.println(B.toLowerCase());
	}
public static String removeduplicate (String A) {
	
	LinkedHashSet<Character> unique = new LinkedHashSet<>();
	for(char ch : A.toCharArray()) {
		unique.add(ch);
	}
	StringBuilder sb = new StringBuilder();
	for(char ch : unique) {
		sb.append(ch);
	}
	return sb.toString();
}
}

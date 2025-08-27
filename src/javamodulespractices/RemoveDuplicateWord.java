package javamodulespractices;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String Name = "Akhil akhil Working working in In Infosys Infosys";
		String duplicatereomve = RemoveDuplicateWord(Name);
		System.out.println(duplicatereomve);
	}
	public static String RemoveDuplicateWord (String Name) {
		String[] Words = Name.split(" ");
		LinkedHashSet<String> Unique = new LinkedHashSet<>();
		for(String word : Words) {
			Unique.add(word.toLowerCase());
		}
		return String.join(" ", Unique);
	}

}

package javamodulespractices;

public class ReverseString {

	public static void main(String[] args) {
		String A = "Akhil";
		String B = "";
		
		for (int i=A.length()-1; i >=0; i--) {
			B += A.charAt(i);
		}
		System.out.println("Reverse of String " + A +" : "+B);

	}

}

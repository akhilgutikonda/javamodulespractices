package javamodulespractices;

public class palindorme {

	public static void main(String[] args) {
		String A = "Nithin";
		//A = A.toLowerCase();
		String B = A.replace("h","");
		String reverse = "";
		for(int i = B.length()-1; i>=0; i--) {
			reverse += B.charAt(i);
		}
		System.out.println("Cheking Palindorme");
		
		if(reverse.equalsIgnoreCase(B)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}

package program;

public class palindrame {
 public static void main(String args[])
 {

		String s = "level"; // use variable s for store string pallavi
		String s1 = "";
		char[] c = s.toCharArray(); //converts the given string into a sequence of characters.
		for (int i = c.length - 1; i >= 0; i--) { // loop run the end to start .lenght is use for count the character in the string
			s1 = s1 + c[i]; //c[i] is  access the each character  of String
		} // each character  access in reverse oeder and store in s1 variable

		if (s.equals(s1)) //compare string and display the result. equals method use for comapre the two string
			System.out.println("its pallindrome");
		else
			System.out.println("its not a pallindrome");
		
 }
}

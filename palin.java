package palindrome;
import java.util.Scanner;
import java.io.*;

public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc;
		String cba = "";
		Scanner sr = new Scanner(System.in);
		
	System.out.println("Enter to check: ");
	abc = sr.nextLine();
	String x=abc.replaceAll(" ", "");
 
	
	int length = x.length();
	
	for (int i = length -1; i>=0; i--)
		cba = cba + x.charAt(i);
	
	if (x.equals(cba))

	System.out.println("The palindrome is: " + x );
	

	
	else 
	
		System.out.println("There is no palindrome for the value you entered.");
	
	
	
	}
}

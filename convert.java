import java.util.Scanner;


public class convert {

	public static void main (String[] args) {
		
		int n;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the number: ");
		n = in.nextInt();
		
		if (n<0) {
			System.out.println("Enter a positive number");
		}
		else {
			System.out.println("The binary number is: ");
			convertToBinary(n);
		}
		
	}

	private static void convertToBinary(int n) {

		int r;
		
		if(n<=1) {
			System.out.println(n);
		return;
		}
		{
		
		r = n%2;
		convertToBinary(n>>1);
		System.out.println(r);
		}
		
		
	}

	   
	}


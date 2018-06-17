import java.math.*;


public class math {

	
	public static void main(String[] args) {
		int a =2, b = 10;
		
	
	
	//add
	
	int add = Math.addExact(a, b);
	System.out.println("The addition is: " + add);
	
	//subtract
	
	int sub = Math.subtractExact(b, a);
	System.out.println("The subtraction is: " + sub);
	
	//greater
	
	int grtr = Math.max(a, b) ;
	System.out.println("The greatest number is: " + grtr);
	
	//minimum
	
	int min = Math.min(a, b);
	System.out.println("The smallest number is: " + min);
	
	//mod
	int mod = Math.floorMod(a, b) ;
	System.out.println("The mod is: " + mod);
	
	//decrement
	int dec = Math.decrementExact(a);
	System.out.println("The decrement value is: " + dec);
	
	//Increment
	int inc = Math.incrementExact(a);
	System.out.println("The increment value is: " + inc);
	
	//div
	int div = Math.floorDiv(a, b);
	System.out.println("The div is: " + div);
	
	//Multiplication
	int mult = Math.multiplyExact(a, b);
	System.out.println("The multiplication of the two numbers is: " + mult);
	
	//
	double sqrt = Math.sqrt(b);
	System.out.println("The square roof is: " + sqrt);
	
	
	
	}
}

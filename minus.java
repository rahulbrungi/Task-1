import java.lang.System;
import java.util.*;


public class minus {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double maxValue =  Double.MIN_VALUE;
	        double minValue =  Double.MAX_VALUE;
	        double minValue1 = Double.MAX_VALUE;
	        double minValue2 = Double.MAX_VALUE;

	        int count = 0;
	        double difference = 0;
	        

	        System.out.println("Enter numbers:");
	        while (input.hasNextDouble()) {

	            double Value = input.nextDouble();

	            if (Value > maxValue) {
	                maxValue = Value;
	            }
	            if (Value < minValue) {
	                minValue = Value;
	            }
	            if (Value < minValue) {
	                minValue1 = Value;
	            }
	            if (minValue == minValue1) {
	                minValue = Value;
	            }
	            if (Value < minValue1) {
	                minValue2 = Value;
	            }
	            if (minValue1 == minValue2) {
	                minValue1 = Value;
	            }
	        }
	        count ++;
	        difference = maxValue - minValue;
	        {
	            if (count > 0) {
	                
	                System.out.println("The difference from the highest minus lowest is:" + difference);
	            } else {
	                System.out.println("Enter the correct value");
	            }
	        }
	    }
	}

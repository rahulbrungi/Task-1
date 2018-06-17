package auto;

import java.util.Scanner;

public class loan {


		String Name;
		int ssn;
		int creditScore;
		
		public loan()
		{
			
			this.Name = "name";
			this.ssn = ssn;
			this.creditScore = creditScore;
			
		}

	

	public void compare(int score, String name, int req) {
		
		if (creditScore >= 600 && creditScore <= 625)
		{
		System.out.println("You will get a loan of 16000");
		}
		else if (creditScore >= 626 && creditScore <= 650)
		{
		System.out.println("You will get a loan of 18000");
		}
		else if (creditScore >= 651 && creditScore <= 675)
		{
		System.out.println("You will get a loan of 20000");
		}
		else if (creditScore >= 676 && creditScore <= 699)
		{
		System.out.println("You will get a loan of 25000");
		}
		else if (creditScore >= 700 && creditScore <= 725)
		{
		System.out.println("You will get a loan of 30000");
		}
		else if (creditScore >= 726 && creditScore <= 750)
		{
		System.out.println("You will get a loan of 35000");
		}
		else if (creditScore >= 751 && creditScore <= 775)
		{
		System.out.println("You will get a loan of 40000");
		}
		else if (creditScore >= 776 && creditScore <= 800)
		{
		System.out.println("You will get a loan of 45000");
		}
		
		else { System.out.println("You entered a wrong input");
		}


		{
	if (creditScore<=699) {

		loan ec = new nonluxury();	

		((nonluxury)ec).regular(option); 

	} else {

		loan pr=new luxury();

		((luxury)pr).expensive(option);

	}

	}
	}
	}	




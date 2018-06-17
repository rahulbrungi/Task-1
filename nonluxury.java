package auto;

public class nonluxury extends loan{

	public void regular(int option) {

		System.out.println("The car available is ");
	

		if (creditScore >= 600 && creditScore <= 625) {	

		System.out.println("Camry and the price is: 25,000");
		System.out.println("Civic and the price is: 30,000");

		}

		if (creditScore >= 626 && creditScore <= 650) {

		System.out.println("Ford and the price is: 32,000");
		System.out.println("Veloster and the price is: 34,000");
		}

		if (creditScore >= 651 && creditScore <= 675) {

		System.out.println("Mustang and the price is: 38,000");
		System.out.println("Camero and the price is: 40,000");

		}

		if (creditScore >= 676 && creditScore <= 699) {

		System.out.println("Jeep and the price is: 42,000");
		System.out.println("Toyota and the price is: 44,000");

		}



	}

}


package mainMethod;

public class TwoMainA {

	public static void main(String[] args) {
		
		System.out.println("I am the first main method");
		
		//call the second main () by class name and then dot operator
		TwoMainB.main(args); //prints I am the 2nd main method
	}

}

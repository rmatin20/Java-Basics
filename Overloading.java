package mainMethod;

public class Overloading {

	public static void main(String[] args) {

		System.out.println("default main method");//prints default main method
		
		//give the values of the parameters in the default main method		
		main("Tom"); //prints one String parameter
		main("Tom", "Pat"); //prints different numbers of parameters
		main("Tom", 25); //prints different type of parameter
		}
	
	public static void main(String args) {

		System.out.println("one String parameter");
	}
	
	public static void main(String a, String b) {

		System.out.println("different numbers of parameters");
	}
	
	public static void main(String a, int b) {

		System.out.println("different type of parameter");
	}
}

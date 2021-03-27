package keywords;

public class ThisKW {

	String model;
	int year;
	
	public static void main(String[] args) {
		
		UseOfThisKW Car = new UseOfThisKW("Toyota", 1995); //assign parameters values
		
		System.out.println(Car.model); //prints Toyota
		System.out.println(Car.year); //prints 1995
	}
	
	public ThisKW(String model, int year) { //parameterized constructor
		
		this.model = model; //global variable = local variable
		this.year = year; //global variable = local variable
	}
}
/*do not parameterize a local method*/
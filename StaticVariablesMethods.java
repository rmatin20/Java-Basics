package variables;

public class StaticVariablesMethods {
	
	static String university = "UofT";
	
	public static void main(String[] args) {
		
		//call variable directly		
		System.out.println(university); //prints UofT
		
		//call variable by the class name
		System.out.println(StaticVariablesMethods.university); //prints UofT
		
		//call static method directly
		getInformation(); //prints Two Students
		
		//call static method from the main method by class name
		StaticVariablesMethods.getInformation(); //prints Two Students
		
		//create the object of the class and call static method
		StaticVariablesMethods obj = new StaticVariablesMethods ();
		obj.getInformation(); //not recommended 
		}
		
		
	//static method
		public static void getInformation () {
			System.out.println("Two students");
		}
}
package variables;

public class LocalVariable {

	public static void main(String[] args) {
		
		//create the object to call local method
		LocalVariable obj = new LocalVariable() ;
		obj.eat(); //prints eat with hands. Syso in local method
		
		//cannot call non-static method directly from the main method
		/*eat(); will give red underline*/
				
		//cannot call non-static variable directly from the main method
		/*System.out.println(university); //will give red underline*/
			}
	
	//non-static local method and local variable
	public void eat() {
		int age = 4; //local variable
		System.out.println("eat with hands");
	}

}

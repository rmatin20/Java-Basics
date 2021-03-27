package variables;

public class InstanceVariables {

	String name; //instance variable
	
	public static void main(String[] args) {
		
		//have to create object and call instance variables		
		InstanceVariables obj = new InstanceVariables();
		obj.name = "Tom";
		System.out.println(obj.name); // prints Tom
		
		//cannot call local variable from the main method
		/*System.out.println(obj.age); //prints compilation problem and not Tom or age*/
		
		//can call the local method from the main method
		obj.localVariable(); // prints years
	}
	
	//local method
	public void localVariable (){
		int age= 28; //local variable
		System.out.println("years");
	}
}



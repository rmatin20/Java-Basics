package keywords;

public class SuperChildKW extends SuperParentKW{
	
	public SuperChildKW() { //default constructor
		
		super(); //prints syso under the parent constructor
	}

	public static void main(String[] args) {
		
		SuperChildKW obj = new SuperChildKW(); //have to create obj
		
	//	System.out.println("Child Contstructor"); //prints Child Constructor
	}
}
/*if obj is not created, then super keyword won't get called
 * not necessary to write syso in the main to call super kw.*/
 
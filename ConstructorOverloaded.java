package constructor;

public class ConstructorOverloaded {
	
	public static void main(String[] args) {
		
		ConstructorOverloaded obj = new ConstructorOverloaded ();
		System.out.println("default constructor");
		
		ConstructorOverloaded obj1 = new ConstructorOverloaded ("Tom");
		System.out.println("one argument constructor");
		
		ConstructorOverloaded obj2 =  new ConstructorOverloaded ("Tom", 25);
		System.out.println("different type argument constructor");
		}
	
	public ConstructorOverloaded(){
		//System.out.println("default constructor");
	}

	public ConstructorOverloaded(String a){
		//System.out.println("one argument constructor");
	}
	
	public ConstructorOverloaded(String a, int b){
		//System.out.println("different type argument constructor");
	}
}
/*you can write syso either in the main or in the methods*/
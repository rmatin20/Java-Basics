package loops;

public class IfElse {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		if(x>y && x>z) {
			
			System.out.println("x is the greatest number");
		}
		else if(y>z) {
			System.out.println("y is the greatest number");
		}
		else {
			System.out.println("z is the greatest number");// prints this line
		}
		
		String a = "hello";
		String b = "Hello";
		
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
			else {
				System.out.println("a is not equal to b"); //prints this line
				}
		}
	}


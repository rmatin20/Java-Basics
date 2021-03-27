package string;

public class StringObject {

	public static void main(String[] args) {
		
		/*
		 * how many objects will be created? 3 total
		 * */
		
		String s1 = "Hello World"; /*creates 1 object in String Constant Pool and s1 refers to it 
									from the Stack*/
		String s2 = "Hello World"; /*does not create any object in SCP as "Hello World" already 
									present there*/
		String s3 = s1;
		
		System.out.println(s1==s2); //prints true
		System.out.println(s2==s3); //prints true
		System.out.println(s3==s1); //prints true
		
		//with new kw, a new object is created in heap
		
		String n1 = new String ("Hello World");/*will create 2 objects
		 										in heap and in SCPool*/
		String n2 = new String ("Hello World");	/*creates 1 object in Heap only. Will not create 
												"Hello World" in SCP, as it's already present in SCP*/								
		
		 System.out.println(n1==n2); /*prints false as n1 creates a separate object and n2 creates
		  							a separate object, though their value is the same*/
		 
		 System.out.println(s1==n2); /*prints false, 'cos s1 points to the object in SCP and n2 points
		  								to the object in Heap*/

	}

}

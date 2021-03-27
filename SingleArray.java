package array;

public class SingleArray {

	public static void main(String[] args) {
		
		//print days in a week
		String wkday [] = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri","Sat"};
		System.out.println(wkday.length); //prints 7
		
		//for(int i=0; i<=wkday.length; i++) {
		//	System.out.println(wkday[i]); /*prints Sun, Mon...Sat 
										//but ArrayIndexOutOfBoundException /
		 
		for(int i=0; i<=wkday.length-1; i++) {   //subtract 1
			System.out.println(wkday[i]); //prints Sun, Mon...Sat 
		}
		
		int numbers [] = new int[4];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		System.out.println(numbers.length); //prints 3 as the size of array
		
		for(int i=0; i<=numbers.length; i++) {     //have to subtract 1
		//	System.out.println(numbers[i]);//ArrayIndesOutOfBoundException
			System.out.println(numbers[4]);//ArrayIndexOutOfBoundException
		}
	}
}

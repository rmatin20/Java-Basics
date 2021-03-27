package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		String wkday [] = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri","Sat", "Sun"};
		System.out.println(wkday.length); //prints 8
		
		/*1. Using forloop, inner and outer. Compare the first element with other elements. 
		 * 										Worst approach if there're 100 of elements*/
		for(int i=0; i<=wkday.length; i++) {   
			for(int j=i+1; j<wkday.length; j++) {
				
				if(wkday[i].equals(wkday[j])){
					System.out.println("duplicate element is "+ wkday[i]); //prints Sun
				}
				}
		}
		
		/*2. Using HashSet and extended loop*/
		Set<String>setObject = new HashSet<String>();
		
		for (String eachElement :wkday) {
			
			if(setObject.add(eachElement)==false){/*add() will see if Sun is added from the array setObject. If not,
										then HashSet will add Sun. This will go on. When it will try to add
										next Sun, it'll see that Sun is already added, so it's a duplicate 
										and it will not allow to add Sun anymore*/
			
				System.out.println("duplicate element is " + eachElement); //prints duplicate element is Sun
			}
		}
		
	}
}
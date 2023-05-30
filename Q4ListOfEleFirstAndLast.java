package Assignment3java;

import java.util.Arrays;
import java.util.List;

public class Q4ListOfEleFirstAndLast {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(10,45, 90,45, 23, 90, 44);

		if(li!=null && !li.isEmpty())
		{
			System.out.println("First Value::"+li.get(0));
			System.out.println("Last value::"+li.get(li.size()-1));
		}
		else {
			
			System.out.println("The list does not have enough elements.");
		}
		
		
		
	}

}

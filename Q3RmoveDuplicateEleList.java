package Assignment3java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3RmoveDuplicateEleList {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Java", "TestNG", "Maven", "Java");
         System.out.println(li);
         
         HashSet<String> s=new HashSet<>(li);
         System.out.println(s);
	}

}

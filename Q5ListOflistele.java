package Assignment3java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5ListOflistele {

	public static void main(String[] args) {
	
	List<Integer> li1=Arrays.asList(11, 22, 33);
	List<Integer> li2=Arrays.asList(9, 19, 29);
	List<Integer> li3=Arrays.asList(7, 17, 27);
	
	List<List<Integer>> listoflist=new ArrayList<>();
	listoflist.add(li1);
	listoflist.add(li2);
	listoflist.add(li3);
	
	System.out.println("Here Store List Of List Elements"+listoflist);
	}

}

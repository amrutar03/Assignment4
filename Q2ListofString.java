package Assignment3java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2ListofString {

	public static void main(String[] args) {
		
		List<String> inputlist=Arrays.asList("Git", "Github", "GitLab","GitBash", "Selenium", "Java", "Maven");
		
 		List<String>filterlist=new ArrayList<>();
 		
 			for(String str:inputlist)
 			{
 				//if(str.toLowerCase().startsWith("git"))
 				if(str.startsWith("Git"))
 				{
 					filterlist.add(str);
 				}
 				
 			}
 			
 			System.out.println("Inputlist:"+inputlist);
 			System.out.println("Outputlist:"+filterlist);
 		}
	

}

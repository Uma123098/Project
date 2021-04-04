package pendingTopics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class RepeatedNumbersArray {

	public static void main(String[] args) {
		
		//loops
		int[] array= new int[]{3,4,9,2,0,4,2,9,8,3};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[j]);
				}
			}
		}
 
		//Set
		List<Integer> arr = Arrays.asList(1,3,4,4,4,3,2,5);
	      HashSet<Integer> hCheckSet = new HashSet<>();
	      HashSet<Integer> hTargetSet = new HashSet<>();
	      for (Integer integer : arr) {
	         if(hCheckSet.add(integer)==false) {
	            hTargetSet.add(integer);
	         }
	      }
	      System.out.println("Duplicate integers in given list is/are " + hTargetSet);
	   }
		
		String date="5";
		String aString = "//span[text()='"+date+"']";
	}



import java.util.ArrayList;

public class SetOperations {
	
	// union of two array lists
	public static ArrayList<Integer> unionOf(ArrayList<Integer> setA, ArrayList<Integer> setB) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		// adds all elements in A and B to result
		result.addAll(setA);
		result.addAll(setB);
		
		// loops through result twice
		for (int i = 0; i < result.size(); i++) {
			
			for (int j = i+1; j < result.size(); j++) {
				
				// compares an element with the subsequent element to see if they are equal
				if (result.get(i) == result.get(j)) {
					
					// removes subsequent element if they match to avoid duplicates
					result.remove(j);
					
				}
		
			}
		
		}
		
		return result;
		
	}
	
	// intersection of two array lists
	public static ArrayList<Integer> intersectionOf(ArrayList<Integer> setA, ArrayList<Integer> setB) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		// adds all elements in A to result
		result.addAll(setA);
		
		// loops through each set once
		for (int i = 0; i < result.size(); i++) {
			
			for (int j = 0; j < setB.size(); j++) {
				
				// checks if each element in result (A) is not in B
				if (result.get(i) != setB.get(j)) {
					
					// removes an element from result if it cannot be found in B
					result.remove(i);
					j++;
					
				}
				
			}
			
		}
		
		return result;
	}
	
	// complement of an array list
	public static ArrayList<Integer> complementOf(ArrayList<Integer> setA, ArrayList<Integer> setB) {
		
		// loops through both array lists
		for (int i = 0; i < setA.size(); i++) {
			
			for (int j = 0; j < setB.size(); j++) {
				
				// checks if elements in set A are in B
				if (setA.get(i) == setB.get(j)) {
					
					// removes element from B if A can be found in B
					setB.remove(j);
					j++;
				}
				
			}
			
		}
		
		// returns the complement of A
		return setB;
		
	}
	
}
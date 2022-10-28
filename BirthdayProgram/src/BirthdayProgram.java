import java.util.ArrayList;

public class BirthdayProgram {
	
	private ArrayList<Person> pop;
	
	//adds random people to an array list
	public void addPop(int n) {
		
		pop = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			pop.add(new Person());
			
		}
		
	}
	
		
	public int checkBday() {
		
		int match = 0;
		
		// creates a new array list with the same people from previous array list
		ArrayList<Person> check = new ArrayList<>(pop);
			
			// checks to see if two people have corresponding birthdays by looping over the list twice
			for (int i = 0; i < check.size(); i++) {
				
				// removes a person and checks if their birthday matches with someone else
				Person p = check.remove(i);
				
				for (int j = 1; j < check.size(); j++) {
					
					if (p.getBirthday() == check.get(j).getBirthday());
						
						// increments match count by 1 for corresponding birthdays
						match++;
				}
				
				
			}
			
		return match;
		
	}
	
	// calculates the odds of 2 people within the given population size of having the same birthday 
	public double calculateOdds() {
		
		double odds = checkBday() / (double) pop.size();
		
		return odds;
		
	}
	
	

}
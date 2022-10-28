
public class BirthdayTester {

	public static void main(String[] args) {
		
		BirthdayProgram tester = new BirthdayProgram();
		
		// sets the number of people in the population
		tester.addPop(20);
		System.out.println(tester.calculateOdds() + "% chance of two people having corresponding birthdays");

		// more people in the population means a greater chance of corresponding birthdays
		tester.addPop(50);
		System.out.println(tester.calculateOdds() + "% chance of two people having corresponding birthdays");
		
		// lowest possible population that does not return a 0% chance
		tester.addPop(3);
		System.out.println(tester.calculateOdds() + "% chance of two people having corresponding birthdays");;
	}

}

import java.util.Random;

public class Person {

	private int birthday;
	
	public Person() {
	
	// creates a random birthday generator
	Random bday = new Random();
	birthday = bday.nextInt(365);
	
	}
	
	public int getBirthday() {
		return birthday;
		
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
		
	}
	
}

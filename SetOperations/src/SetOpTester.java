import java.util.ArrayList;

public class SetOpTester extends SetOperations {

	public static void main(String[] args) {
		
		ArrayList<Integer> setA = new ArrayList<>();
		ArrayList<Integer> setB = new ArrayList<>();
		
		setA.add(1);
		setA.add(2);
		setB.add(2);
		setB.add(3);
		
		System.out.println(unionOf(setA, setB));
		System.out.println(intersectionOf(setA, setB));
		System.out.println(complementOf(setA, setB));
		
	}
	
}
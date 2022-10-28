
public class StatLibraryTester extends StatLibrary {

	public static void main(String[] args) {
		
		int[] arr = {1, 5, 3, 4, 4};
		
		System.out.println("Mean: " + mean(arr));
		System.out.println("Median: " + median(arr));
		System.out.println("Mode: " + mode(arr) + ", with " + repetitions(arr) + " repetitions");
		System.out.println("Variance: " + variance(arr));
		System.out.println("Standard Deviation: " + standardDeviation(arr));
		
	}

}

import java.util.Arrays;

public class StatLibrary {
	
	// calculates the mean
	static double mean(int[] arr) {
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			// adds up all the numbers in an array
			sum+=arr[i];	
			
		}
		
		// divides sum by the number of values in an array
		return sum / arr.length;

	}
	
	// calculates median
	static int median(int[] arr) {
		
		// sorts an array
		Arrays.sort(arr);
		int mid = arr.length/2;
		int even_arr = 0;
		
		// returns the average of the two middle numbers if the array has an even number of values
		if (arr.length % 2 == 0) {
			
			even_arr = arr[mid];
			even_arr = arr[mid-1];
			
			return even_arr/2;

		}
		
		else {
			
			return arr[mid];
			
		}
		
	}
	
	// calculates mode
	static int mode(int[] arr) {
		
		int num = 0;
		int count = 0;
		
		// loops through an array twice
		for (int i = 0; i < arr.length; i++) {
			
			int counter = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				// compares the values and if they are equal, 1 is added to the counter
				if (arr[i] == arr[j]) {
					
					counter++;
				}
				
				
				// sets counter to the highest number of duplicates
				// number is stored in count
				// sets mode value to the number that appears the most
				if (counter > count) {
					
					count = counter;
					num = arr[i];
				}
				
			}
		
		}
		
		return num;
			
	}
	
	// same as mode method, but returns the number of times the mode appears
	static int repetitions(int[] arr) {
		
		int count = 0;
		int num = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int counter = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					
					counter++;
				}
				
				if (counter > count) {
					
					count = counter;
					num = arr[i];
				}
				
			}
		
		}
		
		return count;
		
	}
	
	static double variance(int[] arr) {
		
		double var = 0;
		double sum = 0;
		double val = 0;
		int n = arr.length;
		double y_bar = mean(arr);
		
		for (int i = 0; i < n; i++) {
			
			sum = Math.pow(arr[i] - y_bar, 2);
			val += sum;
			
		}
		
		var = val / (n - 1);
		
		return var;
		
	}
	
	static double standardDeviation(int[] arr) {
		
		double stdev = Math.sqrt(variance(arr));
		
		return stdev;
		
	}
		
}

/* Question 2:
    Create a class that calculates the square of the array. The array values in the common 
    resource class must be passed by the main method or class that inherits the Runnable interface.
    The thread count must be more than two. Please observe the need for the Thread thread-safe 
    feature of the method that calculates the square feature. 
*/

import java.util.*;

class SquareCalculator {
	private final Object lock = new Object();

	// Method to calculate the square of a single element in the array
	public void calculateSquare(int[] array, int index) {
		synchronized (lock) {
			array[index] = array[index] * array[index];
		}
	}
}

class ArrayProcessor implements Runnable {
	private final int[] sharedArray;
	private final SquareCalculator calculator;
	private final int index;

	public ArrayProcessor(int[] sharedArray, SquareCalculator calculator, int index) {
		this.sharedArray = sharedArray;
		this.calculator = calculator;
		this.index = index;
	}

	@Override
	public void run() {
		calculator.calculateSquare(sharedArray, index);
	}
}

public class ThreadQues2 {
	public static void main(String[] args) {
		// Example usage
		int[] array = { 1, 2, 3, 4, 5 };
		SquareCalculator calculator = new SquareCalculator();

		// Creating threads based on array length
		Thread[] threads = new Thread[array.length];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new ArrayProcessor(array, calculator, i));
			threads[i].start();
		}

		// Wait for all threads to finish
		try {
			for (Thread thread : threads) {
				thread.join();
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		// Print the squared array
		System.out.println(Arrays.toString(array));
	}

}

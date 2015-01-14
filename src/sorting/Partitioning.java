package sorting;
import java.util.Arrays;

import utility.*;

// When we partition data we are dividing it into
// two parts. All items with data above a defined value
// will go in one part and the rest will go in the other

// The value that defines in which group data will go
// is known as the pivot value

public class Partitioning {

	private static int[] theArray;
 
	private static int arraySize;

	public static void main(String[] args) {
		
		PrintHorizonalArray printHorizonalArray = new PrintHorizonalArray();
		
		GenerateRandomArray generateRandomArray = new GenerateRandomArray();
		
		Partitioning partitionArray = new Partitioning(10);
		
		System.out.println(Arrays.toString(Partitioning.theArray));

		// Every item smaller than 35 will be on the left and
		// everything bigger will be on the right

		partitionArray.partitionArray(35);

		System.out.println(Arrays.toString(Partitioning.theArray));

	}

	public void partitionArray(int pivot) {

		// If leftPointer finds an item that is greater
		// than pivot it stops and waits for the rightPointer
		// to find a value less than pivot. Then the items
		// are switched

		// Starts at the left side of array before index 0

		int leftPointer = -1;

		// Starts at the right side of the array after the last index

		int rightPointer = arraySize;

		while (true) {

			// Cycle through array until the end is reached
			// or an item bigger than pivot is found. Then
			// wait for rightPointer to finish cycling
			
			while (leftPointer < (arraySize - 1) && theArray[++leftPointer] < pivot);

			PrintHorizonalArray.printHorizonalArray(leftPointer, rightPointer);

			System.out.println(theArray[leftPointer] + " in index "
					+ leftPointer + " is bigger than the pivot value " + pivot);

			// Cycle through array until the beginning is reached
			// or an item smaller than pivot is found.

			while (rightPointer > 0 && theArray[--rightPointer] > pivot);

			PrintHorizonalArray.printHorizonalArray(leftPointer, rightPointer);

			System.out.println(theArray[rightPointer] + " in index "
					+ rightPointer + " is smaller than the pivot value "
					+ pivot);

			PrintHorizonalArray.printHorizonalArray(leftPointer, rightPointer);


			// When the 2 pointers meet at the middle break
			// out of the while loop

			if (leftPointer >= rightPointer)
				break;

			else {

				// Swap the values in the pointers

				swapValues(leftPointer, rightPointer);

				System.out.println(theArray[leftPointer] + " was swapped for "
						+ theArray[rightPointer]);

			}

		}

	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

	Partitioning(int newArraySize) {

		arraySize = newArraySize;

		theArray = new int[arraySize];
		
		GenerateRandomArray.generateRandomArray();


	}
}
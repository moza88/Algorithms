package sorting;

import utility.PrintHorizonalArray;


class MyQuickSort {
	
	private int length;
	
	static int[] array = {24,2,45,20,56,75,2,56,99,53,12};

	public static void main(String[] args) {
		MyQuickSort sorter = new MyQuickSort();
		
		//System.out.println("Original List");
		//sorter.printArray(array);
		sorter.sort(array);
		PrintHorizonalArray printHorizonalArray = new PrintHorizonalArray();

		PrintHorizonalArray.printHorizonalArray(array[0], array[array.length - 1]);

		System.out.println("Sorted List");
		sorter.printArray(array);
		
	}
	
	public void printArray(int[] array) {
		for (int i: array) {
			System.out.println(i);
		}
	}
	
	public void sort(int[] array) {
		//If the array has nulls or is empty then stop
		if (array == null || array.length == 0) {
			return;
		}
		//taking the in the instantiated array from above
		this.array = array;
		//Finding the array size
		length = array.length;
		//Instantiating our quick sort method with the left most index and the right most index
		System.out.println("length of the array: " + length);

		quickSort(0, length - 1);
		
		}
	
	private void quickSort(int leftIndex, int rightIndex) {
		
		int left = leftIndex;
		System.out.println("left " + left);
		int right = rightIndex;
		System.out.println("right " + right);

		//Calculate the pivot number, I am taking pivot as the middle index number
		int pivot = array[leftIndex + (rightIndex - leftIndex)/2];
		System.out.println("Pivot Value: " + pivot);
		
		//Divide into two arrays
		while (left <= right) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater than the pivot value, and also we will identify a number
			 * from right side which is less than the pivot value. Once the search is done
			 * we can exchange both of the numbers
			 */
			
			//If the left side is less than the pivot than go right of the array
			while (array[left] < pivot) {
				left++;
			}
			//If the right side is more than the pivot than go left of the array
			while (array[right] > pivot) {
				right--;
			}
			
			//If the left hand side is less than or equal to the right hand side, then swap left and right numbers
			if (left <= right) {
				swapNumbers(left, right);
				left++;
				right--;
			}
		}
		
		//Call the quickSort method recursively
		if (leftIndex < right) 
			quickSort(leftIndex, right);
		
		if (left < rightIndex)
			quickSort(left, rightIndex);
	}
	
	//Switching the left number with the right number
	private void swapNumbers(int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
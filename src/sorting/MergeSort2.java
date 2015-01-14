package sorting;

public class MergeSort2 {
	
	static void sort(int[] input) {
		//Merge Sort requires the array itself, low and high index (start and end index)
		mergeSort(input, 0, input.length -1);
		
	}
	
	static int[] readInputArray() {
		int[] a = {56, 12, 99, -3, 4, 5};
		return a;
	}
	//Merge sort is a recursive algorithm, it calls itself
	static void mergeSort(int[] array, int low, int high){
		if(low < high) {
			int mid = (low + high)/2;
			mergeSort(array, low, mid);
			mergeSort(array, mid+1, high);
			//This merges both of the arrays
			merge(array, low, mid, high);
		}
	}
	
	static void merge(int[] array, int low, int mid, int high) {
		int[] temp = new int[high-low+1];
		
		//Creating indexes
		int left = low;
		int right = mid + 1;
		//K is going to index into the temp array
		int k = 0;
		
		/*
		 * While the far left index is less than the mid point index and the far right index is more than it's mid point index
		 * And if the far left array value is less than the mid point value
		 * then gradually populate the temp array, once the left value is more than the right array then populate the right side
		 * 
		 */
		while (left <= mid && right <=high){
			if(array[left] < array[right]) {
				temp[k] = array[left];
				left = left + 1;
			
			} else {
				temp[k] = array[right];
				right = right + 1;
			}
			
			k = k + 1;
		}
		
		//Copying over the elements from the temp array
		if( left <= mid) {
			while(left <= mid) {
				temp[k] = array[left];
				left = left + 1;
				k = k + 1;
			}
		} else if(right <= high) {
			while(right <= high) {
				temp[k] = array[right];
				right = right + 1;
				k = k + 1;
			}
		}
			//Copying the temp array back into the original array
			for (int m = 0; m < temp.length; m++) {
				array [low + m] = temp[m];
			}
				
		}
		
	

	
	static void printArray(int[] array) {
		for (int i = 0; i<array.length; i++)
			System.out.print(array[i] + ",");
	}
	public static void main(String[] args) {
		int[] inputArray = readInputArray();
		System.out.println("Input Array:");
		printArray(inputArray);
		sort(inputArray);
		System.out.println("Sorted Array: ");
		printArray(inputArray);
	}
	
	
}

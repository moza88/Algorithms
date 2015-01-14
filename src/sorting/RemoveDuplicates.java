package sorting;

import java.util.*;


class RemoveDuplicates {
	static int[] cleanArray;

	public static void main(String[] args) {	
		int[] dupList = createArray();
		System.out.println("Original Array");
		printArray(dupList);
		sort(dupList);
		System.out.println("Sorted Array");
		printArray(dupList);
		identifyDups(dupList);
		
	}
	
	static int[] createArray() {
		int[] dupList = {56, 12, 99, 2, 2, 2, -3, 4, 5, 12, 55, 55, 1};
		
		return dupList;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) 
			System.out.println(array[i]);
		}
	
	
	public static void sort(int[] array) {
		mergeSort(array, 0, array.length-1);
	}
	
	public static void mergeSort(int[] array, int low, int high) {		
		if (low < high) {
			int mid = (high + low)/2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high); 
			merge(array, low, mid, high);
		}
	}
	
	public static void merge(int[] array, int low, int mid, int high) {
		//Creating a temporary array the same size as the original
		int[] temp = new int[high - low + 1];
		
		int left = low;
		int right = mid + 1;
		//K is going to index into the temp array
		int k = 0;
		
		while (left <= mid && right <= high ) {
			if (array[left] < array[right]) {
				temp[k] = array[left];
				left = left + 1;
	   } else { 
				temp[k] = array[right];
				right = right + 1;
			}
			k = k + 1;
		}
		
		//Copying over the elements from the temp array
		if (left <= mid) {
			while (left <= mid) {
				temp[k] = array[left];
				left = left + 1;
				k = k + 1;
			}
		} else if (right <= high) {
    		while (right <= high) {
    			temp[k] = array[right];
    			right = right + 1;
    			k = k + 1;
    		}
		}
	
	for (int i = 0; i < temp.length; i++) {
		array[low + i] = temp[i];
		}
	}
	
	//To delete something off of an array you need to replace it with the last element of the array
	//Then shrink the array, so you'll need to copy the contents into a new array
	//Use arrays.lenght - 1 to get the last element of the array

	public static void identifyDups(int[] array) {
		int[] cleanArray = new int[array.length + 1];
		
		System.out.println("Duplicates Removed");
		
		int j = 0;
		int i = 1;
		
		while (i < array.length) {
			System.out.println(array[i] + " == " + array[j]);
			if (array[i] == array[j]) {
				i++;
		} else {
			j++;
			System.out.println("Value of j is now " + j);
			System.out.println(array[j] + " = " + array[i]);
			array[j] = array[i];
			System.out.println(array[j]);
			i++;
			
			System.out.println("Value of i is now " + i);
			
			System.out.println("Work in Progress Array");
			printArray(array);

			}
		}
		
		cleanArray = Arrays.copyOf(array, j + 1);
		
		printArray(cleanArray);
		
		}

			}
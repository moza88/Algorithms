package sorting;
import java.util.*;

public class MergerSort_Example
{
	public static void main(String[] args)
	{
		Integer[] a = {2, 6, 3, 5, 1};
		mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
				System.out.println("Center:" + left + "+" + right + "/" + 2 + "=" + center);
				
			mergeSort(a, tmp, left, center);
				System.out.println("Left side sort: " + Arrays.toString(a));
			mergeSort(a, tmp, center + 1, right);
				System.out.println("Right side sort" + Arrays.toString(a));
			merge(a, tmp, left, center + 1, right);
		}
	}

	//Combining the left and right arrays
    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        	System.out.println("Left End: " + leftEnd);
        int k = left;
        System.out.println("left: " + left);
        	
        int num = rightEnd - left + 1;
        
    	System.out.println("CompareTo: " + a[left].compareTo(a[right]));

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)            	
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
 }
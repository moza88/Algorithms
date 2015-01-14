package discreteMath;

import java.util.*;

public class PrimeNumbers {
	public static void main(String[] args) {
	double max = 100;
	double numfactors = 0;
	
	for (int j = 1; j < max; j++) {
		
		for (int i = 1; i < j; i++) {
		
			double result = (double)j/i;
		
			if(result == Math.ceil(result)) {
				numfactors++;
			}
		}
		
		if (numfactors==2) {
			
			System.out.println(j + " Prime Number");
		}
		numfactors = 0;
	}
	}
}
	

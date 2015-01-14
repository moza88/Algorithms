package discreteMath;

import java.util.*;

public class FindMultiples {
	static int limit = 1000;
	static ArrayList three = new ArrayList();
	static ArrayList five = new ArrayList();
			
	public static void main(String[] args) {
	
		multiples();
		sumMultiples(five);
		int totalSum = sumMultiples(five) + sumMultiples(three);
		
		System.out.println(totalSum);
	}
	

	public static void multiples() {
		
		for (int i = 0; i < limit; i++) {
		
			if(i % 3 == 0 && i >= 3) {
				three.add(i);
			}
		
			if(i % 5 == 0 && i >= 5) {
				five.add(i);
			}
		}
	
		System.out.println("Multiples of 3 are:" + "\n" + three);
		System.out.println("Multiples of 5 are:" + "\n" + five);
	}
	
	public static int sumMultiples(ArrayList array) {
		int sum = 0;
		
		for (int i = 0; i < array.size(); i++) {
			
			sum = (int)array.get(i) + sum;
		}
		//System.out.println(sum);

		return sum;
	}
	
	}


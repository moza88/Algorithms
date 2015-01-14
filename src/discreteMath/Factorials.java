package discreteMath;

import java.util.*;


public class Factorials {

	   public static void main(String[] args) {
	       int n = 10;
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       System.out.println("The factorial of " + n + " is " + result);
	   }
	}

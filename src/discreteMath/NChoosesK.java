package discreteMath;

public class NChoosesK {
	public static void main(String[] args) {
	int n = 6;
	int k = 3;
	int top = 1;
	int r = 1;
	int nk = 1;
	
	//We need a iterator that factors 6 
		//Max would be 6
		//start at 1 because 0 would make the answer 0
		//Increment by 1 after every loop
		//We need to multiply each number by it's future self
	
		//Start this loop at 6 - 3 = 3 
		//Keep looping as long as i is greater than 3
		//Decrement after every loop
		for (int i = n - (k - 1); i <= n; i++) {
			System.out.println("i: " + i);
			top = i*top;
			System.out.println("top " +top);
			}
		
		for (int i = 1; i <= k; i++) {
			
			r = i*r;
			}
		
		for (int i = 1; i <= (n-k); i++) {
			
			nk = i*(nk);
			}
		
		int combos = (top)/(r*(nk));

		System.out.println(top + "/(" + r *(nk) + ")");
		System.out.println("You can have " + combos + " number of assortments");
	}
	
}

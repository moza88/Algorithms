package utility;

public class GenerateRandomArray {
	private static int[] theArray;

	private static int arraySize;

	public static void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			// Generate a random array with values between
			// 10 and 59

			theArray[i] = (int) (Math.random() * 50) + 10;
		}
	}
}

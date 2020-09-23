package javacore18practise;

public class GenericSYSO {

	//generic method print Array
	public static < M > void printArray(M [] inputArray) {
		//Display array elements
		for(M element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
}

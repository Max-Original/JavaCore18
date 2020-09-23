package javacore18practise;

//If generics isnt a number it wont work

public class Restricriction <T extends Number>{
	
	T[]numbers;

	public Restricriction(T[] numbers) {
		super();
		this.numbers = numbers;
	}
	//doubleValue() is used for casting from int to double
	double average () {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i].doubleValue();
		}
		
		return sum/numbers.length;
	
	}
	
}

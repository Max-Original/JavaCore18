package javacore18practise;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {

		SimpelGenerics<Double> doubleGenerics = new SimpelGenerics<Double>(12.3);
		doubleGenerics.showType();
		
		System.out.println();
		
		TwoGen<Integer, Boolean> intBool = new TwoGen<Integer, Boolean>(676, true);
		intBool.showGenerics();
		
		System.out.println();
		
		Integer [] nabir = {5,6,7,8,9};
		
		Restricriction<Integer> rNabir = new Restricriction<>(nabir);
		System.out.println(rNabir.average());
		
		System.out.println();
	
		//wildCards
		
		String [] words = {"Hello", "my", "name","is","Max"};
		
		GenericSYSO gs = new GenericSYSO();
		gs.printArray(words);
		
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		
		System.out.println(map.get(1));
	
		TwoC [] tc = {new TwoC(21, 21),new TwoC(1, 1)
		};
		
		Coords<TwoC> two = new Coords<>(tc);
		Coords.showXY(two);
	}

}

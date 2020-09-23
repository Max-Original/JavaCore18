package javacore18practise;

// Generics letters could be any leter
public class TwoGen <T,M>{

	T obj1;
	M obj2;
	
	public TwoGen (T obj1, M obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	
	public void setObj2(M obj2) {
		this.obj2 = obj2;
	}
	
	public T getObj1() {
		return obj1;
	}
	
	public M getObj2() {
		return obj2;
	}
	
	public void showGenerics() {
		System.out.println("Generics T :" + obj1.getClass().getSimpleName());
		System.out.println("Generics M :" + obj2.getClass().getSimpleName());
	}
}

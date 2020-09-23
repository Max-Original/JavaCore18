package javacore18practise;

public class SimpelGenerics <T> {
	
	T ob;
	
	public SimpelGenerics(T ob) {
		super();
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	
	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println("Type of T is: "+ ob.getClass().getSimpleName());
	}
}

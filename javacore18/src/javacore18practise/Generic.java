package javacore18practise;

//Generics letters could be any leter, as default it is T

public class Generic <T> {

	T obj;
	
	public Generic(T obj) {
		super();
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}

class Generics2<T> extends Generic<T> {

	public Generics2(T obj) {
		super(obj);
	}
	
	public T getObj() {
		return obj;
	}
	
	public void setObj (T obj) {
	this.obj = obj; 
	}
	
}

class Generics3<T,M> extends Generic<T>{
	
	M obj2;

	public Generics3(T obj, M obj2) {
		super(obj);
		this.obj2 = obj2;
	}

	public T getObj() {
		return obj;
	}
	
	public void setObj() {
		this.obj = obj;
	}
	
	public M getObj2() {
		return obj2;
	}

	public void setObj2(M obj2) {
		this.obj2 = obj2;
	}
	
	
	
}

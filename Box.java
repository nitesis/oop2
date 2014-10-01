package ch.fhnw.oop.exercise02;

public class Box<T> {
	
	private T val;
	
	Box<T> box = new Box<T>();
	
	public void setValue(T val){ 
		this.val = val;
	}
	
	public T getValue(){ 
		return val;
	}

}

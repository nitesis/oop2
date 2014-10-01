package ch.fhnw.oop.exercise02;

public class SinglyLinkedElement<T> {

	
		private T data;
		
		private SinglyLinkedElement<T> next = null;
	
		public SinglyLinkedElement(T data) { 
			this.data = data;
		}
		
		public T getData() { 
			return data;
		}
}

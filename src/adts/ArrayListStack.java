package adts;

import java.util.ArrayList;

import interfaces.StackInterface;

public class ArrayListStack<E> implements StackInterface<E> {

	private ArrayList<E> data;
	
	public ArrayListStack() {
		this.data = new ArrayList<>();
	}
	
	@Override
	public void push(E element) {
		data.add(element);
	}

	@Override
	public E pop() {
		return data.remove(data.size() - 1);
	}

	@Override
	public E peek() {
		return data.get(data.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

	public String toString() {
		StringBuilder stackStr = new StringBuilder();
		for (int i = data.size() - 1; i >=0; i-- ) {
			stackStr.append(data.get(i)).append("\n");
		}
		return stackStr.toString();
		}
	

}

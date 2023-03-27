package adts;

import interfaces.StackInterface;

public class ArrayStack<E> implements StackInterface<E> {
	 private static final int DEFAULT_CAPACITY = 50;
	 private E[] data;
	 private int top;

	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	 
	public ArrayStack(int capacity) {
		this.data = (E[]) new Object[capacity];
		this.top = -1;
	}
	
	@Override
	public void push(E element) {
		data [++top] = element;
	}

	@Override
	public E pop() {
		return data[top--];
	}

	@Override
	public E peek() {
		return data[top];
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return false;
	}
	
	public String toString() {
        StringBuilder stackStr = new StringBuilder();
        for (int i = top; i >= 0; i--) {
            stackStr.append(data[i]).append("\n");
        }
        return stackStr.toString();
    }

}

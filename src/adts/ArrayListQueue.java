package adts;

import java.util.ArrayList;

import interfaces.QueueInterface;

public class ArrayListQueue<E> implements QueueInterface<E> {

	private ArrayList<E> queue;
	
	public ArrayListQueue() {
		queue = new ArrayList<>();
	}
	@Override
	public void enqueue(E element) {
		queue.add(element);

	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}
		return queue.remove(0);
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}
	
	public String toString() {
		StringBuilder queueStr = new StringBuilder();
		for(E element : queue) {
			queueStr.append(element);
			queueStr.append(" ");
		}
		return queueStr.toString().trim();
	}

}

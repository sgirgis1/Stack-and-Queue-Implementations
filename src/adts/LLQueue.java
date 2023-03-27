package adts;

import interfaces.QueueInterface;
import nodes.LLNode;

public class LLQueue<E> implements QueueInterface<E> {
	
	LLNode<E> front;
	LLNode<E> rear;

	@Override
	public void enqueue(E element) {
		LLNode<E> newNode = new LLNode(element);
		if (rear == null) {
			rear = front = newNode;
		}
		else {
			rear.setNext(newNode);
			rear = newNode;
		}
	}

	@Override
	public E dequeue() {
		E temp = front.getData();
		front = front.getNext();
		if(front == null) {
			rear = null; 
		}
		return temp;
	}
	
	public void vip() {
		// move the rear of the queue to the front
		if (front == rear ) {
			// if (!front rear)??**
			//dont do anything ...
			// there is only one, if any, elements in the queue
		}
		else {
			LLNode<E> ptr = front;
			// ptr point to the second to last element
			while (ptr.getNext().getNext() != null) {
				ptr = ptr.getNext();
			}
			// last element becomes first, every element after that moves down
			ptr.setNext(null);
			rear.setNext(front);
			front = rear; 
			rear = ptr; 
		}
		
	}

	@Override
	public boolean isEmpty() {
		return rear == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}
	
	public String toString() {
		StringBuilder qStr = new StringBuilder("queue, front to rear: ");
		LLNode<E> ptr = front;
		while (ptr != null) {
			qStr.append(ptr.getData()+ " ");
			ptr = ptr.getNext();
		}
		return qStr.toString();
	}

}

package adts;

import interfaces.QueueInterface;

public class ArrayQueue<E> implements QueueInterface<E> {
	private static final int DEFAULT_CAPACITY = 50;
	private E[] data;
    private int front;
    private int rear;
    
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
    }

    

	@Override
	public void enqueue(E element) {
		data[++rear] = element;
	}

	@Override
	public E dequeue() {
		E temp = data[front];
		data[front++]= null;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return front > rear;
	}

	@Override
	public boolean isFull() {
		return rear == data.length - 1;
	}

	public String toString() {
		StringBuilder queueStr = new StringBuilder();
		for (int i = front; i <= rear; i++) {
			queueStr.append(data[i]).append(" ");
		}
		return queueStr.toString();
	}

}

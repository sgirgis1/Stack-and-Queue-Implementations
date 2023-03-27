package apps;
import adts.ArrayListQueue;
import adts.ArrayListStack;
import adts.ArrayQueue;
import adts.LLQueue;

public class QPlay {

	public static void main(String[] args) {
		
		//LLQueue<String> qTest = new LLQueue();
		//ArrayListQueue qTest1 = new ArrayListQueue();
		ArrayQueue qTest2 = new ArrayQueue();
		
		qTest2.enqueue("Mets");
		qTest2.enqueue("Nationals");
		qTest2.enqueue("Phillies");
		qTest2.enqueue("Braves");
		qTest2.enqueue("Marlins");
		//qTest.vip();
		System.out.println(qTest2);
		
		
		
		System.out.println(qTest2.isEmpty() ? "myQ is empty" : "myQ is not empty");
		System.out.println(qTest2.isFull()  ? "myQ is full"  : "myQ is not full");
		System.out.println(qTest2.dequeue());  //Explicitly test dequeue return value
		qTest2.dequeue();
		qTest2.dequeue();
		qTest2.dequeue();
		qTest2.dequeue();
		System.out.println(qTest2);
		System.out.println(qTest2.isEmpty() ? "myQ is empty" : "myQ is not empty");
		System.out.println(qTest2.isFull()  ? "myQ is full"  : "myQ is not full");
		
		
		LLQueue<Integer> myIntQ = new LLQueue();
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				myIntQ.enqueue(i);
			}
		}
		System.out.println(myIntQ);
		
		while (!myIntQ.isEmpty()) {
			myIntQ.dequeue();
		}
		System.out.println(myIntQ);
		System.out.println(myIntQ.isEmpty() ? "It's empty now!" : "How did I get here?");
		

	}

}

package apps;

import adts.*;

public class StackPlay {

	public static void main(String[] args) {
		
		//LLStack<String> lTest = new LLStack<>();
		//ArrayListStack lTest1 = new ArrayListStack();
		ArrayStack lTest2 = new ArrayStack();
		
		System.out.println(lTest2);
		System.out.println(lTest2.isEmpty() ? "stack is empty" : "stack is not empty");
		System.out.println(lTest2.isFull()  ? "stack is full"  : "stack is not full");
		
		
		
		lTest2.push("Tomorrow");
		lTest2.push("Never");
		lTest2.push("Better");
		//System.out.println(myStack);
		
		/**/
		lTest2.pop( );
		lTest2.pop( );
		lTest2.push("Of");
		lTest2.push("Luck");
		lTest2.pop( );
		lTest2.push("Edge");
		lTest2.push("Darkness");
		lTest2.push("Dies");
		lTest2.pop( );
		lTest2.pop( );
		lTest2.push("Day");
		lTest2.pop( );
		
		System.out.println(lTest2);
		System.out.println(lTest2.isEmpty() ? "stack is empty" : "stack is not empty");
		System.out.println(lTest2.isFull()  ? "stack is full"  : "stack is not full");
		
		System.out.println("\nTest peek - should be Edge: " + lTest2.peek());
		System.out.println("\nClear out the stack and explicitly test pop return value:");
		while (!lTest2.isEmpty()) {
			System.out.println(lTest2.pop());
		}
		System.out.println(lTest2.isEmpty() ? "stack is empty" : "stack is not empty");
		System.out.println(lTest2.isFull()  ? "stack is full"  : "stack is not full");
		/**/
	}

}

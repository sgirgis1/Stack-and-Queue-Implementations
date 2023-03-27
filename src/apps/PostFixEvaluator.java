//----------------------------------------------------------------------
// PostFixEvaluator.java       by Dale/Joyce/Weems             Chapter 3
//
// Provides a postfix expression evaluation.
//----------------------------------------------------------------------

package apps;

import adts.LLStack;
import java.util.Scanner;

public class PostFixEvaluator {
	
  public static int evaluate(String expression)  {
	  
    LLStack<Integer> stack = new LLStack<Integer>();  

    int value;
    
    String operator;

    int operand1;
    int operand2 = 0;

    int result = 0;

    Scanner tokenizer = new Scanner(expression);

    while (tokenizer.hasNext()) {
    	    	
    	if (tokenizer.hasNextInt()) {  // must be an operand
    		value = tokenizer.nextInt();
    		if (stack.isFull()) {
    			throw new PostFixException("Stack overflow");
    		}
    		stack.push(value);
    	}
    	else {
    		// assume next token is an operator
    		operator = tokenizer.next();
    		
    		if (!operator.equals("++")) {
    			// pop second operand
        		if (stack.isEmpty()) {
        			throw new PostFixException("Not enough operands - stack underflow");
        		}
        		operand2 = stack.pop();	
    		}
    		
    		// pop first operand
    		if (stack.isEmpty()) {
    	          throw new PostFixException("Not enough operands - stack underflow");
    		}
    		operand1 = stack.pop();

            // Perform operation.
            if (operator.equals("/"))
               result = operand1 / operand2;
            else
            if (operator.equals("*"))
               result = operand1 * operand2;
            else
            if (operator.equals("+"))
               result = operand1 + operand2;
            else
            if (operator.equals("-"))
               result = operand1 - operand2;
            else
            if (operator.equals("++"))
                result = ++operand1;
            else
            if (operator.equals("^"))
            	//result = (int)Math.pow((double)operand1,operand2);
            	if(operand2 == 0) {
            		result = 1;
            	}
            	else {
            		result = operand1;
            		for (int i =0; i < operand2- 1; i++) {
            			result = result * operand1;
            		}
            	}
            else
                throw new PostFixException("Illegal symbol: " + operator);
            
            // push result of operation onto stack
            stack.push(result);
        }
    }

    // pop final result off stack 
    if (stack.isEmpty()) {
        throw new PostFixException("Stack underflow during attempt to get final result");
    }
    result = stack.pop();

    // stack should now be empty
    if (!stack.isEmpty()) {
        throw new PostFixException("Too many operands - operands left over");
    }

    return result;
  }
}
package src.Stack;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		reversestack(stack);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

	private static void reversestack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		 	
		if(stack.isEmpty()) 
		{
			return;
		}
				
		int temp=stack.pop();
		reversestack(stack);
		insertatBottom(stack,temp);	
		
		
	}
	private static void insertatBottom(Stack<Integer> stack, int i) {
		// TODO Auto-generated method stub
		if(!stack.isEmpty()) {
			int tem=stack.pop();
			insertatBottom(stack, i);
			stack.push(tem);
			
			}
	else 
	    {
			stack.push(i);
		}
		
	
	}

}

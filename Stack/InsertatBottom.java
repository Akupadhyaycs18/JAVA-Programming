package Stack;

import java.util.Stack;

public class InsertatBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		insertatBottom(stack,10);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	private static void insertatBottom(Stack<Integer> stack, int i) {
		// TODO Auto-generated method stub
		
		if(!stack.isEmpty()) {
			int temp=stack.pop();
			insertatBottom(stack, i);
			stack.push(temp);
			
	}
		else {
			stack.push(i);
		}

		
		
	}
}



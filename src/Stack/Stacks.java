package src.Stack;


import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
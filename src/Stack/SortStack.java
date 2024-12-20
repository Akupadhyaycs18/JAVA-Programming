package src.Stack;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<>();
		
		st.push(9);
		st.push(-1);
		st.push(120);
		st.push(2);
		
		sort(st);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
	}

	private static void sort(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int temp=st.pop();
		sort(st);
		insertAtcorrectpostion(st,temp);
		
	}

	private static void insertAtcorrectpostion(Stack<Integer> st, int temp) {
		// TODO Auto-generated method stub
		
		if(st.isEmpty()||st.peek()<temp) {
			st.push(temp);
			return;
		}
		int ele=st.pop();
		insertAtcorrectpostion(st,temp);
		st.push(ele);
	}

}

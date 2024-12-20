package src.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,2,7,5,4,6,8,19};
		nge(arr);
		
	}
	private static void nge(int[] arr) {
		int ans[]=new int[arr.length];
		
		Stack<Integer> st=new Stack<>();
		for( int i=0; i<arr.length;i++) {
			
			while(!st.isEmpty()&&arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
				
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			ans[st.pop()]=-1;
		}
		System.out.println(Arrays.toString(ans));
	}
}

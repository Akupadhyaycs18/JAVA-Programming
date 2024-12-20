package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StoackSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3 ,66 ,1 ,4 ,18 ,7 , 5 ,11};
		
		stockspan(arr);

	}

	private static void stockspan(int[] arr) {
		// TODO Auto-generated method stub
	
			int ans[]=new int[arr.length];
			
			Stack<Integer> st=new Stack<>();
			for( int i=0; i<arr.length;i++) {
				
				while(!st.isEmpty()&&arr[i]>arr[st.peek()]) {
					st.pop();
					
				}
			if(st.isEmpty()) {
				ans[i]=i+1;
				
			}
			else {
				ans[i]=i-st.peek();
			}
			}
			
			System.out.println(Arrays.toString(ans));
		}
		
	}



package src.Pattern;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=0;
		int nst=2*n-1;
		int nrow=5;
		
		
		for(int row=1;row<=nrow;row++) {
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
	
				System.out.print("*");
			}
			System.out.println();
			nst=nst-2; 
			nsp=nsp+1;

		}

	}

}

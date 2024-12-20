package Pattern;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=0;
		int nst=5;
		int nrow=2*n-1;
		
		for(int row=1;row<=nrow;row++) {
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++) {
	
				System.out.print("* ");
			}
			System.out.println();
			if(row<=(2*n-1)/2) {
				nst=nst-1;
				nsp=nsp+2;
			}
			else {
				nst=nst+1;
				nsp=nsp-2;
			}
		}
	}

}

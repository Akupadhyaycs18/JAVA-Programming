package Pattern;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int nsp=0;
		int nrow=2*n-1;
		
		for(int row =1 ; row<=nrow; row++) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			System.out.println();
			if(row<=(2*n-1)/2) {
				nst=nst+1;
			}
			else {
				nst=nst-1;
			}
			
			
		}

	}

}

package src.Pattern;

public class Q2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int nsp=0;
		int nrow=n;
		
		for(int row =1 ; row<=nrow; row++) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			System.out.println();
			nst=nst+1;
			
		}

	}


}
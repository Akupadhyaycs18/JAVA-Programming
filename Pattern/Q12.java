package Pattern;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=n-1;
		int nst=1;
		int nrow=n;
		
		for(int row=1;row<=nrow;row++) {
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
				 	
			}
			for(int cst=1;cst<=nst;cst++) {
				
				if(cst%2==0)
					{
					System.out.print("!");
					}
				else
				    System.out.print("*");	
				    }
			System.out.println();
			nst=nst+2; 
			nsp=nsp-1;
			}
				
			
			
			

		}
		

	}



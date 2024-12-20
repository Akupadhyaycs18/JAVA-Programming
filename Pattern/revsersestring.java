package Pattern;

public class revsersestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Geeks", nstr = "";
	        char ch;

	        for (int i = 0; i < str.length(); i++) {
	              
	              // extracts each character
	            ch = str.charAt(i);
	          
	              // adds each character in
	            // front of the existing string
	            nstr = ch + nstr; 
	        }
	      
	        System.out.println(nstr);
	    }

	}



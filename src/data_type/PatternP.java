package data_type;

public class PatternP {
		    public static void main(String[] args) {
	        int numRows = 5; 


	        for (int i = 1; i <= numRows; i++) {
	          
	            for (int j = 1; j <= numRows; j++) {
	                if (j <= i) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	          
	            System.out.println();
	        }
	    }
	}




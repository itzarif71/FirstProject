package data_type;

public class Row {
	public static void main(String[]args) {
		  int numRows = 5; // You can change this to the desired number of rows

	        for (int i = 1; i <= numRows; i++) {
	            if (i % 2 == 0) {
	                // Even row: print even numbers
	                for (int j = 1; j <= i; j++) {
	                    System.out.print(j*2+" ");
	                }
	            } else {
	                // Odd row: print odd numbers
	                for (int j = 1; j <= i; j++) {
	                    System.out.print(j*2 -1+" ");
	                }
	            }

	            System.out.println(); // Move to the next line after each row
	        }
}
}
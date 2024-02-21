package data_type;

import java.util.Scanner;

public class MethodChaining {
	public static void information() {
		String info="This is area calcuting program";
		
		System.out.println(info);
	}
	
     public static void userinformation (String name,int age) {
          System.out.println("Hi "+name+"("+age+")"+"we will find your house construction price");	
            	
            }
    public static int perimeter(int x, int y) {
    	return (x+y)*2;
    	
    }
   
    public static int totalbricks(int x, int y,int sizebrick) {
    	int perimeter=perimeter(x, y);
    	return perimeter/sizebrick;
    }
    
    public static int totalbricksprice(int x, int y,int sizebrick ,int bricksprice ) {
    	int totalbricks=totalbricks(x, y, sizebrick);
    	return totalbricks * bricksprice;
    }
    
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("please provide length size"); 
    	
    	int length=sc.nextInt();
    	System.out.println("please provide breadth size");
    	int breath=sc.nextInt();
		System.out.println(totalbricksprice(10, 20,2,5));
		
		System.err.println(perimeter(length,breath));
		
		System.err.println(totalbricks(10, 20, 2));
		
	}
}

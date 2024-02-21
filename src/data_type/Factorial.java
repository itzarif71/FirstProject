package data_type;


public class Factorial {
	public static void main(String[] args) {
		int factorial =4;
		int number=4;
	for (int i= 1; i<number; i++) {
//		System.out.println(factorial+"X"+i);
		factorial=factorial*i;
			
	}
			
	System.out.println(factorial);		
		  
	WithoutArgumentWithoutRetunType.area();
	WithArgumentWithoutReturnType.area(10, 10);
	System.out.println(WithoutArgumentWithReturnType.area());
	System.out.println(WithArgumentWithReturnType.area(10, 10));
	}
}
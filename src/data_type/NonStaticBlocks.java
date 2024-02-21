package data_type;

public class NonStaticBlocks {
	
	
	{
		System.err.println("non ststic block");
	}
	static{
		System.out.println("static block running");
	}
	
	{
		System.err.println("non ststic block");
	}
	static{
		System.out.println("static block running");
	}
	static int x=20;
	int y=30;
	
	
	public void m1() {
		System.out.println("m1 method running");
	}
	
	public static void m2() {
		System.out.println("m2 method running");
	}
	
	
	public static void main(String[] args) {
		//first jvm checks main method 
		//when main method found jvm search for all objects and object created
		//it will start searching for static members for first and load all static members into jvm
		//as well as non static members
		//then all the non static members will load in object
		
		m2();
		System.out.println(x);
		NonStaticBlocks obj=new NonStaticBlocks();
		obj.m1();
	}
	

}

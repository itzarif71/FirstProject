package data_type;

public class NonStaticCritical {
	static int x=10;
	static {
		m1();
		System.out.println(x);
		x=20;
	}
	
	public static void m1() {
		System.out.println(y);
		System.out.println(x+y);
		System.out.println("m1 completed");
	}
	static int y=20;	
	
public static void main(String[] args) {
	m1();
}
}

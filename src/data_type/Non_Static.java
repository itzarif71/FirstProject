package data_type;

public class Non_Static {
	int x=2;
	int y=4;
	public static void main(String[] args) {
		Non_Static obj=new Non_Static();
		System.out.println(obj.x+obj.y);
		
		
		int x=2;
		int y=4;
		int area=x*y;
		System.out.println(area);
		
	}

}

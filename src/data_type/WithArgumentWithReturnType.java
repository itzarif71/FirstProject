package data_type;

public class WithArgumentWithReturnType {
public static int area(int x,int y) {
	int area=x*y;
	return area;
}
public static void main(String[] args) {
	int area=area(10,10);
	System.out.println(area);
}
}

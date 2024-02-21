package data_type;

public class Odd_number {
	public static void main(String[] args) {
	int count=0;
	
	for(int i=1;true;i++) {
		if(i%2==0) {
			System.out.println(i);
			count++;
		}
		if(count==20) {
			break;
		}
	}
	
	}
	

}

package data_type;

public class Prime_prac {
	public static void main(String[] args) {
		int count=0;
		
		
		for(int i=2;true;i++) {
			int timesDivisibleByNumber=0;
		
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				timesDivisibleByNumber++;
			}
		}
		
		if(timesDivisibleByNumber==2) {
			System.out.println(i);
		}
		count++;
		if(count==10) {
			break;
		}
}
}
}

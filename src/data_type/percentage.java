package data_type;

import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("provide subject marks");
		int math=sc.nextInt();
		System.out.println("provide next subject marks");
		int english=sc.nextInt();
		System.out.println("provide next subject marks");
		int computer=sc.nextInt();
		System.out.println("provide next subject marks");
		int oops=sc.nextInt();
		int total=math+english+computer+oops;
		double percentage=total*100/400;
		
		System.out.println("this is the percentage"+percentage);
		
	}

}

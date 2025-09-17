import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
	System.out.println("Printing from 1 to 10 numbers");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c= a*b;
		System.out.println("Multpilication of a & b is>>"+c);
		
		
	}

}

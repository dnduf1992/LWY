package day4;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 =20;
		int res = num1 + num2;
			System.out.println( "두 수의 합은 ="+ res);
		
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1+"과"+num2+"의 합 ="+(num1 + num2));
			
		}
	}

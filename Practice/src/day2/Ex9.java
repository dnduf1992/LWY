package day2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("달의 마지막 일수.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month) {
		case 1 :case 3 :case 5 :case 7 :
		case 8 :case 10 :case 12 :
			System.out.println("31일");
			break;
		case 4:
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일");
			break;
		case 2 :
			System.out.println("28일");
			break;
		default:
			System.out.println("잘못 입력했습니다. ");
		}
	}

}

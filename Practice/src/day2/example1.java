package day2;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();
		
		//짝수 : num를 2로 (나누었을 때 나머지)가 0과 (같다)
		boolean isEven = num % 2 == 0;
		System.out.println(isEven);
	}

}

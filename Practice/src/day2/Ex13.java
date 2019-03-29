package day2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int num, i , cnt;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(i=1,cnt=0; i<=num; i++ ){
			if(num % 1 == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num+"는 소수");
		}
		else{
			System.out.println(num+ "는 소수가 아님");
		}
	}

}

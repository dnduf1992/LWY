package day4;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// �� ������ ��� �����ڸ� �Է¹޾� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���
		int num1, num2;
		char op;
		Scanner scan = new Scanner(System.in);
	    num1 = scan.nextInt();
		num2 = scan.nextInt();
		op = scan.next().charAt(0);
		
		switch (op) {
		case '+' :
			System.out.println("" + num1 + op + num2 + "=" + (num1 + num2));
			break;
		}	
		switch (op) {
		case '-' :
			System.out.println("" + num1 + op + num2 + "=" + (num1 - num2));
			break;	
		}
		switch (op) {
		case '*' :
			System.out.println("" + num1 + op + num2 + "=" + (num1 * num2));
			break;	
		}	
		switch (op) {
		case '/' :
			switch(num2){
			case 0:
				System.out.println("0���� ���� �� �����ϴ�");
				break;
			}
		default :
			System.out.println("" + num1 + op + num2 + "=" + ((double)num1 / num2));
			break;	
			
	

			
		}

	}

}
	
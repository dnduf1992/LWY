package day4;

public class ex4 {

	public static void main(String[] args) {
		// �� ���� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.
		int num1 = 8, num2 = 12;
		int i = 1, gcd = 1;
		System.out.print(num1+"��"+num2+"�� ����� :");
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(num1+"��"+num2+"�ִ����� :" +gcd);
	}

}

package day3;

public class ex6 {

	public static void main(String[] args) {
		int i=1;
		int num = 2;
		int res = 0;
		
		for(num=2; num<=9; num++){
			System.out.println(num+"단");
			for(i=1; i<=9; i++){
				res = num * i;
				System.out.println(num+"x"+i+"="+res);
				}
			}
		}
	}

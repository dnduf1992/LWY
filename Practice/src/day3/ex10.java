package day3;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		int num = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=1; j<=7-i; j++){
				System.out.print("*");
			}
		System.out.println();
		}

	}

}

package day4;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int i,j;
		for(i=1; i<=num; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=1 ; j<=2*(num-i)+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

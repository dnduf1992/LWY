package day3;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		for(i=0; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i*2-1; j++){
				System.out.print("*");
			}			
		System.out.println();
		}
	}
}

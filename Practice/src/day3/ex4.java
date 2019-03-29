package day3;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//서로소란 두 수의 최대 공약수가 1인 두 수 사이의 관계를 말함
		//3과 7은 서로소 관계
		//4와 6은 서로소 관계가 아님ㅋ
		
		int num1=3, num2=7;
		int i, gcd=1;
		for(i=1; i<=num1; i++){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
			}
		}
		if(gcd == 1){
			System.out.println(num1+"과"+num2+"가 서로소 관계"); 
		}
	}
}


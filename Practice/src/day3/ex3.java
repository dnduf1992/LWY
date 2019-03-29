package day3;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*소수판별 
 * i가 num의 약수이면
 * 2가 4의 약수이면
 * 약수 : num % i == 0
 * Q. 두 수의 최대 공약수를 구하는 코드를 작성하세요.
 * 최대 공약수:두 수의 공약수 중 가장 큰 공약수
 * 공약수:두 수의 약수중에서 공통으로 들어가 있는 약수
 * 8 : 1 2 4 8
 * 12 : 1 2 3 4 6 12
 * 8과 12의 공약수 1 2 4
 * 8과 12의 최대공약수 4
 * gcd : 최대공약수의 약어
 * 반복횟수 :i를 1부터 num1까지 하나씩 증가
 * 실행문
 * i가 num1과 num2의 공약수이면
 * =>i가 num1의 약수이(고) i가 num2의 약수이(면)
 * gcd에 i를 저장한다.
 * 반복문이 종료된 후 gcd를 출력한다*/
	int num1=8, num2=12;
	int i, gcd=1;
	for(i=1; i<=num1; i++){
		if(num1 % i == 0 && num2 % i == 0){
			gcd = i;
		}
	}	
	System.out.println(num1+"과"+num2+"의 최대공약수  = " +gcd);	
	}

}

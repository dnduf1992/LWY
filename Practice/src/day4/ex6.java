package day4;

public class ex6 {

	public static void main(String[] args) {
		// 100이하의 소수를 모두 출력하는 코드를 작성하세요.
		int num = 6;
		int i, cnt=0;
		for(num=1; num<=100; num++){
			for(i=1,cnt=0; i<=num; i++){
				if(num % i == 0){
					cnt++;
				}
			}
			if(cnt == 2){
				System.out.println(num+" ");
			}
		}
		System.out.println();
	}
}
package day2;

public class example6 {
	//num가 2의 배수이면 2의 배수라고 출력하고
	//num가 3의 배수이면 3의 배수라고 출력하고
	//num가 6의 배수이면 6의 배수라고 출력하고
	//num가 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다
	//라고 출력하는 예제
	//num = 6 => 6의배수입니다만 출력해야 한다
	//예제의 목적 : 조건문에서 순서가 중요하다는 걸 확인
	public static void main(String[] args) {
		// num가 2의 배수이면 2의 배수라고 출력하는 예제
		//2, 4, 6, 8, 10, ...
		//num를 2로 나누었을 때 나머지가 0과 같다면 2의
		//배수라고 출력하는 예제
		int num = 6;
		if(num % 2 == 0 && num % 3 != 0){
			System.out.println(num+ "는 2의 배수");
		}else if(num % 3 == 0 && num % 2 != 0){
			System.out.println(num+ "3의 배수");
		}else if(num % 6 == 0){
			System.out.println(num+ "6의 배수");		
		}
		if(  )
	}

}

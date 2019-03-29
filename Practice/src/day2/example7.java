package day2;

public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 101;
		if(score >= 90 && score <=100){
			System.out.println(score+"A");
		}
		else if(score < 90 && score >=80){
			System.out.println(score+"B");
		}
		else if(score < 80 && score >=70){
			System.out.println(score+"C");
		}
		else if(score < 70 && score >=60){
			System.out.println(score+"D");
		}
		else if(score < 60 && score >=0){
			System.out.println(score+"F");
		}
		else {
			System.out.println("잘못된 점수입니다.");
		}
			
				
		
		
	}

}

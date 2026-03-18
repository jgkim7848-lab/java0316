package day02;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//카페에 제출하면됨.
		/*국어 영어 수학 점수를 변수로 선언하고 값을 저장.
		 * 합계와 평균을 출력.
		 * 평균의 소수점은 표시
		 * 평균 80 이상이면 합격, 아니면 불합격*/
		int Kor;
		int Eng;
		int Math;
		Kor = 78;
		Eng = 59;
		Math = 84;
		
		int all;
		float avg;
		
		all = Kor + Eng + Math;
		
		avg = (float)(all/3.0);
		
		System.out.println("합계: " + all);
		System.out.println("평균: "+ avg);
		
		System.out.println(avg >= 80 ? "평균 80 이상으로 합격" : "평균 80 이하로 불합격");
	
	
		System.out.printf("%.2f", avg);
		
	}

}

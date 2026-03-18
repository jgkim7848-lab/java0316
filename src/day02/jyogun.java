package day02;

public class jyogun {

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
		Kor = 708;
		Eng = 509;
		Math = 804;
		
		int all;
		float avg;
		
		all = Kor + Eng + Math;
		
		avg = (float)(all/3.0);
		
		System.out.println("합계: " + all);
		System.out.println("평균: "+ avg);
		
		System.out.println(avg >= 80 ? "평균 80 이상으로 합격" : "평균 80 이하로 불합격");
	
	
		System.out.println();
		
		if(avg >= 80) {
			System.out.println("합격");
		} else if (avg >= 60){
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}
		
		System.out.println("\n\n\n---------------------------------\n\n\n");
		
		
		//avg의 제한걸기 최대100 최소0인걸로
		if(avg > 100) { //if(avg>100 || avg<0)으로해도 된다
			System.out.println("오류");
		} else if(avg >= 80) {
			System.out.println("합격");
		} else if (avg >= 60){
			System.out.println("통과");
		} else if(avg >= 0){
			System.out.println("탈락");
		} else {
			System.out.println("오류");
		}
		
		
		
		
		
		
		
		
	}

}

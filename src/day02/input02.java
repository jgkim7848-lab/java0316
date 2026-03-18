package day02;

import java.util.Scanner;

public class input02 {

	public static void main(String[] args) {
		// Exam01의 국영수를 내가 입력받는걸로 하고시프다ㅏㅏ
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 입력 > ");
		int kor = scan.nextInt();
		
		if(kor > 100 || kor < 0) {
			System.out.println("잘못 된 점수 입니다.");
			scan.close();
			return;//return의 의미와 사용법.....
			//나를 실행하고있는 메서드의 종료.
			//나는 지금 main이라고 하는 메서드 안에서 실행되고있으므로 main을 빠져나가겠다는 큰결심
			//니가 이 조건에 걸리면 난 처리 안하고 main을 나가버리겠도르.
			//scanner가 안닫힌채로 종료되서 불만이 있기는함. 고로 상황마다 붙여주면 되기야 하겠지??
			
		}
		
		
		System.out.println("영어 점수 입력 > ");
		int eng = scan.nextInt();
		if(eng > 100 || eng < 0) {
			System.out.println("잘못 된 점수 입니다.");
			scan.close();
			return;
		}
		
		
		System.out.println("수학 점수 입력 > ");
		int math = scan.nextInt();
		if(math > 100 || math < 0) {
			System.out.println("잘못 된 점수 입니다.");
			scan.close();
			return;
		}
		
			
		int all = kor + eng + math;
		System.out.println("총 점수의 합: " + all);
		
		float avg = all / (float)3;
		
		System.out.println("평균: " + avg);
		
		

		if(avg > 100 || avg < 0) {
			System.out.println("오류");
		} else if(avg >= 80){
			System.out.println("합격");
		} else if(avg >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("불합격");
		}
		
		scan.close();
	}

}

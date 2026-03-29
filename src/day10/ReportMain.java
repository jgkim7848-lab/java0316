package day10;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// 이름 국어 영어 수학 합계 평균 등수.
		//hong
		//kim
		//lee
		//합계 평균 등수는 금방하제???
		//출력, getter setter
		//생성자로 입력받아야되는건 바로 입력받으면 된다...>이름과 점수.
		//main에서 객체의 값을 입력받아 객체 생성후 배열에 저장.
		//이후 등수를 구한후 출력.
		
		//report[] > 여러 학생의 점수를 보관 > 등수 > 출력.
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * System.out.print("몇명의 학생 정보를 입력할지 작성해주세요.\n>> "); int n = scan.nextInt();
		 * 
		 * Report[] arr = new Report[n];
		 * 
		 * // 1. 입력 for (int i = 0; i < n; i++) { arr[i] = new Report(); arr[i].input();
		 * }
		 * 
		 * // 2. 등수 계산 for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) { if
		 * (arr[i].getAll() < arr[j].getAll()) { arr[i].setRank(arr[i].getRank() + 1); }
		 * } }
		 * 
		 * // 3. 출력 System.out.println("\n이름\t국어\t영어\t수학\t합계\t평균\t등수"); for (int i = 0;
		 * i < n; i++) { arr[i].print(); }
		 *///>>> 내가 했던거.
		System.out.println("성적산출인원");
		int count = scan.nextInt();
		Report[] report = new Report[count];

		//바로위의 2줄도 되고 바로 아랫줄도 되고...
		report[0]= new Report("홍길동", 78, 98, 44);
		for(int i = 0; i < count; i++) {
			System.out.println(i+1 + "번째  " + "이름, 국어, 영어, 수학 순으로 입력> ");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			Report r = new Report(name, kor, eng, math);
			report[i] = r;
		}
		
		for(int i = 0; i < count; i++) {
			int rank = 1;
			for(int j = 0; j < count; j++) {
				if(report[i].getAvg() < report[i].getAvg()) {
					rank++;
				}
			}
			report[i].setRank(rank);
		}
		
		
		
		
		
		
		
		//출력
		System.out.println("\n이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("================");
		for(Report r : report) {
			System.out.println(r);
		}
	}

}

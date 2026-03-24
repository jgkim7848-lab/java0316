package day07;

import java.util.Scanner;

public class _03_MultyArray03teachever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적산출인원 > ");
		int tester = scan.nextInt(); //인원수.
		int subject = 3; //과목수
		
		String[] name = new String[tester];
		
		int[][] scores = new int[tester][subject];
		int[] total = new int[tester];
		double[] avg = new double[tester];
		int[] ranking = new int[tester];
		
		//이름 점수 입력받기.
		
		for(int i = 0; i < tester; i++) {
			System.out.println(i+1+"번째 학생> ");
			name[i] = scan.next();
			System.out.println(name[i] + "의 성적(국어 영어 수학) > ");
			for(int j = 0; j < scores[i].length; j++) {
				scores[i][j] = scan.nextInt();
				total[i] += scores[i][j];
			}
			avg[i] = total[i] / (double)subject;
			
		}
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i = 0; i < tester; i++) {
			System.out.println(name[i] + "\t");
			//성적만 2차원 배열이니까 j도 돌려야지
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print(total[i] + "\t");
			System.out.printf("%.2f\t", avg[i]);
		}
	}

}

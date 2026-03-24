package day07;

import java.util.Scanner;

public class _03_MultyArray03 {

	public static void main(String[]  args) {
		// TODO Auto-generated method stub
//성적표
		/*성적 산출 인원 3 입력
		 * 이름 국어 영어 수학 합계 평균 등수
		 * \t 붙이면 tab 단위로 띄워쓰기가 가능해짐.
		 * hong 89 85 78 합계 평균 등수   
		 * 이런거 3명
		 * kim lee 써~
		 * 이름은 문자인데 나머진 double로 되네???
		 *
		 * 이름 국어 영어 수학을 입력받아 합계 평균 등수를 구하겠도르
		 * 이걸 다 배열로는 못구하고 사실상 국영수 부분만 입력이 가능하겠지....??
		 * 
		 * */
		String[][] name = new String[3][1];
		double [] [] grade = new double[3][6];
		
		Scanner scan = new Scanner(System.in);
		
		int all = 0;
		double avg = 0;
		
		for(int i = 0; i < grade.length; i++) {
			
			System.out.print("이름: ");
			name[i][0] = scan.next();
			System.out.println();
			System.out.println("국어 영어 수학: ");
			for(int j = 0; j < 3; j++) {
				grade[i][j] = scan.nextInt();
				all = all + (int)grade[i][j];
			}
			grade[i][3] = all;
			avg = (double)all / 3;
			grade[i][4] = avg;
			
			all = 0;
			avg = 0;
			
		}
		
		int rank = 1;
		for(int i = 0; i < grade.length; i++) {
			int j = 0;
			for(j = 0; j < grade.length; j++) {
				if(grade[i][4] < grade[j][4]) {
					rank++;
				}
				
				
			}
			j = 0;
			grade[i][5] = rank;
			rank = 1;
			
		}
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i = 0; i < grade.length; i++) {
			
			System.out.print(name[i][0] + "\t");
			
			for(int j = 0; j < grade[i].length; j++) {
				
				if(j == 4 || j == 5) {
					System.out.print((int)grade[i][j] + "\t");
				} else {
					
					
					System.out.print(grade[i][j] + "\t");
				}
				
				
				
			}
			System.out.println();
		}
		
		
		
	}

}

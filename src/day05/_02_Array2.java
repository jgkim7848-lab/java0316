package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _02_Array2 {

	public static void main(String[] args) {
		//5명 점수 입력받기. 배열로 생성.
		/*
		 * 1 배열 생성
		 * 2 점수 입력 받기
		 * 3 점수 출력
		 * 4 점수 합계와 평균 출력.*/
		System.out.println("5명의 점수를 입력해주세요. (0~100)");
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int all = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i] > 100 || num[i] < 0) {
				System.out.println("0에서 100 사이 숫자를 입력해주세요.");
				i--;
				continue;
				//와 시발 gpt가 알려줬는데 쌌다.
				//근데 while문이 더 좋을듯. 이거 꼭 정리해서
				//블로그 올려라.
			}
			/*while(조건에안맞는동안계속){
			 * num[i] = scan.nextInt();
			 * }
			 * 이렇게 하면 계속 조건에 맞을때까지 입력해야되는
			 * 마법이 발생하게됨.
			 * */
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			all = all + num[i];
		}
		System.out.println("모든 점수 합계>> " + all);
		System.out.println("평균>> " + (double)all / (double)5);
		
		
		scan.close();
		
	}
}

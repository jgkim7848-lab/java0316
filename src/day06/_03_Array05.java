package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _03_Array05 {

	public static void main(String[] args) {
		// 1~50의 랜덤수 배열에 저장후 출력.
		//최대ㅡ 최소ㅡ 합계ㅜ 평균 출력
		//10개 숫자
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		Random rand = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(49)+1;
		}
		for(int s:arr) {
			System.out.print(s + " ");
		}
		
		
		System.out.println();
		
		int max = 0;
		int min = 50;
		int all = 0;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {

			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {

			all = all + arr[i];
		}
		
		System.out.println("최대: " + max);
		System.out.println("최소: " + min);
		System.out.println("합계: " + all);
		System.out.println("평균: " + (double)all/(double)arr.length);
		
		
		
		//왜  for문 밖에서 int max; 선언만 하고 for 문 안에서 max = 0 박고
		//  max 계산 돌린 뒤에 for문 나와서 밖에서 max 출력하려고 하면
		//오류 나오는건지 모르겠다.
	}

}

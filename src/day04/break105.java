package day04;

import java.util.Scanner;

public class break105 {

	public static void main(String[] args) {
		// 반복문 탈출 키워드
		//조건문 반복문을 포함하여 조건이 맞을때 이 반복문을 벗어나게 해달라 하는게 가능함.
		//continue - 조건이 맞으면 그냥 스킵의 개념.
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}		
		
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				continue;     //5인경우 스킵                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			}
			System.out.println(i);
		}
		
		//홀수를 continue하는것
		System.out.println("--------------");
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 1) {
				continue;     //5인경우 스킵                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			}
			System.out.println(i);
		}
		
		
		//한글자 입력받아 출력 단 y면 종료
		Scanner scan = new Scanner(System.in);
		
		for(;;//이렇게 적으면 그냥 무한루프임 while(true)랑 같음
				) {
			System.out.println("write one letter");
			char ch = scan.next().charAt(0);
			System.out.println(ch);
			if(ch == 'y') {
				System.out.println("end");
				break;
			}
		}
				
		
		int i = 0, j=0, k = 0;
		a: for(;;) {
			i++;
			for(;;) {
				k++;
				for(;;) {
					k++;
					System.out.println("i: " + i+", j: " + j + ",k: " + k);
					if(k==10) {
						break a;
					}
				}
			}
		}
		
		/*
		 * 각 지점에 원하는 이름 부여가 가능하다. 
		 * 예를 들어 for에 대해 a: for라고 하면 이 for의 이름은 a가 된다. 
		 * 이를 break a; 라고 하면 a 지점에 대해 break를 발생시킬수있다.
		 * 
		 */
		
		
		
		
		
	}

}

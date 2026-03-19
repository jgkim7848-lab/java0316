package day04;

import java.util.Scanner;

public class Exam202 {

	public static void main(String[] args) {
		/* 생년 숫자로 입력받을거임.
		 * 13세까지가 어린이.
		 * 청소년은 19세까지.
		 * 나머진 어른.
		 * 오늘 날짜에서 생년 빼서 나이에 맞게 어린이 청소년 어른으로 입장료를 받을거임.
		 * 어린이 5000 청소년7000 어른10000
		 * 2017입력시 - 10살 어린이 입니다. 입장료는 5000원 입니다.
		 * 반복문을 받는 이유 - 유효한 생년월일...생년의 기준은 1900년 부터 시작해서 2026년까지
		 * 이 기준을 넘어가면 다시 입력 받으라고 요청.
		 * */
		
		Scanner scan = new Scanner(System.in);


		
		while(true) {
			int thisyear = 2026;
			int inputage;
			System.out.println("생년을 입력해주세요. \n종료를 원할경우 0000을 입력해주세요. \n>> ");
			inputage = scan.nextInt();
			
			if (inputage == 0000){
				System.out.println("종료가 입력되었습니다. 장비를 정지합니다.");
				break;
			}
			if((inputage < 1900 || inputage > 2026) && inputage!= 0000) {
				System.out.println("적합하지 않은 생년입니다. 1900에서 2026 사이 숫자를 입력해주세요.");
				
			} else {
				if(inputage>=1900 || inputage <= 2026) {
					if((thisyear - inputage) <= 13 && (thisyear - inputage)>=0) {
					System.out.println("어린이입니다. 5000원을 지불해주세요.");
					} else if((thisyear - inputage) <= 19 && (thisyear - inputage > 14)) {
						System.out.println("청소년입니다. 7000원을 지불해주세요.");
					
					} else {
						System.out.println("어른입니다. 10000원을 지불해주세요.");
					
					}
				}
				
			}


		}
		
		
	}

}

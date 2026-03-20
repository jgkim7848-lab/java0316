package day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _01_Array1 {

	public static void main(String[] args) {
		// 배열

//		int a;
//		a= a + 1; //기본형 변수는 초기화를 안해준다. 반드시 직접 초기화를 해야 사용 가능.
//		
//		
//		//참조형 변수는 지가 알아서 셋팅을 함.
//		
		
		
		/*배열이란 같은 타입 같은 의미를 가지는 변수들의 집합을 의미 (참조변수)
		 * 기본타입 8개 빼고는 전부 참조변수이다.
		 * new 키워드로 생성
		 * 타입[] 배열명;으로 배열 선언을 하던지
		 * 타입 배열명[]으로 배열선언을 하던지.
		 * 타입[] 배열명 = new 타입[길이]
		 * 배열명 = new 타입[길이]
		 * 숫자타입0 문자타입null
		 * 
		 * int[] arr = new int[4]; //기본 방법으로 가장 많이 쓰임
		 * int[] arr = new int[]{1,2,3,4,5};
		 *     > 1 2 3 4 5를 새로만든 배열에 넣어달라는 소리
		 * int[] arr = {1, 2, 3, 4, 5}
		 *     > 위에거랑 같이 1 2 3 4 5를 배열에 쑤셔넣는 사운드
		 *     >일단 이 값으로 테스트 마려울때 사용하는 방법
		 *     
		 * 배열의 길이는 0 이상이어야함.
		 * index는 0부터 시작하고 마지막 번지는 개수-1이 된다.
		 * 
		 * */
		
		Random random = new Random();
		/*
		 * int [] arr; arr = new int[5];
		 * 
		 * int arr1[] = new int[5];
		 * 
		 * System.out.println();
		 * 
		 * arr[0] = 79; arr[1] = 126;//빨간 밑줄 없다고 오류 안나는건 아니다. //arr[5] = 60; arr은 0부터
		 * 4까지만 있잖냐.... arr[2] = 733; arr[3] = 53; arr[4] = 72345; for(int i = 0;
		 * i<arr.length; i++) { System.out.println(arr[i]); }
		 * 
		 * System.out.println("-----------------------"); //10개 따리 int 배열 생성후.... 그 안에
		 * 1부터 10까지 반복으로 //저장을 할거임. 그리고 출력해라.
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int [] arr2 = new int[10];
		 * 
		 * 
		 * for(int i = 0; i<=9; i++) { arr2[i] = scan.nextInt(); }
		 * 
		 * for(int i = 0; i<arr2.length; i++) { System.out.println(arr2[i]); }
		 * 
		 * System.out.println(arr2[4]);
		 */
		
		System.out.println("arr5-------------------");
		//랜덤값5개 넣어보기
		int[] arr5 = new int[5];
		for(int a = 0; a < arr5.length; a++) {
			arr5[a] = (random.nextInt(9)+1);
		}
		for(int a = 0; a < arr5.length; a++) {
			System.out.println(arr5[a]);
		}
		

		System.out.println("arr6-------------------");
		//for문중에 전체탐색을 하고싶은....
		//향상된 for문이라고 부름. 전체를 순차적인 탐색만 가능한 for문
		//자료구조중에 index 번지가 업슨ㄴ 애들....접근이 불가능한 경우
		// 배열 내부 값을 변경하는건 불가능함.
		for(int temp/*임시로 저장하는 변수*/ : arr5) {
			System.out.println(temp);
		} //갖고오는건 되지만 배열에 값을 넣는건 불가능함.
		//오로지 볼때만.
		
		
		System.out.println(arr5.toString());
		
		//Arrays클래스에서 제공하는 toString
		System.out.println(Arrays.toString(arr5));
		
		
		
		
		
		
		
		
		
	}

}

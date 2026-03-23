package day06;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Array04 {

	public static void main(String[] args) {
		// 배열을 만들어볼건데
		//숫자 5개의 값을 가지는 배열을 생성후....1 2 3 4 5 입력후 출력하는걸로.
		
		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextLine();
		}
		for(String s:arr) {
			System.out.print(s);
		}
		System.out.println(Arrays.toString(arr));
		
		arr[0] = "10";
		
		
		
		
		
	}

}

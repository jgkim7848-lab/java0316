package day08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_MethodEx02 {
	
	
	public void cul(int[] arr) {
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public void orm(int[] arr) {
		int t = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		
	}
	
	
	public void every(int[] arr) {
		
		int all = 0;
		double avg = 0;
		int min = arr[0];
		int max = arr[0];
		
		for(int u = 0; u < arr.length; u++) {
			all = all + arr[u];
			if(min > arr[u]) {
				min = arr[u];
			}
			if(max < arr[u]) {
				max = arr[u];
			}
		}
		avg = all / (double)arr.length;
		System.out.println("\n총합: " + all + "\n평균: " + avg + 
				"\n최소: " + min + "\n최대: " + max
				
				
				);
		
		
	}
	 
	

	public static void main(String[] args) {

		_04_MethodEx02 me = new _04_MethodEx02();
		int[] arr = {78, 85, 34, 85, 90, 95, 84, 72, 35, 61, 55};
		//이걸 서서 매서드 만들거임
		/*1. 배열을 매개변수로 받아서 출력하는 매서드
		 * 2. 배열을 매개변수로 받아서 오름차순으로 정렬하는 메서드 크냐작냐 비교
		 * 3. 배열을 매개변수로 받아 합계 평균 최대 최소값을 출력하는 매서드
		 * 
		 * */
		
		me.cul(arr);
		me.orm(arr);
		me.every(arr);
		
	}

}

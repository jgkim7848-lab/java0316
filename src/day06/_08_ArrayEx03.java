package day06;

import java.util.Arrays;
import java.util.Random;

public class _08_ArrayEx03 {

	public static void main(String[] args) {
		//

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("================");
		System.out.println(Arrays.toString(arr));
		
		Random rand = new Random();
		
		
		int index = (int)Math.random()*arr.length;
		
		
		System.out.println(index);
		
		
		System.out.println(Arrays.toString(arr));
		
		//for문으로 묶고 기존 값을 어디 잠깐 저장해두고 다른데서 값을 끌어온뒤에
		//끌어와서 빈 자리에 저장해둔 기존 값을 다시 넣어주기를 반복하면 섞임.
		//
		
		System.out.println("===============================");
		
		int[] arr2 = new int[5];
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = i+1;
		}

		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr2.length; i++) {
			int index2 = (int)(Math.random()*arr2.length);
			int t1 = arr2[i];
			arr2[i] = arr2[index2];
			arr2[index2] = t1;
		}
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		//arr2를 원래대로 정렬해보자.
		//작은수부터 정렬 - 오름차순
		//큰수부터 정렬 > 내림차순
		/*3 5 4 1 2
		 * 1 5 4 3 2
		 * 1 2 5 4 3
		 * 1 2 3 5 4
		 * 1 2 3 4 5*/
		
		for(int i = 0; i<arr2.length-1; i++) {
			for(int j = i+1; j<arr2.length; j++) {
				if(arr2[i] > arr2[j]) { //오름차순 전문.
					int t = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = t;
				}
			}
		}
		System.out.println("정렬된 arr2: " + Arrays.toString(arr2));
		
		Arrays.sort(arr2);//이건 또 뭐람!!??
		
		
	}

}

package day06;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class _09_ArrayEx04 {

	public static void main(String[] args) {
		// 정수배열10개 1~100사이의 랜덤수.
		//오름차순 정렬후 전후 출력할것.
		
		Random rand = new Random();
		
		int [] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(99)+1;
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		
		
		/*
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순 전문.
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;//
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		*/
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순정렬방법
		//기본 자료형은 안되고. Collections.reversOrder()
		//wrapper class
		//기본 타입의 자료형값을 박싱(포장)해서 객체로 만드는것을 의미함.
		


	}

}

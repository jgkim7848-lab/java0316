package day06;

import java.util.Scanner;

public class _07_ArrayEx02 {
	public static void main(String[] args) {
		String[] fileName = {
				"이것이 자바다.java",
				"java의정석.java",
				"array.txt","array.java",
				"String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpg"
				,"javaMethod.png"
		};


		Scanner scan = new Scanner(System.in);
		
		//그림파일인 jpg, png파일만 출력하고싶다.
		
		
		/*
		 * for(int i = 0; i < fileName.length; i++) { if(fileName[i].contains(".java")
		 * || fileName.lastIndexOf(".") == fileName.length-4) {
		 * System.out.println(fileName[i]); } if(fileName[i].contains(".png") ||
		 * fileName.lastIndexOf(".") == fileName.length-) {
		 * System.out.println(fileName[i]); } }
		 */
		
	}

}

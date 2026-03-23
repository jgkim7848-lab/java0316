package day06;

import java.util.Scanner;

public class _06_ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고있는 배열이 있다.
//그 배열에서 검색어를 입력하면 해당 검색어를 포함하고있는 파일을 출력
	//검색어를 포함하는 파일이존재하지않는다면 일치하는 항목이 없습니다.
	
		String[] fileName = {
				"이것이 자바다.java",
				"java의정석.java",
				"array.txt","array.java",
				"String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpg"
				,"javaMethod.png"
		};
		
		//대소문자 구분 없이 출력하고싶도르.
		//1 검색어 입력받기를 먼저 해야겠지.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("찾고싶은 파일의 일부 혹은 전체 단어를 입력해주세요.\n>> ");
		String gumsek = scan.next().toLowerCase(); //ARRAY로 입력해도 뭔가 나오게 해줌.
//이거 아래쪽에(fileName[i].toLowerCase().contains(gumsek))
//이거만 적어놨을땐 array 입력시 출력으로 Array는 나왔지만 ARRAY입력하면 아무것도 안나왔었음.
		
		
		int count = 0;
		//포함 여부를 보는 contains
		for(int i = 0; i < fileName.length; i++) {
			
			if(fileName[i].toLowerCase().contains(gumsek)) {
				System.out.println(fileName[i]);
			} else {
				count++;
				continue;
			}
			
		}
		if(count == fileName.length) {
			System.out.println("일치하는 항목이 없습니다.");
		}
		
	}

}

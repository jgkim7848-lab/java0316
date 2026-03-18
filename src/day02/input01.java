package day02;

import java.util.Scanner;

public class input01 {

	public static void main(String[] args) {
		// 입력좀 받아보자
		/*console input: 콘솔에서 입력을 받는 특수기 아 ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		 * 
		 * Scanner 클래스: 입력받은 값의 형식 변환을 편리하게 해주는 클래스
		 * 객체 생성후 new라는 키워드로 생성을 해줘야함.
		 * 
		 * 기본 자료형 타입 변수명 값 쓰면 끝이던게
		 * 클래스 자료형은 >> 클래스명 객체이름 = new 클래스명(값) 으로 작성됨.*/
		
		Scanner scan = new Scanner(System.in);
		
		/*
		//scanner 사용시?
		//객체명.next()   한 문자만 입력 가능. 리턴값은 string.  한 단어란 띄어쓰기하면 끝나는거 공백 미포함
		//객체명.nextline() 공백 포함 여러단어 입력받음.
		//객체명.nextInt() 정수로 입력받겠다
		//객체명.next자료형()  해당 자료형으로 입력받는도르.
		//
		
		System.out.println("숫자 입력 > ");
		int num = scan.nextInt();
		System.out.println("내가 입력한 값 : " + num);
		
		if(num%2==0) {
			System.out.println("짝수입력했네");
		} else {
			System.out.println("홀수 입력했네");
		}
		
		System.out.println("소수점을 포함한 수 입력 > ");
		double dou = scan.nextDouble();
		System.out.println("내가 입력한 실수 = " + dou);
		
		*/
		
		System.out.println("문자입력 > ");
		String str = scan.next();
		System.out.println(str);
		
		scan.nextLine(); 
		
		System.out.println("문자열입력 > ");
		String stri = scan.nextLine();
		System.out.println(stri);
		//대체 왜 위에 scan.next랑 동시에 쓰니까 아래거가 입력이 안되는거냐 이 시발
		//별도로 할땐 잘됬는데 왜 같이 하니까 터지냐구우우웃
		//nextLine이 공백을 처리해서 그렇다??
		//공백을 포함하는데 이 공백엔 엔터도 공백으로 들어온다.엔터라고 치는것 자체가 포함된다.
		//위에건 엔터로 인하여 입력끝나고 엔터 눌러서 끝난거지만 
		//그 엔터를 밑의 nextLine이 공백이 내려온거로 취급하게된다.
		//그러므로 사이에 scan.nextLine() 한개를 둠으로서 위에서 내려오는 엔터를 얘가 받아서 버리라고 배치하게됨.
		
		
		
		
		scan.close(); //닫아줘야 잘됨????
	}

}

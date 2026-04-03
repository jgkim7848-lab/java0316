package day14;

import java.util.Arrays;
import java.util.Scanner;//시발 이거 뭔가 이상하게 작동한다 ㅈ됬다. 아닌가???

public class Exception06 {

	public static void main(String[] args) {
		// 메서드를 호출하여 배열을 출력
		
		Exception06 e6 = new Exception06();
		int size = -1;
		int count = 10;
		int start = 1;
		// try~catch를 실행하여 예외 출력 확인
		try {
			
			int arr[] = e6.createArray(size, count, start);
			System.out.println(Arrays.toString(arr));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("예외 처리 후 작성되는 문구");
		System.out.println("요 아이는 반드시 출력되어야 합니다.");
		
		// 예외 처리의 목적은 구문에서 예외가 발생하더라도 프로그램을 정상 작동
		// 시키기위한 목적

	}
	
	/* 배열의 길이(size)를 입력받아 해당 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴하는 메서드
	 * 랜덤값의 범위도 1~100 값을 입력받아 해당 범위의 랜덤값 발생
	 * (Math.ramdom() * count) + start
	 * 
	 * - size가 0보다 작다면 예외발생
	 * - count 값이 0보다 작으면 예외발생
	 * 
	 * 매개변수 : size, count, start
	 * 리턴타입 : 배열
	 * 
	 * */
	public int[] createArray(int size, int count, int start) throws RuntimeException {
		if(size < 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(count < 0) {
			throw new RuntimeException("random의 범위가 0보다 작습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*count) + start;
		}
		
		return arr;
	}
	
	
}



//public class exception06 {
//
//	public static void main(String[] args) {
//		// 메서드를 호출하여 배열을 출력해볼것.
//		//try catch 꼭 할것....
//		//예외 출력 확인 해라.
//		//근데 이걸 하는 목적?? 구문에서 예외가 발생하더라도 프로그램을 정상작동시키는게 목적임.
//		
//		exception06 e6 = new exception06();
//		Scanner scan = new Scanner(System.in);
//		
//		int size = 5;
//		int count = -1;
//		int start =0;
//		
//		try {
//			int arr[] = e6.excep(size, count, start);
//			System.out.println(Arrays.toString(arr));
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//	/*throw new 하는거 해볼거임.
//	 * 배열의 길이를 입력받아 해당 길이를 가지는 배열을 생성할거임.
//	 * 그리고 랜덤값을 채워서.
//	 * 배열을 리턴하는 메서드를 만들거임.
//	 * 랜덤값의 범위? 1 ~100을 주면 그 범위의 랜덤을 만들거임.
//	 * math.random()*count + start
//	 * 
//	 * 단 예외발생 규칙.
//	 * 길이를 size라고 해보겠다.
//	 * 배열이 size가 0보다 작으면 안되잖냐
//	 * random값도 count의 값이 0보다 작으면 예외 발생임.
//	 * 매개변수 size count start
//	 * 리턴타입 배열.
//	 * */
//	
//	public int[] excep(int size, int count, int start) throws RuntimeException{
//		
//			int[] arr = new int[size];
//			if(size<0) {
//				throw new RuntimeException("배열의 길이가 0보다 작습니다");
//				//이건 메세지값 이렇게 써준 글자가 exception 메세지 뒤에 나오게된다.
//			}
//			if(count < 0) {
//				throw new RuntimeException("랜덤의 범위가 0보다 작습니다.");
//			}
//			for(int i = 0; i < arr.length; i++) {
//				if(count <= 100 && count >=1) {
//					arr[i] = (int)(Math.random()*count + 1);
//				}
//			}
//			return arr;
//	}
//}
//

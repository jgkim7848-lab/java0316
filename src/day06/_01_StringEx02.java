package day06;

public class _01_StringEx02 {

	public static void main(String[] args) {
		// fileName.suffix
		//파일명과 확장자를 분리하여 출력. 확장자가 java 면 자바 파일입니다. 아니면 기타파일입ㄴ디ㅏ.
		String file = "자바의 정석.java";
		int wichi = file.indexOf(".");
		int len = file.length();
		System.out.println("파일명: " + file.substring(0, wichi));
		System.out.println("확장자: " + file.subSequence(wichi+1, len));
		
		if(file.subSequence(wichi+1, len) == "java") {
//equals()로 비교해야할지도 어 시발 근데 난 왜 저렇게 나오지 시ㅣㅣㅣ발.
		
			System.out.println("자바 파일입니다.");
		} else {
			System.out.println("기타 파일입니다.");
		}
		
		
		System.out.println("-------------------------");
		
		
		//split으로 배열로 리턴??  특정 값을 기준으로 배열로 리턴.
		String[] fileArr = file.split("\\.");
		for(String f : fileArr) {
			System.out.println(f);
		}
		//regex????? 정규 표현식???? 시발 나니코레
		//regexp는 또 뭐야 시발 진짜 개좆됬잖아 씨발련들아
		
		if(fileArr[1].equals("java")) {
			System.out.println("자바파일입니다.");
		}else{
			System.out.println("기타파일입니다.");
		}
	}

}

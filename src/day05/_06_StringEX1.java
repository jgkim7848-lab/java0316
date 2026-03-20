package day05;

public class _06_StringEX1 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일 나이 성별을 출력함.
		String regNum = "990101-1234567";
		//1900년대 - 뒷자리 맨 앞 1이 남자, 2가 여자
		
		//String regNum = "000101-4234567";
		//2000년대 - 뒷자리 맨 앞에 3이 남자, 4가 여자.
		
		int today = 2026;
		
		//출력결과
		//생년월일:
		//나이:
		//성별:
		//
		String gen;
		
		
		String birth1 = regNum.substring(0, 2);//맨앞2자리출력
		//System.out.println(birth1);
		int birth2 = Integer.parseInt(birth1);//출력한걸숫자로
		
		
		
		
		if(regNum.charAt(7)=='1' || regNum.charAt(7)=='3') {
			gen = "남자";
		} else {
			gen = "여자";
		}
		
		if(regNum.charAt(7)=='1' || regNum.charAt(7)=='2') {
			
		} else {
			birth2 = birth2 + 100;
		}
		
		
		
		
		int age = today - (birth2 + 1900);
		
		System.out.println(
				"생년월일: " + regNum.subSequence(0,6) + "\n"+
				"성별: " + gen + "\n" +
				"나이: " + age
				
				);
		
	}

}

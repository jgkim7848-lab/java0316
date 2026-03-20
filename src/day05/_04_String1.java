package day05;

public class _04_String1 {

	public static void main(String[] args) {
		// String class 문자열을 다루기 위한 클래스 >> 참조자료형
		//class 여러가지 기능을 가지고있는 정의서
		// 클래스 타입 객체명 = new 클래스 타입(생성자)
		String str = "abc c def c";
		System.out.println(str);
		
		System.out.println("str의 length길이: "+str.length());
		
		//array는 왜 ()없는 length 이고 String의 length는 ()가 있는가
		
		
		//charAt(index)  인덱스 번지에 있는 문자 반환 char형태로
		System.out.println("charAt");
		System.out.println(str.charAt(4));
		
		//substring  필요한 문자열 추출
		System.out.println("-----substring-----");
		System.out.println(str.subSequence(4, 9));
		//앞에건 4 부터를 의미하지만 9는 9를 포함하지않는 직전까지를 의미한다.
		// 즉 이건 4부터 8까지의 의미를 갖고있다.
		//그냥 (4)만 적혀있으면 4부터 끝까지다.
		
		
		//equals()  두 문자가 같은지 비교(대소문자도 봄)
		//참조 자료형에서 ==로 비교하는건 주소가 같은지 여부를 보는것이다.
		//equals는 단어 그 자체를 보는것.
		//같으면 true 다르면 false로 리턴해준다.
		System.out.println("-----equals-----");
		System.out.println(str.equals("abc c def c"));
		 
		
		//indexOf()
		//내가 원하는 문자가 몇번지에 있는지 찾아주는 명령어.
		//한 문자열에 같은 단어가 여러개면 처음 일치하는거만 리턴해줌.
		//문자열 찾는게 없으면 -1리턴
		//시작 위치 지정 가능
		System.out.println("---------indexof()---------");
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("c", 3));
		System.out.println();
		
		
		
		//lastIndexOf(뒤에서부터 찾아줌
		System.out.println("-----lastIndexOf()-----");
		System.out.println(str.lastIndexOf("c"));
		
		String email = "asdf1234@naver.com";
		int i = email.indexOf("@");
		String id = email.substring(0, i);
		System.out.println(id);
		
		
		//str.compareTo(str2) 이거 2개 비교해서 
		//사전순으로 앞에 있으면 -
		// 같으면 0
		//뒤에 있으면 +값으로 리턴한다.
		//문자 정렬시 사용함.
		System.out.println("===compareTo----");
		System.out.println("a".compareTo("b")); 
		//a가 b 보다 앞에있냐 뒤에있냐. 앞에 있으니 -1이 나옴.
		//b말고 e 적으면 -4가 나옴.
		//b를 앞으로 두고 a 이면 +가 나오게됨.
		
		
		//contains는 해당 문자의 포함 여부를 체크해서 true false로 반환함.
		System.out.println("\n\n\n--==contains-==-");
		
		System.out.println(str.contains("abcd"));
		
		  
		
		
		
		
		
	}

}

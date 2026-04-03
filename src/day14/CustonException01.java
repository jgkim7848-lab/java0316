package day14;//passwordexception이랑 쌍으로 익셉션06 다음에 만듬.

public class CustonException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
		}catch(Exception e) {
			
		}

	}

}
class PasswordTest{
	private String password;
	
	public void setPassword(String password) {
		this.password = password;
		//null 안됨, 길이 5글자이상, 비번은 영문자나 숫자 특수문자 포함할것.
		
//자바 정규식에 대해....ㅓ시벌알만럼ㄴㄷ;ㅑㅓㅁㄴ오ㅠㅓㅊㅊㅍ
//jonna 뭐 많고 어렵네 ssibal....
		if(password == null) {
			throw new PasswordException(password + "는 비밀번호가 될수 없습니다.");
		}
		if(password.length() < 5) {
			throw new PasswordException(password + "는 5글자 미만입니다.");
		}
		
		
	}
	
	

	public String getPassword() {
		return password;
	}

	
	
}
package day14;

public class PasswordException extends IllegalArgumentException {

	/*사용자 정의 exception을 생성할때의 조건.
	 * password가 들어왔을때 내가 원하는 조건에 만족하지않으면 발생시키고싶다.
	 * 몇글자 이하는 안되고 이런 조건들 말이지.
	 * 만야에 입력값이 조건에 안맞으면 이걸 발생시키고시프다.
	 * 들어오는 입력값에 대한.......
	 * IllegalArgument exception이라고 부름.
	 * 매개변수가 잘못 사용되었을때 발생하는 익셉션.
	 * 이걸 이용해서 내가 발생시키는거의 조건에 안맞으면 exception을 발생시키고시프도르.
	 * 사용자 지정 익셉션 정이시 발생시키고자 하는 익셉션을 상속받아 사용함.
	 * 
	 * */
	
	private static final long serialVersionUID = 1L;
	
	public PasswordException(String message) {
		super(message);
	}
	
	
	
	
	

}

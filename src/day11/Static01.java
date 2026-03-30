package day11;//메서드09다음.

public class Static01 {

	public static void main(String[] args) {
		// static이란: 전역. 모든 영역.  전역변수, 전역 메서드
		/*자바에서는 클래스변수, 클래스 메서드라고 부름.
		 * 전 모든 객체에 공통으로 사용 가능. 
		 * 프로그램이 실행되면서 바로 메모리에 올라가서~~~~
		 * 프로그램이 종료될때 같이 소멸함.
		 * 객체 생성 없이 해당 클래스가 만들어지면서 생성이 된다.
		 * 일반 객체는 new 단어가 붙어있어야 사용 되는거니까 ex) A a = new A();
		 * 그냥 내가 쓰기만 하면 바로 생성됨. new 필요 X
		 * 객체 생성 없이 클래스 만으로 호출이 가능함.
		 * 클래스명.변수명 / 클래스명.메서드명 으로 사용 가능.
		 * 객체 생성후 사용해도 무관하나 굳이...? 노란 밑줄이 생길정도로.
		 * 클래스의 멤버변수, 메서드는 하나의 멤버변수가 모든 객체에 공유되어야할때 사용됨.
		 * 스태틱은 스태틱끼리 사용 가능...?
		 * static이 안붙은 메서드 혹은 멤버변수는 객체(인스턴스)의 메서드 / 객체의 멤버변수 라고 불린다.
		 *  - 각 객체를 통해서 생성되고 사용된다.
		 *  - new를 통해서 객체를 생성하지않으면 생성되지않고 사용될수없다.
		 *  - 객체명.변수명 / 객체명.클래스명으로 사용 가능함.
		 *  - 각 객체마다 독립적으로 존재한다.
		 * 
		 * 클래스의 멤버와 객체의 멤버는 생성되는 시점이 다르다.
		 *  따라서 메서드와 멤버변수의 사용 시점이 다르다.
		 *  
		 * 객체 멤버는 클래스가 생성되고 그 후에 사용이 가능하다.
		 * 객체의 멤버는 클래스가 생성되고 객체 생성 후 사용 가능.
		 * 
		 * 클래스 멤버는 클래스 멤버변수 / 클래스 멤버 메서드 둘다 사용 가능.
		 * 객체 멤버는 클래스 멤버에서 사용이 불가능.
		 * static이 붙은 메서드에서 일반 메서드는 호출 불가능.
		 * 
		 * 
		 * */
		
		//static의 메서드 호출 가능
		//ProductMain.main(args); // 클래스명.메서드명();
		
		TV t = new TV();
		t.printBrand();
		t.printBrand2(); //가능은 한데 잘 안씀.
		
		TV.printBrand2(); //클래스에서 바로 호출.
		
		
	}

}


class TV{
	private boolean power;
	static final String BRAND = "LG";
	
	public void printBrand() {
		//객체의 메서드안
		//내가 지금 출력 마려운건 static( 클래스 변수 호출 ).
		System.out.println(BRAND);//static
		System.out.println(power);//일반 멤버변수
	}
	
	public static void printBrand2() {
		//static(클래스 메서드 안쪽) 에서 일반 객체 변수 호출해보고싶다.
		System.out.println(BRAND); //static
		//System.out.println(power); //이 일반 멤버변수를 호출하는건 오류남
	}
}
















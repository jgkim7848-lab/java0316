package day09;

public class _03_class03 {

	public static void main(String[] args) {
		// 
		Car c = new Car();
		c.setName("카니발");
		c.setYear(2026);
		Car c2 = new Car("sonata", 2026);
		
		c.print();
		
		
		System.out.println("=============================");

		c.speedup();
		
		c.power();
		c.speedup();
		System.out.println("=============================");
		
		
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.print();
		System.out.println("=============================");
		c.power();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.down();
		
		//fvr, favorlist, fvradd
		
		
	}

}

class Car {//속도에 관한게 있을거고,시동,차 이름, 연식
	//멤버변수
	private String name;
	private int year; 
	//숫자가 숫자로서의 기능을 하는게 아니면 string으로 써도 무관함.
	//연식을 어따써. (문자의 의미로 써도 크게 상관 없는거라서 가능한거임
	private int speed;
	private boolean power;
	//시동 여부. 0 아니면 1로 시동켜짐꺼짐 여부만 보면 되니까.
	
	
	//생성자 - 멤버변수 아래.
	//객체 생성시 = new 키워드가 나올때....초기값을 지정해주는 역할임. 
	//딱 한번만 사용되고 그 이후론 안됨
	//기본 생성자 - 컴파일러가 컴파일시 자동으로 제공함.
	//기본생성자를 직접 만들수도 있음.
	//기본생성자란 다른 생성자가 존재하면 자동으로 주지않음.
	//생성자는 여러개 생성 가능....생성자 오버로딩.
	//생성자 오버로딩 조건- 매개변수의 개수가 다르거나, 타입이 달라야 가능함.
	//생성자를 만들때 꼭 기본 생성자와 같이 생성함.
	//사실상 1개만 만드는 케이스도 없고 항상 오버로딩 한다고 생각할것
	//public 클래스명(매개변수){멤버변수 값을 설정}  return의 여부로 메서드냐 생성자냐.
	//생성자는 아예 리턴 자리가 없음. 메서드는 return이든 void든 있어야하지만.
	//생성자는 리턴타입이 없는 메서드와 같은 형태.
	//이름은 반드시 클래스명을 따를것.
	//object=null, 숫자=0, boolean = false
	
	//기본생성자
	public Car(){
		
	}
	//매개변수가 있는 생성자를 만들고싶다
	public Car(String name, int year) {
		//기본셋팅이되면좋겠어!
		this.name = name;
		this.year = year;
	}
	
	public Car(String name, int year, int speed, boolean power) {
		
	}
	
	//메서드
	//1 시동을 끄고 키는 메서드
	//꺼져있으면 켜짐으로 바꾸고 켜짐이면 꺼짐으로 바꾸고.
	public void power() { //굳이 리턴 할 필요가 없음. 알아서 공유됨.
		
		//power 호출시 현재 power 상태를 반대로 바꾸는 기술.
		//if문을 써서 this.power == true를 적는다면???
		//어짜피 boolean 값이라 그 자체로 true false라서
		//if(this.power) 만 해도 참일경우를 의미함.
		//바로 아래쪽 if문 참고.
		if(this.speed == 0) {
			this.power = !this.power;
		} else {
			System.out.println("error");
		}
		
	}
	//2 출력 메서드
	//on/off 둘중 하나에 현재 속도.
	public void print() {
		/*
		 * if(this.power) { System.out.println("on / " + speed); } else {
		 * System.out.println("off"); }
		 */
		System.out.println((this.power ? "on" : "off") +" / " + this.speed);
	}
	//3 스피드 업
	public void speedup() {
		if(!this.power) {
			System.out.println("시동을 켜주세요.");
			return;
		} else {
			this.speed = this.speed+20;
			print();
			if(this.speed > 200) {
			System.out.println("더이상 속도가 빨라질수 없습니다");
			this.speed=180;
		}
			
			
		}
		
		
	}
	
	//4 스피드 다운 20씩 올리고 높이고,
	public void down() {
		if(!this.power) {
			System.out.println("시동을 켜주세요.");
			return;
		} else {
			this.speed = this.speed-20;
			print();
		}
		if(this.speed < 0) {
			System.out.println("더이상 속도를 줄일수 없습니다");
			this.speed=0;
		}
		
	}
	
	
	//getter setter >> 남이 나를 쓸때 제공해주기위해. 
	//위의 멤버변수 4가지의 게터 세터를 만들어줄거임.
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSpeep() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isPower() { //왜 파워는 이거만 적는진 모르겠네 뭐지.
		return this.power;
	}
	
	
}
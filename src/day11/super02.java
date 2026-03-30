package day11;

public class super02 {

	public static void main(String[] args) {
		// 
		Dog d = new Dog("뽀삐","개과"); //매개변수 생성자를 만들었다면 기본 생성자도 만들어야하며....
		d.printInfo();
		d.howl();
		cat c = new cat("치즈","고양이과"); 
		c.printInfo();
		c.howl();
		
		tiger t = new tiger("호돌이","고양이과"); 
		t.printInfo();
		t.howl();
		
	}

}


//애니멀을 상속받을 자식 클래스
class Dog extends Animal{
	//개과, 멍멍
	//setname으로 줘야겠는데...객체 만들때나 주는거라서 이럴때 줄수있는게 아닌데??
	public Dog(String name, String category) {
		//부모 생성자를 호출
//		super.setName(name);
//		super.setCategory(category);
		//생성자 호출this();는 또 언제 하 아
		//super() 가장 위에서만 호출 가능함.
		super(name, category); //이걸 하면 아래쪽에 public Animal(String name, String category)  이걸 불러옴.
		
		
		
	}

	@Override
	public void howl() {
		//부모의 메서드 내용
		super.howl();
		System.out.println("멍멍");
	}
}


class cat extends Animal{
	public cat(String name, String category) {
		super(name, category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
	}
	
}



class tiger extends Animal{
	public tiger(String name, String category) {
		super(name, category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥");
	}
	
}




class Animal{//부모클래스
	private String name; //이름
	private String category; //종
	
	//생성자
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	//출력메서드
	public void printInfo() {
		System.out.println("이름: " + name + "[" + category + "]");
		
	}
	
	//울음소리 출력 멧드
	public void howl() {
		System.out.println("==" + name + "의 울음소리==");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
package day09;

public class _02_class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		//x, y값 저장후 출력.
		
		t.setX(10);
		t.setY(20);

		t.print();  // (10,20)

		//클래스 내부에 toString() 메서드가 없으면 추소가 출력됨.
		System.out.println(t);
		
		System.out.println("--------------------");
		
		System.out.println(t.toString());
		//메서드 호출시 객체명.메서드명()
		//근데 toStirng()은 그냥 해도 됨.
		//System.out.println(객체명); > 알아서 toString() 찾아서 출력
		
		
	}

}
//default 접근제어자는 나랑 패키지가 다 쓸수있단말이지
//패키지별로 같은 이름의 클래스명을 가질수없어야한도르

class Test2{//01에 Test가 이미 있으므로 여기서 그냥 Test 쓰면 오류남.
	private int x;
	private int y;
	//toString() > 일반적으로 하는 일은 멤버변수의 값을 전부 나열해서 string으로 리턴.
	//클래스명[멤버변수=값, 멤버변수=값]
	
	//이건 getter setter처럼 고유하게 갖는 무언가. print의 string 버전.
	//print 메서드를 String으로 리턴하는 형식의 메서드이다.
	//나는 toString으로 호출을 하면 string으로 리턴을 할건데
	//(x,y)  이걸 string으로 리턴하는 메서드.
	//private의 멤버변수를 다른 클래스에서 사용하기 위해서는 
	//getter seter 메서드가 필요함.
	
	
	//getter - 내 멤버변수에 접근하기위해 필요함
	//그래서 getter는 return이 필요함.

	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	
	//setter 외부에서 내 멤버변수의 값을 변경하기위해 필요함
	//대신 얘는 매개변수가 필요함. 그래야 값을 저장하니까.
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
    public void print() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }

    
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
	
	
	
}
package day11; //static 다음ㅇ에.

public class super01 {

	public static void main(String[] args) {
		// 부모 멤버를 자식에게 물려주는것을 상속이라고 함.
		/*멤버 변수 / 멤버 메서드만 상속 가능
		 * 상속의 이유 - 클래스의 확장 개념., 재사용, 중복제거,유지보수
		 * class A(자식) extends B(부모)
		 * 
		 * 상속 키워드 : extends
		 * 상속을 받으면 부모의 멤버변수와 부모의 메서드를 사용할수있다.
		 * 접근 제어자가 private이면 자식도 접근 불가능함.
		 * 이 경우 getter setter로만 접근할것
		 * 아니면 접근 제어자를 protected로 하면 상속 받는 자식에겐 허가하는게 됨.
		 * 상속은 단일 상속이 원칙.
		 * 
		 * 
		 * 
		 * */
		
		
		
	}

}



class A{
	//자식 클래스
	private int c,d,e;
	
	
	
	
	
	

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	
}

class B{
	private int a, b; //나만 사용 가능
	protected int num; // 자식도 사용 가능.
	
	public void print() {
		System.out.println("a: " + a + "\nb: " + b);
		System.out.println(num);
	}

	
	
	
	
	
	
	
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}













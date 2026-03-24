package day07;

public class _05_Method2 {
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public void sum2(int num1, int num2) {
		int hap2 = sum(num1, num2);//메서드 안에서 다른 메서드 호출
		int hap = num1 + num2;
		System.out.println(hap);
		
	}
	
	/*매개변수가 없는 케이스 / 리턴이 있는 케이스
	 * 합 출력??
	 * */
	public int sum3() {
		int num1 = 100;
		int num2 = 200;
		return num1 + num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		_05_Method2 me02 = new _05_Method2();
		int num1 = 45;
		int num2 = 34;
		int cha = me02.sum(num1, num2);
		System.out.println(cha);
		System.out.println("==================");
		me02.sum2(num1,num2);
		
	}

}

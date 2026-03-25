package day08;


public class _02_Method5 {

	//최대공약수
	public int max(int num1, int num2) {
		int t;
		int n;
		if(num1 < num2) {
			t = num1;
			num1 = num2;
			num2 = t;
			t = 0;
		}
		while(num2!=0) {
			n = num1 % num2;
			num1 = num2;
			num2 = n;
			
		}
		return num1;
	}
	
	//최소공배수
	public int min(int num1, int num2) {
		int a = max(num1, num2);
		num1 = num1 / a;
		num2 = num2 / a;
		if(num1 == 0 || num2 == 0) {
			return 0;
		}
		return a * num1 * num2;
		
	}
	
	public static void main(String[] args) {
		// 최대공약수와 최소공배수
		

		_02_Method5 me02 = new _02_Method5();
		
		
		int num1 = 16;
		int num2 = 0;
		
		System.out.println(me02.max(num1, num2) + " " + me02.min(num1, num2));
		
	}

}

package day08;


public class _01_Method04 {
	public void gugu(int num1) {
		for(int i = 2; i < num1+1; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// 

		_01_Method04 me04 = new _01_Method04();
		int num = 9;
		
		me04.gugu(num);
	}

}

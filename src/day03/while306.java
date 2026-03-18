/*
package day03;

public class while306 {

	public static void main(String[] args) {
		// while 1부터 50까지중에 짝수만 출력 단 2 4 6 8 10이 되면 다음줄로 넘어감.
		int count = 1;
		while(count <= 50) {
			if(count % 2 == 0) {
				if(count % 10 == 2) {
					System.out.println();
				}
				System.out.print(count + " ");
			}
			
			count++;
		}
	}

}*/
// 이건 끝자리가 2일때 println을 하다보니 시작부터 한줄 내리고 시작하게 됬음. 
//(2일때부터 엔터 들어옴



package day03;
/*
public class while306 {

	public static void main(String[] args) {
		// while 1부터 50까지중에 짝수만 출력 단 2 4 6 8 10이 되면 다음줄로 넘어감.
		int count = 1;
		while(count <= 50) {
			if(count % 2 == 0) {
				
				System.out.print(count + " ");
				if(count % 10 == 0) {
					System.out.println();
				}
			}
			
			count++;
		}
	}

}   이건 10의 배수일때 출력 후에 줄바꿈이 들어오는거라 
     2가 남을때마다 줄바꿈 치는거완 다르게 시작부터 줄바꿈이 들어오지않음

*/




public class while306 {

	public static void main(String[] args) {
		int garo = 0;
		int count = 1;
		while(count <= 50) {
			if(count % 2 == 0) {
				
				System.out.print(count + " ");
				/*
				 * if(count % 10 == 0) { System.out.println(); }
				 나눗셈으로 줄바꿈 말고 한줄에 5개 찍고 줄바꿈되게.
				 */
				garo++;
			}
			if(garo == 5) {
				System.out.println();
				garo = 0;
			}
			//garo를 0부터 시작해서 5번 입력됬을때 출력후 if조건문으로 붙잡아서 
			//줄바꿈 출력후 0으로 조정해서 카운트 재시작.
			
			count++;
		}
	}

}





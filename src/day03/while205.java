package day03;

public class while205 {

	public static void main(String[] args) {
		//while 문으로 1~10까지의 합계 출력
		System.out.println("while 문으로 1~10까지의 합계 출력");
		int sum = 0;
		int count = 1;
		while(count <= 10) {
			sum = sum + count;
			count++;
		}
		System.out.println("1부터 10까지의 합 = " + sum);
		
		//while문으로 1 부터 10 까지중에 짝수 합계 구하기.
		int sum2 = 0;
		int tc = 1;
		while(tc <= 10) {
			if(tc % 2 == 0) {
				sum2 = sum2 + tc;
			}
			tc++;
		}
		System.out.println("짝수합 = " + sum2);
	}

}

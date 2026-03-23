package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _10_Exam01 {

	public static void main(String[] args) {
		//야구게임
		/*컴퓨터가 랜덤으로 3자리 숫자 생성
		 * 각 자리수 0에서 9 랜덤생성, 단 중복 불가.
		 *  > 배열로 저장.
		 *  유저가 이 3자리를 맞추는 게임
		 *  자리와 숫자가 일치하면 strike
		 *  자리는 불일치 하지만 숫자가 다른 위치에 있다면 ball
		 *  자리도 숫자도 없으면 out.
		 *  
		 *  ex 컴퓨터가 1 2 3 했는데 내가 1 5 9 하면 ball
		 *  
		 *  근데 6 5 8 하면 out. 아무런 관련성도 없다는 선언
		 *  컴퓨터가 1 2 3인데 내가 1 3 2 하면 1스트라이크에 2볼.
		 *  유저가 다시 1 2 3하면 스트라이크 3개로 정답.
		 *  
		 *  1 중복불가.  컴퓨터도 나도. 중복 불가능하게....예??
		 *  
		 * */
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		int ball = 0;
		int strike = 0;
		
		System.out.println("컴퓨터가 숫자를 생성중입니다.");
		int c1 = rand.nextInt(9);
		int c2 = rand.nextInt(9);
		int c3 = rand.nextInt(9);
		
		while(c1==c2||c2==c3||c3==c1) {
			c1 = rand.nextInt(9);
			c2 = rand.nextInt(9);
			c3 = rand.nextInt(9);
			if(c1 != c2) {
				if(c2!=c3) {
					if(c3!=c1) {
						break;
					}
				}
			}
			System.out.println("컴퓨터가 겹치지않는 0에서 9 사이숫자 3개를 만드는 중입니다.");
		}
		System.out.println("컴퓨터가 숫자를 생성 완료했습니다.");
		
		int[] Carr = new int[3];
		Carr[0] = c1;
		Carr[1] = c2;
		Carr[2] = c3;
		
		int[] Uarr = new int[3];
		System.out.println("0에서 9 사이의 숫자 3번 입력.");
		for(int a = 0; a < Uarr.length; a++) {
			System.out.print(">> ");
			Uarr[a] = scan.nextInt();
			if(Uarr[a] < 0 || Uarr[a] >= 10) {
				System.out.println("0에서 9 사이 숫자를 입력해주세요");
				a--;
			}
			if(a == Uarr.length - 1) {
				if(Uarr[0]==Uarr[1] || Uarr[1]==Uarr[2] || Uarr[2]==Uarr[0]) {
					System.out.println("다시 3번 입력해주세요.");
					a= -1;
				}
			}
			
		}
		
		System.out.println("유저가 입력한 숫자는 > " + Arrays.toString(Uarr));
		if(Uarr[0] == Carr[0]) {
			strike++;
		}
		
		if(Uarr[0] == Carr[1]) {
			ball++;
		}
		if(Uarr[0] == Carr[2]) {
			ball++;
		}		
		if(Uarr[1] == Carr[0]) {
			ball++;
		}		
		if(Uarr[1] == Carr[1]) {
			strike++;
		}
		
		if(Uarr[1] == Carr[2]) {
			ball++;
		}
		
		if(Uarr[2] == Carr[0]) {
			ball++;
		}
		
		if(Uarr[2] == Carr[1]) {
			ball++;
		}
		
		if(Uarr[2] == Carr[2]) {
			strike++;
		}
		
		System.out.println("스트라이크 = " + strike);
		System.out.println("볼 = " + ball);
		if(strike == 0 && ball == 0) {
			System.out.println("out");
		}
		System.out.println("컴퓨터의 숫자는 " + Arrays.toString(Carr));
		
	}

}

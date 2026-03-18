/*
 * package day03;
 * 
 * import java.util.Random; import java.util.Scanner;
 * 
 * public class exam107 {
 * 
 * public static void main(String[] args) { // 업 다운 게임 //1 ~ 50까지의 랜덤 수 중 하나를
 * 컴퓨터가 생성함. (유저는 모를 예정. //그 숫자를 유저가 맞추는 게임. //컴퓨터가 랜덤수를 생성했습니다 //뭐 이렇게 말하고 유저가
 * 입력값을 내어줄건데 맞출때까지 계속 물어볼거임. //비교해서 낮으면 높여야한다고 말하고 높으면 낮아져야한다고 말하고 하다가 찾으면 되는
 * 부분. Random rand = new Random(); Scanner scan = new Scanner(System.in);
 * 
 * rand.nextInt(); int rnum = rand.nextInt(49)+1; // 0~1사이....10 곱해서 0 부터 10 사이
 * 
 * System.out.print("컴퓨터가 랜덤수를 생성했습니다. \n숫자를 입력해주세요>>> ");
 * 
 * int inputnum = scan.nextInt();
 * 
 * 
 * 
 * while(rnum != inputnum) { if(rnum > inputnum) {
 * System.out.println("more up"); } else if (rnum < inputnum) {
 * System.out.println("more down"); } inputnum = scan.nextInt(); }
 * 
 * if(rnum == inputnum) { System.out.println("숫자를 맞췄습니다. (종료)"); }
 * 
 * scan.close(); }
 * 
 * 
 * } 횟수제한 없이 숫자 맞추기.
 */

//5번의 횟수제한 존재함.
package day03;

import java.util.Random;
import java.util.Scanner;

public class exam107 {

	public static void main(String[] args) {
		// 업 다운 게임
		//1 ~ 50까지의 랜덤 수 중 하나를 컴퓨터가 생성함. (유저는 모를 예정.
		//그 숫자를 유저가 맞추는 게임.
		//컴퓨터가 랜덤수를 생성했습니다 
		//뭐 이렇게 말하고 유저가 입력값을 내어줄건데 맞출때까지 계속 물어볼거임.
		//비교해서 낮으면 높여야한다고 말하고 높으면 낮아져야한다고 말하고 하다가 찾으면 되는 부분.
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		rand.nextInt();
		int rnum = rand.nextInt(49)+1;
		// 0~1사이....10 곱해서 0 부터 10 사이

		System.out.print("컴퓨터가 1에서 50 사이의 랜덤수를 생성했습니다. \n숫자를 입력해주세요>>> ");

		int inputnum = scan.nextInt();
		int trycount = 0;

		
		while(rnum != inputnum) {
			if(rnum > inputnum) {
				System.out.println("more up");
			} else if (rnum < inputnum) {
				System.out.println("more down");
			}
			inputnum = scan.nextInt();
			trycount++;
			if(trycount == 4) {
				System.out.println("실패했습니다.");
				break;
			}
		}
		
		if(rnum == inputnum) {
			System.out.println("숫자를 맞췄습니다. (종료)");
		} else {
			System.out.println("숫자를 못맞췄습니다. (종료)");
			System.out.println("정답은 " + rnum + "이었습니다.");
		}
		
		scan.close();
	}

	
}

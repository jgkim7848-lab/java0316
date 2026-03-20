package day05;

import java.util.Random;
import java.util.Scanner;

public class _07_EXAM {
	public static void main(String[] args) {
		// 가위바위보할거임. 컴퓨터랑 나랑.
		//컴퓨터랑 유저가 가위바위보 게임을 진행할거임
		//가위는0 바위는1 보는2
		//컴퓨터는 랜덤으로 하나를 골라서 소환하게됨.
		//유저도 입력값으로.0 1 2중 골라서 가위바위보를 하게됨.
		//입력은 0 1 2로 해서 출력은 가위 바위 보 결과까지 알수있게.
		//다른 입력값 유저가 입력할 경우도 케어할것.
		
		Scanner scan = new Scanner(System.in);

		Random rand = new Random();
		
		
		
		int com;
		int user;
		
		
		while(true) {
			System.out.println("가위는0 바위는1 보는2.\n 가위바위보에 해당하는 숫자를 입력해주세요.\n>> ");
			com = rand.nextInt(3);
			user = scan.nextInt();
			if(user>=0 && user <=2) {
				if(com == 0) {
					if(user == 0) {
						System.out.println("컴퓨터- 가위\n 유저- 가위");
						System.out.println("비겼습니다.");
					}else if(user == 1) {
						System.out.println("컴퓨터- 가위\n 유저- 바위");
						System.out.println("이겼습니다.");
					
						
						
					}else/*user==2*/{
						System.out.println("컴퓨터- 가위\n 유저- 보");
						System.out.println("패배했습니다.");
					
						
						
					}
					
					
				} else if(com == 1) {
					if(user == 0) {
						System.out.println("컴퓨터- 바위\n 유저- 가위");
						System.out.println("패배했습니다.");
					
						
					}else if(user == 1) {
						System.out.println("컴퓨터- 바위\n 유저- 바위");
						System.out.println("비켰습니다.");
						
						
					}else/*user==2*/{
						System.out.println("컴퓨터- 바위\n 유저- 보");
						System.out.println("이겼습니다.");
						
						
					}
					
					
					
				}else/*(com==2)*/{
					if(user == 0) {
						System.out.println("컴퓨터- 보\n 유저- 가위");
						System.out.println("이겼습니다..");
						
					}else if(user == 1) {
						System.out.println("컴퓨터- 보\n 유저- 바위");
						System.out.println("패배했습니다.");
						
						
					}else/*user==2*/{
						System.out.println("컴퓨터- 보\n 유저- 보");
						System.out.println("비겼습니다.");
						
					}
					
				}
				
			}else if(user!=999) {
				System.out.println("0가위 1바위 2보 중 하나를 입력해주세요. \n종료는 999 입니다.");
				continue;
			} else {
				System.out.println("종료");
				break;
			}
			
		}
		
	}

}

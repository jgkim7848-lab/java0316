package day08;

import java.util.Random;

public class Exam02 {
	
	public void randgive(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45+1);//이거랑 밑에거 범위만 바꾸면 될듯
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j] && i != j) {
					arr[i] = (int)(Math.random() * 45+1);
					i = 0;
				}
			}
		}
		System.out.print("번호: ");
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		
	}
	
	public void rankcheck(int[]user, int[]comp) {
		int count = 0;
		int extra = 0;
		for(int i = 0; i < user.length; i++) {
			if(comp[6] == user[i]) {//2등여부 테스트
				extra = 1;
			//이거만 comp의 7번째 숫자를 보므로.
				for(int j = 0; j < user.length; j++) {
					if(user[i] == comp[j]) {
						count ++;
					}
					
				}
				
			} else {
				for(int j = 0; j < user.length; j++) {
					//보너스 번호 떼고 유저랜덤이랑 컴퓨터 랜덤 비교
					if(user[i] == comp[j]) {
						count ++;
					}
					
				}
				
			}
			
			
		}
		
		
		if(extra == 1 && count == 5) {
			System.out.println("2등입니다.");
			return;
		}
		if(count == 6) {
			System.out.println("1등입니다.");
		}else if(count == 5) {
			System.out.println("3등입니다.");
		}else if(count == 4) {
			System.out.println("4등입니다.");
		}else if(count == 3) {
			System.out.println("5등입니다.");
		} else {
			System.out.println("꽝");
		}
	}

	public static void main(String[] args) {
//	로또 번호 생성 후 당첨 여부 확인
//	1부터 45까지 번호중 6개를 선택해서 만들어지는 숫자
//	자동으로 6개 선택도 있고, 입력받는거도 있고.
//	근데 우린 이 6개 선택을 랜덤 자동으로 할거임.
//	유저번호 6개(랜덤 자동으로) 당첨번호 7개(랜덤자동).
//	6개 + 보너스 번호 1개로 총 7개의 당첨 번호가 만들어짐.
//	모든 번호는 중복되선 안됨.
//	유저 번호와 당첨번호는 중복 번호가 존재해선 안됨.
//	
//	6개 일치 = 1등(보너스 번호 배제하고, 순서 상관 없음)
//	5개가 일치하는데 보너스 번호도 같이 일치하면 2등 
//	   >>보너스 번호는 여기서만 사용됨.
//	
//	5개 일치하는데 보너스 미포함= 3등
//	4개 일치하면 4등
//	3개 일치 5등
//	나머진 꽝
//	
//	근데 이거 그냥 만들면 확률이 주작이므로 테스트를 1에서 10으로 숫자 설정.
	

		Exam02 ex2 = new Exam02();
	
		Random  rand = new Random();
		
		int[] user = new int[6];
		
		int[] comp = new int[7];
		
		System.out.println("유저가 고른 6자리 랜덤 번호>> ");
		ex2.randgive(user);
		
		System.out.println("컴퓨터가 고른 7자리 랜덤 번호>> ");
		ex2.randgive(comp);
		
		ex2.rankcheck(user, comp);
	
	}


}

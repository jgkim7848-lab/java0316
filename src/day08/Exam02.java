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

//강사팁
// 매서드를 어떻게 나눌지를 고민해야한다.
// 해당 범위에 랜덤 배열을 채우는 매서드가 필요할테고
// 해당 등수 리턴 매서드가 있으면 좋겠고
// 중복 체크도 해야될테고
//
//1 배열을 랜덤수로 채워주는 메서드
//main에서 줄까 내부에서 생성할까....내 선택이긴한데
//배열 2개 리턴은 안되니까 6개짜리 리턴 7개짜리 리턴으로 하면???
//		길이만 다르지 사실상 같은거 만드는거잖냐....
//배열을 매개변수로 받아야겠다.
//배열을 채워서 return해주는걸로...
//매개변수는 int[]arr이고
//리턴타입은줄 필요가 없지 void  그냥 채우는거니까....
//    > 매개변수의 배열을 채우는 행동하면 끝인거이므
//
//중복 확인?
//		int[] arr에 대해 int random
//		리턴 타입 true false 불린
//		
//배열 출력 메서드는  매개변수로 int[]arr에 리턴 타입 void
//
//당첨확인 - 배열 2개를 매개변수로 받아야지 (유저가 뽑은거랑 컴퓨터가 뽑아준거)
//리턴 타입 - 당첨 등수 리턴이든 번호 개수만 리턴이든 어느쪽이든 몇등인진 알아야

 //public boolean iscontains(int[]arr, int random){
//	for(int i = 0 ~ arr.length) {
//		if arri == random{
//			return true
//		}
//	}
//	return false  왜 else 붙이고 return false를 하지 않았는가
//} -  그렇게 하면 다른 부분에 대해선 true인지 아닌지 확인이 안되서
// 
//isContains(arr, random)이란????  맨 앞에 !붙여서 반대로도 되던데
//if 문 안에 넣고 돌리더라 ㅅㅂ 머임 이거. 그냥 contains같긴함.
//toLowercase나 toUppercase 붙여쓰는거도 되나보네 

//뭐 할때 출력구문을 먼저 테스트 해보는게 제일 편함.

//엔간핸 메서드들은 값이 차있든 비어있든 고려할게 없다.
//근데 당첨 확인 메서드에선 상관이 있다...
//하나는 6자리 하나는 7자리따리.
//근데 이게 다른 코드에서 유저랑 로또를 바꿔넣으면 오류가 날수도 있다???
//유저와 로또배열은 길이의 차이가 있기때문에....
//만약에 user lotto 였는데 실수로 lotto user면????
//배열 2개를 넣는다고했지 둘이 길이 다른걸 순서대로 넣는다곤 안함.
//그러므로 내부적으로 위치가 바껴도 판단 가능하게 코드를 짜는거도 방법
//exception
//use.len >= lotto.len이면 배열이 잘못 들어왔다고 나오게하면 되긔.
//return으로 종료를 박을건데 -999 쑤시면 ㅗ딤.ㅍ
//





















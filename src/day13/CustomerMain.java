package day13;

import java.util.Scanner;


public class CustomerMain {

	public static void main(String[] args) {
		//백화점 고객
		//일반고객 적립 gold고객 할인+적입 vip고객 할인+적립
//		고객 => customer 부모
//		멤버변수 고객id 고객명 등급 보너스포인트(적립), 적립비율
//		
//		기본등급 silver / gold / vip
//		기본 적립비율 구매금액의 1%
	//silver  할인0%   적립1%
		//gold 할인5%   적립3%
		//vip  할인 10%    적립5%
		
		//vip는 전담 상담사가 존재. 이 멤버변수를 추가해줄것.agentName, agentNum
		
//		1보너스적립 계산 매서드
//		 구매 금액의 적립 보너스 계산, 누적 적립이 될것
//		보너스 적립에 대한 금액을 나타냄과 동시에 할인 여부도 체크하여 구매 금액 리턴할것.
//		
//		2 출력 메서드
//		ex 홍길동님은 vip고객이며 현재 보너스 포인트는 5000pt입니다.
//		vip니까 전담 상담사는 짱구이고 번호는 1111입니다. (이건 vip만)
		
		Scanner scan = new Scanner(System.in);
		
		
		Customer[] customer = new Customer[10];
		
		customer[0] = new VIPCustomer("1111", "홍길동", "순이", "0384");
		customer[1] = new GoldCustomer("2222", "만득이");
		customer[2] = new VIPCustomer("3333", "박박박","영이", "9876");
		customer[3] = new Customer("4444", "박살이");
		customer[4] = new GoldCustomer("5555", "황준용");
		customer[5] = new VIPCustomer("6666", "공삼이", "꿀벌", "5673");
		customer[6] = new Customer("7777", "임꺽정");
		customer[7] = new GoldCustomer("8888", "바리");
		customer[8] = new Customer("9999", "김순회");
		customer[9] = new Customer("4312", "남궁형");
		
		System.out.println("지불 금액과 포인트 계산 출력");
		int price = 100000;
		for(int i = 0; i < customer.length; i++) {
			int saleprice = customer[i].calcPrice(price);
			
			System.out.println(saleprice + "지불 예정");
			customer[i].printinfo();
		}
		
		System.out.println("========포인트 누적 확인용==============");
		price = 150000;
		for(int i = 0; i < customer.length; i++) {
			int saleprice = customer[i].calcPrice(price);
			
			System.out.println(saleprice + "지불 예정");
			customer[i].printinfo();
		}
		
		System.out.println("\n\n");
		//다운캐스팅 써볼건데
		//지금 상황에서 어떤 예시가 가능한가??
		//지금 vip 상담사....가 바꼈다면???
		//한명이 퇴사해서 상담사가 영이 9876에서 철이 9888로 바뀐거지.
		
		
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				//여기 까지 온건 vip가 맞도르
				VIPCustomer v = (VIPCustomer)customer[i]; //다운 캐스팅.
				if(v.getAgentName().equals("영이")){
							
					v.setAgentName("철이");
					v.setAgentNum("9888");
				
				}
			}
		}

		System.out.println("\n\n");
		//vip고객 리스트만 뽑아내기
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
					customer[i].printinfo();
			}
		}
		
		
		
		
	}

}





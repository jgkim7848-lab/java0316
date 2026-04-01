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
		
		
		Customer[] customer = new Customer[5];
		
		customer[0] = new Customer();
		customer[1] = new GoldCustomer();
		customer[2] = new VIPCustomer();
		
		
		
	}

}





package day11;//3번째.

import java.util.Scanner; //왜 import는 order에서만 써도 되는데
						//왜 밑에 new 들은 새로 또 불러와야하는가.

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
//		상품 Product class
//		주문 Order class
//		
//		주문 추력
//		 마지막에 지불 금액 출력
//		 
//		 1 전체 상품 보여주기
//		 2 주문 상품 수량 받기
//		 3 반복 주문 가능  종료 키워드 생성으로 반복 주문 가능하게
//		 4 주문이 완료되었습니다. > 전체 주문 내역 / 총 지불 금액 출력
//		
		Scanner scan = new Scanner(System.in);
		
        // 1. 상품 생성 (가격 세팅됨)
        Product product = new Product();

        // 2. 주문 객체 생성 (Product 넘김)
        Order order = new Order(product);
        
        System.out.print("시작하려면 1 입력: ");
        order.start();

        // 4. 메뉴 실행
        order.swch();
		
	}


}
//실제 돌아가는 시스템에서 내가 뭘 팔지 결정해보겠다.
//1 판매할 상품에 대한 등록. 
//주문 객체 생성후 주문 배열에 객체 넣기 Order(menuname, price, count)
//

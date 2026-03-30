package day11;//3번째

import java.util.Scanner;

public class Order {
	private Product product;
    public Order(Product product) {
        this.product = product;
    }
    
    public int p;
    
    Scanner scan = new Scanner(System.in);
    
    public void start() {
    	p = scan.nextInt();
    }
    
    public void printOrder() {
        int total = 0;

        int[] p1 = product.getP1();
        int[] p2 = product.getP2();
        int[] p3 = product.getP3();
        int[] p4 = product.getP4();
        int[] p5 = product.getP5();

        System.out.println("=== 주문 내역 ===");

        if (p1[1] > 0) {
            System.out.println("상품1 수량: " + p1[1] + " / 금액: " + p1[2]);
            total += p1[2];
        }
        if (p2[1] > 0) {
            System.out.println("상품2 수량: " + p2[1] + " / 금액: " + p2[2]);
            total += p2[2];
        }
        if (p3[1] > 0) {
            System.out.println("상품3 수량: " + p3[1] + " / 금액: " + p3[2]);
            total += p3[2];
        }
        if (p4[1] > 0) {
            System.out.println("상품4 수량: " + p4[1] + " / 금액: " + p4[2]);
            total += p4[2];
        }
        if (p5[1] > 0) {
            System.out.println("상품5 수량: " + p5[1] + " / 금액: " + p5[2]);
            total += p5[2];
        }

        System.out.println("-------------------");
        System.out.println("총 금액: " + total);
    }
    
    
    
    public void swch() {//시작 여부 물어보기.
    	while(p == 1) {
    		System.out.println("메뉴에 맞는 버튼을 눌러주세요.");
    		System.out.println("1~5 음식 추가, 6 결산, 7 종료");
    		int o;
    		o = scan.nextInt();
    		switch(o) {
    		case 1: 
    			System.out.print(o + "번 메뉴를 몇개 주문할지 입력해주세요.\n" + product.getP1()[0] +"원\n>> "); 
    		int y = scan.nextInt();
    		product.calc1(y); break;
    		case 2:
    			System.out.print(o + "번 메뉴를 몇개 주문할지 입력해주세요.\n" + product.getP2()[0] +"원\n>> "); 
        		int t = scan.nextInt();
        		product.calc2(t); break;
    		case 3:
        		System.out.print(o + "번 메뉴를 몇개 주문할지 입력해주세요.\n" + product.getP3()[0] +"원\n>> "); 
        		int r = scan.nextInt();
        		product.calc3(r); break;
    		case 4:
    			System.out.print(o + "번 메뉴를 몇개 주문할지 입력해주세요.\n" + product.getP4()[0] +"원\n>> "); 
        		int w = scan.nextInt();
        		product.calc4(w); break;
    		case 5:
    			System.out.print(o + "번 메뉴를 몇개 주문할지 입력해주세요.\n" + product.getP5()[0] +"원\n>> "); 
        		int q = scan.nextInt();
        		product.calc5(q); break;
    		case 6: printOrder(); product.reset();break;
    		case 7: System.out.println("종료");return;
    		default: System.out.println("올바른 숫자를 입력해주세요."); break;
    		}
    	}
    }
}

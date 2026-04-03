package costomexception;

public class main {

    public static void main(String[] args) {

        // 상품 등록
        product[] list = new product[3];
        list[0] = new product("사과", 1000, 10);
        list[1] = new product("바나나", 500, 20);
        list[2] = new product("딸기", 2000, 5);

        // 전체 상품 출력
        System.out.println("=== 초기 상품 목록 ===");
        for(int i = 0; i < list.length; i++) {
            list[i].info();
        }

        System.out.println("------");

        // 주문
        order o1 = new order("사과", 5);
        o1.ordering(list);

        System.out.println("------");

        order o2 = new order("바나나", 10);
        o2.ordering(list);

        System.out.println("------");


        // 최종 상품 상태 출력
        System.out.println("=== 최종 상품 목록 ===");
        for(int i = 0; i < list.length; i++) {
            list[i].info();
        }
        System.out.println("------");
        order o3 = new order("사과", 20); // 재고 부족
        o3.ordering(list);

        System.out.println("------");

        // 최종 상품 상태 출력
        System.out.println("=== 최종 상품 목록 ===");
        for(int i = 0; i < list.length; i++) {
            list[i].info();
        }
        
        order o4 = new order("딸기", 20); // 재고 부족
        o3.ordering(list);
        
        System.out.println("\n\n\n");
        
        order o5 = new order("파파야", 20); // 없는거 주문
        o3.ordering(list);
    }
}
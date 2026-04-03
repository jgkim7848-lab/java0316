package costomexception;

public class order {

    private String requireName;
    private int requireMany;

    public order(String requireName, int requireMany) {
        this.requireName = requireName;
        this.requireMany = requireMany;
    }

    // 주문 처리 (상품 배열에서 찾아서 처리)
    public void ordering(product[] list) {

        boolean found = false;

        for(int i = 0; i < list.length; i++) {

            if(requireName.equals(list[i].getGoods())) {
                found = true;

                try {list[i].sell(requireMany);

                    System.out.println("판매 성공!");
                    System.out.println("상품: " + requireName);
                    System.out.println("판매 개수: " + requireMany);
                    System.out.println("매출: " + list[i].getGoodsprofit());
                    System.out.println("남은 재고: " + list[i].getHowmany());

                } catch (OutOfStockException e) {
                    System.out.println(e.getMessage());
                }

                break;
            }
        }

        if(!found) {
            System.out.println("상품이 존재하지 않습니다.");
        }
    }
}
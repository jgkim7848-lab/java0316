package costomexception;

public class product {

    private String goods;
    private int price;
    private int howmany;
    private int goodsprofit;
    private int chongearnings;

    public product() {}

    public product(String goods, int price, int howmany) {
        this.goods = goods;
        this.price = price;
        this.howmany = howmany;
        this.goodsprofit = 0;
        this.chongearnings = 0;
    }

    // 판매 메서드
    public void sell(int amount) {
        if(amount > this.howmany) {
            throw new OutOfStockException("재고가 부족합니다!");
        }

        this.howmany -= amount;

        int profit = amount * this.price;
        this.goodsprofit = profit;
        this.chongearnings += profit;
    }

    // 상품 정보 출력
    public void info() {
        System.out.println("상품명: " + goods +
                " / 가격: " + price +
                " / 재고: " + howmany +
                " / 총매출: " + chongearnings);
    }

    // getter
    public String getGoods() {
        return goods;
    }

    public int getPrice() {
        return price;
    }

    public int getHowmany() {
        return howmany;
    }

    public int getGoodsprofit() {
        return goodsprofit;
    }

    public int getChongearnings() {
        return chongearnings;
    }
}
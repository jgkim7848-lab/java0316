package superProduct;

public class Order extends Product{
	// 주문(Order) class : 상품, 개수, 가격(판매금액), 금액(개수*가격)
	// 멤버변수
//제품명과 가격은 프로덕트 클래스에 멤버 변수를 사용가능
	//부모 멤버 쓸거면 super.메서드명 or super.멤버변수명.
	private int count; // 주문수량
	private int total; // 수량 * 가격
	
	//생성자
	public Order() {} //디폴트로 있어야될 비어있는놈.
	public Order(String name, int price, int count) {
		//super(name, price);왜 이게 아닌거람
		super.setName(name);
		super.setPrice(price);
		this.count = count;
		totalCalc();
	}
	
	// total 계산 메서드
	public void totalCalc() {
		this.total = super.getPrice() * this.count;
	}
	
	// 주문 추가 메서드 
	public void insertOrder(String name, int price, int count) {
		super.getName();
		super.getPrice();
		this.count = count;
		totalCalc();
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "[" + super.getName() + "  " + super.getPrice() + count + "  "  + " => " + total + "]";
	}	

}
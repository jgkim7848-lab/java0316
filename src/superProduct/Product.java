package superProduct;

public class Product {
	// 상품(Product) class : 상품, 가격(판매금액), 판매할 물건 객체의 이름과 가격
	
	// 멤버변수
	private String name;
	private int price;
	
	//클래스 생성시 반드시 필요한 사항 - 멤버변수, 생성자, 게터 세터, toString
	
	// 생성자
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 상품 추가하는 메서드 (편리성을 위해 추가 - 없어도 됨)
	// 객체 생성 이후에 값을 추가해야 할 경우
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}//이 생성자를 통해서 생성을 못할경우....setname setprice로 지정을 해줘야할텐데
	//생성자 역할을 하는 메서드가 하나 있으면 편할거같도르
	//이름과 가격을 등록하는걸 만들고싶다.
	 //set으로 하면 편하다만은 그냥 만들고싶다 해서 나온게 위에거.
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + name + " : " + price + "]";
	}
	
}
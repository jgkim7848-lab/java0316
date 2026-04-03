package day13;

public class GoldCustomer extends Customer{
	
	//customer에 없는 멤버 변수만 정의
//	private String customerID;
//	private String customerName;
//	private String customerGrade;
//	private double bonusRatio;
//  이건 필요 없음.
	//대신 할인율이 존재함.
	private double saleRatio; //이거도 정해져있음
	
	
	public GoldCustomer() {
		
	}
	
	public GoldCustomer(String id, String name) {
		//이렇게 적고 내용 비우면 Customer에 있는거랑 같이 받아가게됨....
		super(id, name); //부모 생성자 호출
		//근데 여기서 this.하면 private이라 안됨. protected면 될텐데 
		super.setCustomerGrade("Gold");
		super.setBonusRatio(0.03);
		this.saleRatio = 0.05;
		
	}
	
	//출력은 vip만 수정하면 되고 customer의거 갖다 쓰면 된다.
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		//return super.calcPrice(price); 
		super.calcPrice(price); // 이게 this.bonuspoint += (int)(  *  )랑 같다??
		return price - (int)(price * saleRatio);
		//이걸 리턴값으로 안하면 customer에서 호출하고있는게 .calcPrice인데??? 설명이 이상해졌네 뭐지
		//int price2 = super.calcPrice(price);  return price;해도 되긴함
		//부모의 매서드를 호출해서 가격을 주고 보너스 적립. 가격 리턴.
		//근데 이 가격이 나한텐 필요가 없으니 내 가격을 다시 설정할거임.
		
	}
	

	@Override
	public String toString() {
		return "GoldCustomer [saleRatio=" + saleRatio + "]";
	}



	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
}

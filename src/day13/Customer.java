package day13;

public class Customer {

	private String customerID;
	private String customerName;
	private String customerGrade; //등급은 정해진게 들어갈테니까??? 사실상 위에 2개만 받으면 됨
	private int bonuspoint;
	private double bonusRatio;
	
	
	public Customer() {}

	public Customer(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	
	//메서드좀 만들어보자.
	//보너스 포인트의 누적과 결제 금액의 리턴 메서드.
	//이거 계산할려면 내가 얼마를 샀는지가 중요함. = 구매 금액을 아는게 선결조건.
	//매개변수: 구매 금액. >int price
	//return타입은 결제해야하는 금액 할인감안
	public int calcPrice(int price) {
		int point = (int)(price * bonusRatio);
		this.bonuspoint += point;
		return price;//실버등급은 할인율이 없거든.
	}
	
	//출력메서드
	public void printinfo() {
		System.out.println(customerName + "님은 " + customerGrade+ "고객이며 \n현재 보너스 포인트는 " + bonuspoint + "pt입니다.");
	}
	
	
	
	

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonuspoint=" + bonuspoint + ", bonusRatio=" + bonusRatio + "]";
	}
	

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(int bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	
	
}

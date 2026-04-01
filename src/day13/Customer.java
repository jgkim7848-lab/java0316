package day13;

public class Customer {

	private String customerID;
	private String customerName;
	private int point;
	private int DC;//할인
	private int Reward;//포인트적립
	
	
	
	
	
	
	
	
	
	
	public Customer() {}
	
	public Customer(String customerID, String customerName, int point, int dC, int reward) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.point = point;
		DC = dC;
		Reward = reward;
	}






	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", point=" + point + ", DC="
				+ DC + ", Reward=" + Reward + "]";
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getDC() {
		return DC;
	}
	public void setDC(int dC) {
		DC = dC;
	}
	public int getReward() {
		return Reward;
	}
	public void setReward(int reward) {
		Reward = reward;
	};//적립
	
	
	
	
	
}

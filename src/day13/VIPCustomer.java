package day13;

public class VIPCustomer extends Customer{
	private String agentName;
	private String agentNum;
	private double saleRatio; //이거도 정해져있음
	
	
	public VIPCustomer() {
		
	}
	
	public VIPCustomer(String id, String name, String agentName, String agentNum) {
		//이렇게 적고 내용 비우면 Customer에 있는거랑 같이 받아가게됨....
		super(id, name); //부모 생성자 호출 
		//만약에 id는 들어왔는데 name이 안들어오면 호출 못함.
		//근데 여기서 this.하면 private이라 안됨. protected면 될텐데 
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);
		this.saleRatio = 0.1;
		
		this.agentName = agentName;
		this.agentNum = agentNum;
		
	}
	
	
	
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price - (int)(price * saleRatio);
	}

	@Override
	public void printinfo() {
		// 기존 출력 내용은 유지 하되, 
		super.printinfo();
		//추가 출력이 있지 vip는
		System.out.println("전담 상담사는 "+ agentName + "이고 번호는 " + agentNum + "입니다.");
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		return "VIPCustomer [agentName=" + agentName + ", agentNum=" + agentNum + "]";
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	
	
}

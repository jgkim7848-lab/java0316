package day13;

public class VIPCustomer extends Customer{
	private String agentName;
	private String agentNum;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
}

package day11;//3번째

public class Product {

	private int[] p1 = new int[3];
	private int[] p2 = new int[3];
	private int[] p3 = new int[3];	
	private int[] p4 = new int[3];
	private int[] p5 = new int[3];
	
	
	public Product(){//가격
		p1[0] = 3000;
		p2[0] = 4000;
		p3[0] = 2500;
		p4[0] = 5200;
		p5[0] = 8900;
	}
	
	public void reset() { //order에서 결산하고 0으로 만들고싶을때.
	    p1[1] = 0; p1[2] = 0;
	    p2[1] = 0; p2[2] = 0;
	    p3[1] = 0; p3[2] = 0;
	    p4[1] = 0; p4[2] = 0;
	    p5[1] = 0; p5[2] = 0;
	}
	
	public void calc1(int a) {
		p1[1] += a;
		p1[2] = p1[0] * p1[1];
	}
	public void calc2(int b) {
		p2[1] += b;
		p2[2] = p2[0] * p2[1];
	}
	public void calc3(int c) {
		p3[1] += c;
		p3[2] = p3[0] * p3[1];
	}
	public void calc4(int d) {
		p4[1] += d;
		p4[2] = p4[0] * p4[1];
	}
	public void calc5(int e) {
		p5[1] += e;
		p5[2] = p5[0] * p5[1];
	}
	
	
	
	
	
	
	public int[] getP1() {
		return p1;
	}
	public void setP1(int[] p1) {
		this.p1 = p1;
	}
	public int[] getP2() {
		return p2;
	}
	public void setP2(int[] p2) {
		this.p2 = p2;
	}
	public int[] getP3() {
		return p3;
	}
	public void setP3(int[] p3) {
		this.p3 = p3;
	}
	public int[] getP4() {
		return p4;
	}
	public void setP4(int[] p4) {
		this.p4 = p4;
	}
	public int[] getP5() {
		return p5;
	}
	public void setP5(int[] p5) {
		this.p5 = p5;
	}	
	
}

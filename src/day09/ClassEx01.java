package day09;

import java.util.Scanner;

public class ClassEx01 {//4번째.

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		tv t = new tv();
		t.situ();
		//situ - 현 상황.
		//pwr 전원
		//chup down - 채널 조절 1에서 10 순환
		//volup down - 소리 조절. 순환 없는 1부터 20
		System.out.println("=============");
		t.pwr();
		t.situ();
		t.voldown();
		t.volup();
		t.volup();
		

		t.voldown();
		t.situ();

		System.out.println("=============");
		
		
		t.chdown();
		t.chup();
		
		t.situ();

		System.out.println("=============");
		
		
		//fvr favorlist  fvrad
		
		t.fvradd();
		t.favorlist();
		t.chup();
		t.fvradd();
		t.chup();
		t.fvradd();
		t.chup();
		t.fvradd();
		System.out.println("=============");
		t.favorlist();

		t.chup();
		t.fvradd();
		System.out.println("=============");
		t.favorlist();

		System.out.println("정상작동확인용분기점");
		
		t.chup();
		t.fvradd();
		System.out.println("ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
		t.favorlist();
		t.chup();
		t.fvradd();
		System.out.println("ㅂㅂㅂㅂㅂㅂㅂㅂㅂㅂ");
		t.favorlist();t.chup();
		t.fvradd();
		System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		t.favorlist();
		t.chup();
		t.fvradd();
		System.out.println("ㄱㄱㄱㄱㄱㄱㄱㄱㄱ");
		t.favorlist();
		t.chup();
		t.fvradd();
		System.out.println("ㄷㄷㄷㄷㄷㄷㄷㄷ");
		t.favorlist();
		
		t.chup();
		t.fvradd();
		System.out.println("ㅛㅛㅛㅛㅛㅛㅛㅛㅛㅛ");
		t.favorlist();
		
	}

}
/*선호채널 등록. > 5개까지 등록 가능.
 * 선호채널 등록 메서드 1개, 어떤 선호채널이 등록되어있는지 보기.
 * 배열에 5개 담으면 된다 아이겄나.
 * 단 선호채널 등록에 대해....
 * 5개 넣고도 특정 채널에서 선호채널 등록 버튼을 누르면 [0] [1] [2] 순서대로
 * 다시 선호채널로 등록된다.
 * 현재 채널을 선호 채널 배열에 넣기.
 * */




class tv{//전원 채널 볼륨 브랜드
	//멤버변수 brand power ch vol
	//채널 볼륨 다 파워가 켜져야 둘다 작동하는걸로.
	//채널은 10번까지만. 나리는거도. 1~10하고 그 이외 범위가 되면 숫자도 한바퀴 도는걸로
	//볼륨? max min 20이랑 0으로.
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	
	public int count = 0;

	private int [] favor = new int[5];//선호채널.
	
	//생성자 - 기본 생성자 만들고ㅡ 매개변수 생성자는 brand만.
	//생성자1
	public tv(String brand) {
		super();//내 부모 클래스를 의미하느데 여기선 필요없음.
		this.brand = brand;
	}
	//생성자2
	public tv() {
		ch = 1;
	}
	
	
	
	//@override와 언옵테이션?????
	
	//메서드
	//파워 온오프
	public void pwr() {
		this.power = !this.power;
		if(this.power) {
			System.out.println("on");
		} else {
			System.out.println("off");
		}
	}
	//채널 업다운 1 ~ 10 순환구조
	public void chup() {
		if(this.power) {
		if(ch == 10) {
			ch = 1;
			System.out.println("ch: " + ch);
		} else {
			ch++;
			System.out.println("ch: " + ch);
		}} else {
			System.out.println("전원을 켜주세요.");
		}
		
	}
	public void chdown() {
		if(this.power) {
		if(ch == 1) {
			ch = 10;
			System.out.println("ch: " + ch);
		} else {
			ch--;
			System.out.println("ch: " + ch);
		}}else {
			System.out.println("전원을 켜주세요.");
		}
	}
	//볼륨 업다운 0~20까지.
	public void volup() {
		if(this.power) {
		if(vol == 20) {
			System.out.println("음량은 더이상 커질수 없습니다.");
		} else {
			vol++;
			System.out.println("vol: " + vol);
		}}else {
			System.out.println("전원을 켜주세요.");
		}
	}
	public void voldown() {
		if(this.power) {
			vol--;
			if(vol <0) {
				vol = 0;
				System.out.println("볼륨은 0보다 작아질수없습니다. " + vol);
				
			}else {
				System.out.println("vol : " + vol);
			}
			
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
	public void situ() {
		System.out.println(this.power + " / " + this.brand  + " / " + this.ch + " / " + this.vol);
	}
	
	
	public void fvr(int [] arr) {
		
	}
	
	public void favorlist() {
		System.out.print("선호채널>> ");
		for(int i = 0; i < favor.length; i++) {
			if(favor[0] == 0) {
				System.out.println("선호채널이 없습니다");
				break;
			} else if(favor[i]==0) {
				System.out.println("선호 채널을 추가해주세요.");
				break;
			}
			
			System.out.println(favor[i] + " ");
		}
	}
	
	public void fvradd() {
		if(count <5) {
			favor[count] = this.ch;
			
			count++;
		} else {
			count = 0;
			favor[count] = this.ch;
			count++;
		}
	}
	
	
	
	//getter setter 단축키가 있다??
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
	
	public int[] getFavor() {
		return favor;
	}
	public void setFavor(int[] favor) {
		this.favor = favor;
	}
	
}
//package day10;
//
//public class Card {
//	/*진짜 카드를 만들어볼거임??
//	 *숫자1(a로 표현됨)부터 13까지인데 1(A  11J  12Q   13K로 표현되는.
//	 *모양 4가지 ♣️   ♠️   ♦️   ♥️ 
//	 *ex ♣️A 이런식으로.
//	 *범위에 벗어나는 숫자는 1.
//	 *해당 범위에 벗어나는 숫자는 하트
//	 *....즉 ^이런 기호를 쓰면 이건 하트1로 취급하는것.
//	 *클로버20이 되면? 클로버A로 바뀜.
//	 *즉 벗어나는 값은 입력되지 못하게 만들것.
//	 *
//	 *멤버변수 - 숫자랑 모양
//	 *toString 연결할거임.
//	 *
//	 *생성자   기본 생성자만....시작 하트A
//	 *출력구문의 별도 제작
//	 * > print의 별도 제작. 값 2 ~ 10까지는 자신의 숫자, 나머진 A J Q K출력
//	 * 
//	 * 숫자에는 1 부터 13을 담고 print시에 ajqk로 바꿔먹으면된다.
//	 * getter setter 만들고...
//	 * 
//	 **/
//	private int num;
//	private String shape;
//
//
//	
//	public void print() {
//		System.out.println(shape);
//		switch(num) {
//		
//		case 1: System.out.println("A"); break;
//		case 11: System.out.println("J"); break;
//		case 2: System.out.println("Q"); break;
//		case 13: System.out.println("K"); break;
//		default:
//			System.out.println(num);
//		}
//		System.out.println();
//	}
//	
//	
////	
////	String first = str.substring(0, 1);  // 첫 글자
////	String rest = str.substring(1);      // 나머지
//	
//	
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		if(num > 13 || num < 1) {
//			this.num=1;
//			return;
//		}
//		this.num = num;
//	}
//	public String getShape() {
//		return shape;
//	}
//	public void setShape(String shape) {
//		//      ♦️   ♥️ 
//		switch(shape) {
//		case "♣️": case "♠️": case "♦️":  case "♥️":
//			this.shape = shape;
//			break;
//			default: this.shape = "♥️";
//		
//		}
//		this.shape = shape;
//	}
//	public String toString() {
//		return shape + num;
//	}
//}


package day10;

public class Card {
	/* 숫자 : 1 ~ 13 => 1(A), 11(J), 12(Q), 13(K)
	 * 모양 : ♠, ♥, ♣, ◆
	 * ex) ♥A, ♥5, ♣K    ^1 => ♥A  ♣20 => ♣A
	 * 해당 범위에 벗어나는 숫자는 => 1
	 * 해당 범위에 벗어나는 숫자는 => ♥
	 * 
	 * - 멤버변수 : 숫자(num), 모양(shape)
	 * - toString
	 * - 생성자 => 기본생성자만 => ♥A
	 * - print (조건을 달아서 A J Q K 출력)
	 * - getter/setter
	 * */
	private int num;
	private String shape;
	
	
	
	public Card() {
		this.num = 1;
		this.shape = "♥";
	}
	
	//print
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 1: System.out.print("A"); break;
		case 11: System.out.print("J"); break;
		case 12: System.out.print("Q"); break;
		case 13: System.out.print("K"); break;
		default:
			System.out.print(num);
		}
		System.out.print(" ");
	}
	
	
	
	

	
	
	
	
	
	
	//-----------------------------------------------
//	public String[][] printout() {
//		String[][] str = new String[shape.length()][13];
//		String shape[] = {"♥", "◆", "♣", "♠"};
//		for(int i=0; i<shape.length; i++) {
//			for(int j=1; j<=13; j++) {
//				String a;
//				setShape(shape[i]);
//				a= shape[i];
//				int b;
//				setNum(j);
//				b = j;
//				str[i][j] = a+b;
//			}
//			System.out.println();
//		}
//		
//		return str;
//	}
	
	
	
	//----------------------------------------------

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		//  ♠  ♥  ♣  ◆
		switch(shape) {
		case "♠": case "♥": case "♣" :  case "◆":
			this.shape = shape;
			break;
			default:
				this.shape = "♥";
		}
	}

	@Override
	public String toString() {
		return shape + num;
	}

}
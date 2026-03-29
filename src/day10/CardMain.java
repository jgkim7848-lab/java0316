package day10;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card card = new Card(); //이게 카드 1장을 의미.
//		
//		System.out.println(card); // toString
//		
//		card.print();
//		
//		// ♥A, ♥5, ♣K    ^1 => ♥A  ♣20 => ♣A
//		card.setNum(13);
//		card.setShape("^");
//		card.print();
//		
//		card.setNum(4);
//		card.setShape("♣");
//		card.print();
//		System.out.println();
//		System.out.println("-----------");
//		
//		//  ♥ ◆ ♣ ♠  
//		String shape[] = {"♥", "◆", "♣", "♠"};
//		
//		for(int i=0; i<shape.length; i++) {
//			for(int j=1; j<=13; j++) {
//				card.setShape(shape[i]);
//				card.setNum(j);
//				card.print();
//			}
//			System.out.println();
//		}
//		
//		System.out.println("----------");
//		for(int i=1; i<=4; i++) {
//			switch(i) {
//			case 1: card.setShape("♥"); break;
//			case 2: card.setShape("◆"); break;
//			case 3: card.setShape("♣"); break;
//			case 4: card.setShape("♠"); break;
//			}
//			for(int j=1; j<=13; j++) {
//				card.setNum(j);
//				card.print();
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println("==================");
//		System.out.println("cardpack");
//		CardPack cp = new CardPack();//cardpack에 의해 52장이 생성됨.
//		cp.getPack()[0].print();
//		
//		
//		System.out.println();
//		for(int i = 0; i < cp.getPack().length; i++) {
//			cp.getPack()[i].print();
//		}
//		
//		System.out.println("\n=========================");
////		Card[] pack = cp.getPack();
////		for(int i = 0; i < pack.length; i++) {//바로위에 for문이랑 같은 의미임.
////			pack[i].print();
////			//Card c = pack[i]; c.print();
////		}
//		
//		System.out.println();
//		cp.shuffle();
//		Card[] pack = cp.getPack();
//		for(int i = 0; i < pack.length; i++) {
//			Card c = pack[i];
//			c.print();
//		}
//		
//		
		
		//실제 게임하듯이 해보기위해 위에 부분을 주석처리함.
		CardPack cp = new CardPack();
		System.out.println("딜러가 카드를 섞고있습니다.");
		
		cp.shuffle();
		
		System.out.println("딜러가 카드를 나누고 있습니다.");
		System.out.println("user1");
		Card player1 = cp.pick();
		System.out.println("user2");
		Card player2 = cp.pick();
		System.out.println("user3");
		Card player3 = cp.pick();
		System.out.println("user4");
		Card player4 = cp.pick();//.pick이 Card를 리턴해주잖아..
		
		System.out.println("각 유저는 카드 오픈해보쇼.");
		
		System.out.print("user1> ");
		player1.print();
		System.out.println();
		System.out.print("user2> ");
		player2.print();
		System.out.println();
		System.out.print("user3> ");
		player3.print();
		System.out.println();
		System.out.print("user4> ");
		player4.print();
		System.out.println();
		
		System.out.println();
		System.out.println("-------------------");
		
		
		cp.init();
		
		
		
		
	}

}


//카드 배열의 모든 번지 안에 숫자 모양 print 게터 세터가 들어가있는거지 (???)
//heap 영역에 만들어서 주소를 붙이는거니까 52개를 만들어서 각자각자를 연결하는거다.
//1개를 만들어서 여기저기 넣으면 공유가 되서 주소만 같이 쓰는게 되고
//하나 바뀌면 공유된거 싹다 바뀌게된다.


//CardPack cp를 만들었지??
//카드팩 객체를 만들면 팩이 만들어져서 52개의 카드가 들어가있게된다.
//카드안엔 숫자랑 모양이랑 프린트랑 게터세터랑....
//그중에 프린터를 찍으면?
//	cp.getpack[i]print입장에선 내거만 찍었다?
//	내가 CardPack에서 Card[] pack을 해서 Card로 만들어서??
//	new로 Card들을 생성해서....
//카드팩이 카드들이 사는 아파트가 된거다
//각자가 다 이런저런 메서드함수들 바리바리 싸들고있는거고????
//











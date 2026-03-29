package day10;

import java.util.Random;

public class CardPack {
	private Card[] pack = new Card[52];
	private int index;
	
	//카드 1장을 new 로 생성해서 하나하나 각자 넣어야한다....??
	//for문안에서 new가 계속 돌아가야 52장의 카드가 생기는거다.
	public CardPack() {
		String shape[] = {"♥", "◆", "♣", "♠"};
		
		for(int i=0; i<shape.length; i++) {
			
			for(int j=1; j<=13; j++) {
				Card card = new Card();//카드 1장 생성에 대한 2중for문
				card.setShape(shape[i]);
				card.setNum(j);
				pack[index] = card;
				index++;
			}
		}
	}
	
	//카드 섞기
	public void shuffle() {
//	    Random r = new Random();
//
//	    for(int i = pack.length - 1; i > 0; i--) {
//	        int j = r.nextInt(i + 1); // 0 ~ i
//
//	        // 카드 교환
//	        Card temp = pack[i];
//	        pack[i] = pack[j];
//	        pack[j] = temp;
//	    }
		for (int i = 0; i < pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			//교환
			Card tmp = pack[i]; //카드 자료형??
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	//하나씩 나눠주는 기능
	//내가 리턴해야되는 타입은 Card
	public Card pick() {
		if(index==0) {
			return null;
		}
		index--;
		return pack[index];
	} // return이 이 함수의 종료를 의미하는가....맞는거같기도하고.
	
	//초기화
	//카드의 번지 정상화. index번지의 정상화
	public void init() {
		index = 52;
		shuffle();
	}
	
	
	
	
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}

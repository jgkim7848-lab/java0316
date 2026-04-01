package day13;//2번째임. 1번째는 스튜던트 매니저.

public class Polymorphism01 {

	public static void main(String[] args) {
		// 다형성      폴리모피즘 - 다양한 객체를 가진다. 다양한 객체로 형변환이 가능하다 이런 소리.
		
//		하나의 클래스가(부모객체) 여러 자료형(자식객체)으로 구현되어 실행되는 형태
//		코드는 같은데 들어오는 객체에 따라 다른 실행 결과를 얻을수 있음
//		다형성을 잘 활용하면 유지보수에 좋고 유연한 코드 나오고 확장성 있는 코드 나오고 아무튼 좋음.
//		저번에 animal 클래스에서 dog cat 받은거 그런건감
		
		
		//각자 dog tiger eagle human객체를 각자 생성해서 각자의 move 메서드를 호출해서 출력하기.
		
		dog d = new dog();
		d.move();
		
		tiger t = new tiger();
		t.move();
		
		eagle e = new eagle();
		e.move();
		
		human h = new human();
		h.move();
		
		cat c = new cat();
		c.move();
		
		System.out.println();
		
		Animal a = new Animal();
		a.move();
		//조상 타입으로 자식 객체 생성이 가능하다.
		Animal d1 = new dog(); //단 dog d2 = new Animal();은 안됨.
		d1.move();
		
		//Animal c1 = new cat();  상속 안받아서 안됨.
		Animal t1 = new tiger();
		t1.move();
		Animal e1 = new eagle();
		e1.move();
		Animal h1 = new human();
		h1.move();
		//Animal 객체의 배열에 자식 객체 추가 가능.
		Animal[] anilist = new Animal[5];
		int cnt = 0;
		anilist[cnt++] = d1;
		anilist[cnt++] = t1;
		anilist[cnt++] = e1;
		anilist[cnt++] = h1;
		anilist[cnt++] = h;//animal 객체로 형변환이 됨 (업캐스팅)
		
		System.out.println();
		System.out.println();
		for(int i = 0; i < cnt; i++) {
			anilist[i].move();
		}
		System.out.println();//자식객체가 갖고있는 고유값을 사용하려면 자신의 객체로 다운 캐스팅 해야
							//사용 가능함.
		dog d_1 = (dog)anilist[0]; //다운 캐스팅.
		d_1.walk();
		
		//dog t_1 = (dog)anilist[1];//tiger
		//t_1.walk(); //tiger한테 walk가 없어서 오류남. tiger은 hunting임.
		
		tiger t_1 = (tiger)anilist[1];
		t_1.hunting();
		
		System.out.println();
		System.out.println(anilist[1] instanceof tiger);
		
		
		for(int i = 0; i < cnt; i++) {
			if(anilist[i] instanceof dog) {
				((dog)anilist[i]).walk();
				System.out.println("-dog");
			} else if(anilist[i] instanceof tiger) {
				((tiger)anilist[i]).hunting();
				System.out.println("-tiger");
			}else if(anilist[i] instanceof eagle) {
				((eagle)anilist[i]).flying();
				System.out.println("-eagle");
			}else {
				((human)anilist[i]).readbook();
				System.out.println("-human");
			}
		}
		System.out.println();
		System.out.println("다형성 메서드 활용");
		
		for(int i = 0; i < cnt; i++) {
			//p1.moveanimal(anilist[i]);
			
			
		}
			
		
		
	}//main의 끝.
	//각 객체의 move()를 실행해주는 메서드를 실행해보고싶은뎅
	public void moveanimal(human hum) {
		hum.move();
	}
	public void moveanimal(dog dg) {
		dg.move();
	}
	public void moveanimal(Animal anim) {
		anim.move();
	}

}
class cat{
	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("고양이가 꿍실꿍실");
	}
}

class dog extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("강아지가 아장아장");
	}
	public void walk() {
		System.out.println("댕댕이의 아침저녁산책");
	}
	
}

class tiger extends Animal{
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 어슬렁어슬렁");
	}
	public void hunting() {
		System.out.println("호랑이의 밤낮사냥");
	}
}
class eagle extends Animal{
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 파닥파닥");
	}
	public void flying() {
		System.out.println("독수리의 공중곡예");
	}
}

class human extends Animal{
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("인간이 두발로 워킹");
	}
	public void readbook() {
		System.out.println("인간의 독서방법");
	}
}
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}










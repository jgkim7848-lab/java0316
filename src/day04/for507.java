package day04;

public class for507 {
	public static void main(String[] args) {
		//소수찾기
		
		for(int mian = 3; mian <= 100; mian++) {
			a: for(int sub = 2; sub <= mian-1; sub++) {
				if(mian % sub ==0) {
					break a;
				}
				System.out.println(mian);
			}
		}
		//이거 왜 3 555 77777 9 11 11 11 11 11  뭐 이런식으로 나오는지 이유를 모르겠다.
		//시발 뭐지이거.
		
		
		//num의 소수 판별
		int num = 3;
		int count = 0;
		for(int i = 2; i < num; i++) {
			if(num%i==0) {
				count ++;
			}
			if(count == 0) {
				System.out.println("소수임");
				
			} else {
				System.out.println("소수 아님");
				
			}
		}
		
		//그럼 2부터 100까지 소수 판별은 위에걸 다시 for문으로 감싸면 된다.
		for(int i = 2; i <= 100; i++) {
			int count1 = 0;
			for(int i1 = 2; i1 < i; i1++) {
				if(i % i1==0) {
					count1 ++;
				}
				
			}
			if(count1 == 0) { //이걸 for 안의 for 안에 적어놨더니 미친듯이 복사되서 나오는거였음....
							//한 for문 밖으로 나오게 하니까 잘 된다.
					System.out.println("소수임 " + i);
					
				} 
		}
		
		
		
	}
}

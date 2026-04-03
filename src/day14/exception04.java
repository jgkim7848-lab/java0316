package day14;

public class exception04 {

	public static void main(String[] args) {
		// 멀티캐치 다중캐치 구문
		/*try{} catch{} catch{} catch{}.....
		 * 
		 * 예외를 세분화해서 구체적으로 잡고싶을때 >>> 멀티캐치
		 * 
		 * exception > 모든 예외의 최고 조상. 어떤 예외가 와도 다 캐치함.
		 * 
		 * 
		 * 
		 * */
		
		
		try {
			int arr[] = new int[3];
			System.out.println(arr[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어갔습니다.");
		} catch(NullPointerException e) {
			System.out.println("객체가 null입니다.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누었스빈다.");
		} catch(Exception e) {
			System.out.println("예외 발생.");
		}
		
		
		
		
	}

}

package day06;

import java.util.Arrays;

public class _04_Array06 {

	public static void main(String[] args) {
		// 

		String[] strArr = new String[5];
		

		strArr[0] = "홍길동";
		strArr[1] = "임꺽정";
		strArr[2] = "피카츄";
		strArr[3] = "아쿠스타";
		strArr[4] = "찌리리공";
		
		System.out.println(Arrays.toString(strArr));
		
		//배열은 크기가 고정되있다?
		//값이 5개를 만들었다고 5개가 다 차있으리란 법은 없는것.....
		//5칸 만들고 2칸만 채워도 되잖냐
		String[] arr = new String[5];
		arr[0] = "이도";
		
		for(String s:arr) {
			System.out.println(s);
		}
		
//반복적으로 배열에 데이터 넣으면 몇개 넣었는지 카운팅 해주면 좋다????
		
		
		System.out.println("===========================");
		
		
		//배열의 데이터를 늘리고싶다면?????
		//혹은 줄이고 싶다면???
		//  
		String arr2[] = new String[6];
		arr = arr2;
		
		/*
		 * //strArr의 5개짜리 데이터를 arr2로 이동시켜보자. for(int i = 0; i < strArr.length; i++) {
		 * arr2[i] = strArr[i]; }
		 * 
		 * 
		 * System.out.println(Arrays.toString(arr2));
		 * 
		 * 
		 * for(String s: arr2) { System.out.println(s); }
		 */
		
		System.out.println("============");
		
		System.out.println(Arrays.toString(arr2));
		strArr = arr2;
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		//배열복사 기능 와!
//arraycopy는 {구 배열, 시작번지(어디부터 옮길건지), 새로운배열, (시작번지의 어디서부터 받을건지), (몇개를 받을건지)}
		System.arraycopy(strArr, 0, arr2, 0, strArr.length);
		System.out.println(strArr);
		
		
		//배열은 한번 생성되면 공간을 줄이거나 늘일수 없으므로
		//새로운 배열을 생성하고 기존의 배열을 복사하는것으로 해야한다.
		
		
		strArr=arr2;  //이거 하면 새 배열로 배열주소가 연결됨과 동시에 기존 배열이 사라진다?????
		
		strArr[5] = "다부니";
		System.out.println(strArr);
		
		
	}

}

package day06;

import java.util.Arrays;

public class _05_ArrayCopy {

	public static void main(String[] args) {
		// 배열의 길이는 처음 생성할때부터 정해지고
		//그건 변할수없다.
		//배열의 길이를 조절해야할때 arrayCopy를 쓰게되는거지.
//System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 카피할개수)
//새 배열 = 이전배열;  주소를 넘겨서 관리를 시ㅣㅣㅣㅣㅣ벌.	
		
		int [] arr = {78, 48, 56, 69, 23};
		
		System.out.println(Arrays.toString(arr));
		
		//새 배열 생성후 기존 배열에 5개 추가.
		//데이터 복사후 주소 공유.
		//그리고 출력.
		int[] newarr = new int[10];
		System.arraycopy(arr, 0, newarr, 0, arr.length);
		
		arr = newarr;
		/*| 코드              | 결과                |
| --------------- | ----------------- |
| `newarr = arr;` | ❌ 복사 날림 (같은 배열 됨) |
| `arr = newarr;` | ✅ 큰 배열로 교체        |

5️⃣ 핵심 개념 정리
newarr = arr;
👉 새 배열 포기하고 기존 배열 공유
arr = newarr;
👉 기존 배열 버리고 새 배열로 갈아탐
		 * */
		
		System.out.println("newarr: " + Arrays.toString(newarr));
		
	}

	
}

package day05;

public class _03_Array3 {

	public static void main(String[] args) {
		// 
		int arr[] = {23,64,74,11,75,94,26,72,45,34,63};
		//배열 합계랑 평균 구하기.
		int all = 0;
		double avg = 0;
		for(int i = 0; i < arr.length; i++) {
			all = all + arr[i];
		}
		avg = (double)all / (double)arr.length;
		
		System.out.println("합계: " + all + "\n평균: " + avg);
		
		int biggest = 0;
		for(int a = 0; a < arr.length; a++) {

			if(biggest < arr[a]) {
				biggest = arr[a];
			} else {
				continue;
			}
		}
		
		int smallest = arr[0];
		for(int a = 1; a < arr.length; a++) {

			if(smallest > arr[a]) {
				smallest = arr[a];
			} else {
				continue;
			}
		}
		
		System.out.println("최대값: " + biggest);
		System.out.println("최소값: " + smallest);
		
		int max = 0;
		int min = 100;
		for(int i = 0; i <arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}

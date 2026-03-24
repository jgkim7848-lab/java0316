package day07;
	/*
		 * 시작전에....split에 "" 하면 한글자씩 잘라서 배열로 리턴한다??? 숫자로 변환
		 */
public class _01_MultyArray01 {

	public static void main(String[] args) {
	
		//다차원 배열
		//배열 타입[] 배열명   - 1차원.
		//배열타입[행][열] 배열명 - 2차원{ {1 2 3}, {1 2 3} }
		//배열타입 [면] [행] [열] 배열명 - 3차원 배열 {{}, {}, {}}
		//int[] [] arr = new int[2] [3] 2줄이고 1줄에 3칸따리 있음.
		
	//배열의 길이 1차원일때는 그냥 .length 하면 되지만 
		//2차원 배열일때는 arr[i].length로 해야됨. 
		
		int[][] arr = {
	{1,2,3},
	{1,2,3}
	};
		
	
	
		int count = 10;
		 System.out.println(arr[0][0]);
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length; j++){
				 //System.out.println(arr[i][j]);
				 arr[i][j] = count;
				 count++;
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 
	
	}

}

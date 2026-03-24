package day07;

public class _02_MultyArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열 1 2 3으로 해서 13 14 15까지
		
		int[][] arr = new int[5][3];
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				System.out.print(arr[i][j]);
				count++;
			}
			System.out.println();
		}
	}

}

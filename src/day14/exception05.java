package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception05 {

	public static void main(String[] args) {
		// io 익셉션 발생 예제.
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String name = "";
		try { //보통은 이렇게 해야됨. 안하면 못씀.
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//exception를 미루는데 반드시 처리해야되는게 있고 안해도 되는게 있다.
		//checked exception과 unchecked exception의 차이.
		
		
	}

}

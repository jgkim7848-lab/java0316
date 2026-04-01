package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		StudentController sc = new StudentController();
		
		
		
		
		
		//샘플데이터 호출할 위치 (do while에 하면 문제가 생긴다 근데 무슨 문제라캤지...
		int menu = 0;
		sc.addStudent();//이거 적으셨네잉.
		sc.addSubject();
		do {
			System.out.println("--선택--");
			System.out.println("1. 학생등록|2. 학생리스트|3. 학생조회");
			System.out.println("4. 수강신청|5. 수강철회|6. 종료");
			System.out.println("선택>> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sc.insertStudent(scan); break;
			case 2: sc.printStudentList(); break;
			case 3: sc.searchStudent(scan);break;
			case 4: sc.insertSubject(scan); break;
			case 5: sc.deleteSubject(scan); break;
			case 6: System.out.println("종료");break;
			default: System.out.println("잘못된 숫자 입력");
			}
		}while(menu!=6);
		
		
		scan.close();
	}

}

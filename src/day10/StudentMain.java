package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//학생정보 관리 클래스
		//내가 학생인데 등록하려고하는디
		//이름 전화번호, 주소 생년월일
		Scanner scan = new Scanner(System.in);
		System.out.print("몇명의 정보를 입력할지 입력해주세요.\n>> ");
		int count = scan.nextInt();
		
		
		String[] gigum = {"강남", "종로", "인천", "노원"};
		String[] subjectName = {"java", "DB", "웹개발", "자바스크립트"};
		String[] subjectDate = {"2026-01-10~2026-02-28", "2026-03-10~2026-04-28", "2026-05-10~2026-05-28"};
		
		
		
		Student[] student = new Student[count];
		
		for(int i = 0; i < count; i++) {
			System.out.print("이름>> ");
			String name = scan.next();
			System.out.print("전화번호>> ");
			String phone = scan.next();
			System.out.print("주소>> ");
			String address = scan.next();
			System.out.print("생년월일>> ");
			String birth = scan.next();
			
			Student s = new Student(name, phone, address, birth);
			student[i] = s;
			
		}
		
		
		
		for(Student s : student) {
			s.print();
		}
		
	}

}

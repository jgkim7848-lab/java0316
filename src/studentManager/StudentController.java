package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {
	
    private Student[] students = new Student[100];
    private int count = 0;
    
    private Subject[] subjects = new Subject[100];
    private int subCount = 0;
    
    //초기 학생
    public void addStudent() {
        students[count++] = new Student("1001", "홍길동", 20, "010", "서울");
        students[count++] = new Student("1002", "김철수", 21, "012", "부산");
        students[count++] = new Student("1034", "박남가", 45, "312", "충주");
        students[count++] = new Student("1562", "연청화", 67, "412", "강릉");
        students[count++] = new Student("1396", "ㄱ", 52, "896", "신안");
        
    }

    //초기 과목
    public void addSubject() {
        subjects[subCount++] = new Subject("1234", "자바", "9시", "임교수","A강의실");
        subjects[subCount++] = new Subject("5768", "데이터베이스", "10시", "김교수","B강의실");
        subjects[subCount++] = new Subject("1357", "웹", "13시", "박교수","C강의실");
        subjects[subCount++] = new Subject("0987", "서버", "22시", "이교수","D강의실");
        subjects[subCount++] = new Subject("9764", "통신", "17시", "남교수","E강의실");
        subjects[subCount++] = new Subject("6473", "C++", "14시", "황교수","F강의실");
        subjects[subCount++] = new Subject("8625", "파이썬", "11시", "곽교수","G강의실");
        subjects[subCount++] = new Subject("2451", "자바스크립트", "16시", "리교수","H강의실");
    }

    @Override
    public void insertStudent(Scanner scan) {
        System.out.print("학번>");
        String id = scan.next();

        System.out.print("이름>");
        String name = scan.next();

        System.out.print("나이>");
        int age = scan.nextInt();

        System.out.print("전화번호>");
        String phone = scan.next();

        System.out.print("주소>");
        String address = scan.next();

        students[count++] = new Student(id, name, age, phone, address);
    }

    @Override
    public void printStudentList() {
        for(int i=0; i<count; i++) {
            students[i].print();
        }
    }

    @Override
    public void searchStudent(Scanner scan) {
        System.out.print("이름>");
        String name = scan.next();

        for(int i=0; i<count; i++) {
            if(students[i].getName().equals(name)) {
                students[i].print();
                return;
            }
        }
        System.out.println("없음");
    }

    @Override
    public void insertSubject(Scanner scan) {
        System.out.print("학생 이름>");
        String name = scan.next();

        System.out.println("수강신청 옵션. \n1기존 과목 수강신청, 2신규추가 수강신청");
        int a = scan.nextInt();

        if(a == 1) {
            for(int i=0; i<count; i++) {
                if(students[i].getName().equals(name)) {
                	
                    System.out.println("수강 가능 과목:");
                    for(int j=0; j<subCount; j++) {
                        System.out.println(subjects[j].getS_name());
                    }
                    
                    System.out.print("과목명>");
                    String subName = scan.next();
                    
                    for(int j=0; j<subCount; j++) {
                        if(subjects[j].getS_name().equals(subName)) {
                            students[i].addSubject(subjects[j]);
                            System.out.println("신청 완료");
                            return;
                        }
                    }

                    System.out.println("과목 없음");
                    return;
                }
            }
            System.out.println("학생 없음");

        } else if(a == 2) {

            System.out.print("과목코드>");
            String s_code = scan.next();

            System.out.print("과목명>");
            String s_name = scan.next();

            System.out.print("과목시간>");
            String s_time = scan.next();

            System.out.print("교수명>");
            String s_teacher = scan.next();

            System.out.print("교육장소>");
            String s_place = scan.next();

            for(int i=0; i<count; i++) {
                if(students[i].getName().equals(name)) {

                    //1. 배열 꽉 찼으면 늘리기 (핵심)
                    if(subCount == subjects.length) {
                        Subject[] newArr = new Subject[subjects.length + 3];
                        System.arraycopy(subjects, 0, newArr, 0, subjects.length);
                        subjects = newArr;
                    }

                    Subject newSub = new Subject(s_code, s_name, s_time, s_teacher, s_place);

                    subjects[subCount++] = newSub;   // 전체 과목
                    students[i].addSubject(newSub);  // 개인 수강

                    System.out.println("신규 과목 + 수강신청 완료");
                    return;
                }
            }
            System.out.println("학생 없음");

        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
    
    @Override
    public void deleteSubject(Scanner scan) {
        System.out.print("학생 이름>");
        String name = scan.next();
        
        for(int i=0; i<count; i++) {
            if(students[i].getName().equals(name)) {
            	
                System.out.print("삭제할 과목명>");
                String subName = scan.next();
                
                students[i].removeSubject(subName);
                return;
            }
        }
        System.out.println("학생 없음");
    }
}
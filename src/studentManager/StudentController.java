package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {
	
	// 학생 배열을 생성 
	private Student[] student = new Student[5]; 
	private int cnt;
	
	// 수강 신청을 위한 과목 목록 배열 : 수강 신청이 가능한 모든 과목 목록
	private Subject[] subList = new Subject[5];
	
//	public StudentController() {  // 생성자에서 객체를 생성
//		student = new Student[5];
//	}
	
	
	// 학생 미리 등록
	public void addStudent() {
		// TODO Auto-generated method stub
		student[cnt] = new Student("1", "이순신", 21, "010-1111-1111", "서울시");
		cnt++;
		student[cnt] = new Student("2", "박철수", 20, "010-1111-1111", "부산시");
		cnt++;
		student[cnt] = new Student("3", "이순이", 20, "010-1111-1111", "광주시");
		cnt++;
		
	}
	
	// 수강과목 미리 등록
	public void addSubject() {
		// (String subjectCode, String subjectName, String subjectTime, String subjectProfessor,
		//String subjectRoom)
		subList[0] = new Subject("111", "C언어", "3", "홍길동", "A강의장");
		subList[1] = new Subject("222", "JAVA", "2", "김길동", "B강의장");
		subList[2] = new Subject("333", "javaScript", "3", "최길동", "C강의장");
		subList[3] = new Subject("444", "python", "2", "홍길동", "D강의장");
		subList[4] = new Subject("555", "react", "3", "박길동", "E강의장");
	}
	
	public String studentNumInput(Scanner scan) {
		System.out.println("학번>");
		return scan.next();
	}
	
	// 학번을 스케너에서 받아 학생 배열에서 해당 학번의 번지를 리턴해주는 메서드
	public int indexSearch(String num) {
		
		for(int i=0; i<cnt; i++) {
			if(student[i].getStudentNumber().equals(num)) {
				return i;
			}
		}
		return -1;
	}
	

	// 수강 신청시 신청가능한 목록을 출력하는 메서드
	public void printSubList() {
		int i=1;
		System.out.println("--수강신청목록--");
		for(Subject s : subList) {
			System.out.print(i+".");
			s.printSubject();
			i++;
		}
		System.out.println("----------------");	
	}

	@Override
	public void insertStudent(Scanner scan) {
		// indexSearch 메서드 사용 후
		// 학번 중복불가 처리
		String num = studentNumInput(scan);
		
		if(indexSearch(num) != -1) {
			System.out.println("학번이 중복됩니다.");
			return;
		}
		
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("전화번호>");
		String phone = scan.next();
		// 전화번호에서 입력 후 enter가 스캐너 버퍼에 남아있음. 
		scan.nextLine(); // 버퍼에 남아있는 공백을 버림.
		
		System.out.println("주소>");
		 // 한단어로 입력받기 힘들때	
		String address = scan.nextLine(); // 공백 포함 (enter 포함)
		
		// 학생 객체 생성
		Student s = new Student(num, name, age, phone, address);
		student[cnt] = s;
		cnt++;
	}


	@Override
	public void printStudentList() {
		// 전체 학생 목록 출력 (수강정보X)
		System.out.println("-- 학생명단 출력 --");
		// 학생 명단이 배열에 다 차있지 않다면 향상된 for문은 못 씀.
		for(int i=0; i<cnt; i++) {
			student[i].printInfo(); // 출력 메서드가 있을 경우
//			System.out.println(student[i]); // toString
		}
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생 검색 (학생정보 + 수강정보)
		// 학생의 학번을 입력받아 그 학생의 정보를 출력
		System.out.println("검색할 학생의 학번을 입력>");
		String num = scan.next();
		
		int index = indexSearch(num);
		
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		student[index].printInfo();
		student[index].printSubjectList();
	}

	@Override
	public void insertSubject(Scanner scan) {
		// 수강 신청은 개인별로 한다.
		// 수강신청할 학생의 학번을 입력받아 수강과목 리스트를 출력
		// 수강할 과목 선택 후 => 
		// 해당 과목의 객체를 Student 클래스의 insertSubject로 전달
		System.out.println("학번>");
		String num = scan.next();
		int index = indexSearch(num);
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		printSubList(); // 과목목록 출력 메서드 호출
		System.out.println("수강과목 선택(번호로 선택)>");
		int subIndex = scan.nextInt(); 
		// 번지 = subList[subIndex-1];
		if(subIndex <= 0 || subIndex > subList.length) {
			System.out.println("없는과목입니다.");
			return;
		}
				
		// subList[subIndex-1]; => 선택한 과목 객체
		// 학생 클래스에서 과목추가 메서드를 호출
		student[index].insertSubject(subList[subIndex-1]);
		return;

	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회도 개인별로 한다.
		// 철회할 학번을 입력받아 해당 과목이 있는지 체크
		// 과목 번호를 받아 해당 객체를 Student => deleteSubject() 전달
		System.out.println("학번>");
		String num = scan.next();
		
		int index = indexSearch(num);
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}
		
		// 내가 신청한 수강신청 리스트를 출력
		System.out.println("-- 내수강과목 --");
		student[index].printSubjectList();
		System.out.println("철회할 과목코드 (번호로 입력)>");
		int subNum = scan.nextInt();
		
		// 수강과목 print 할 때 번호를 붙여 출력한 경우
		Subject s = student[index].getSubjectList()[subNum-1];
		student[index].deleteSubject(s);
				
	}

}
//import java.util.Scanner;
//
//public class StudentController implements StudentProgram {
//	
//    private Student[] students = new Student[100];
//    private int count = 0;
//    
//    private Subject[] subjects = new Subject[100];
//    private int subCount = 0;
//    
//    //초기 학생
//    public void addStudent() {
//        students[count++] = new Student("1001", "홍길동", 20, "010", "서울");
//        students[count++] = new Student("1002", "김철수", 21, "012", "부산");
//        students[count++] = new Student("1034", "박남가", 45, "312", "충주");
//        students[count++] = new Student("1562", "연청화", 67, "412", "강릉");
//        students[count++] = new Student("1396", "ㄱ", 52, "896", "신안");
//        
//    }
//
//    //초기 과목
//    public void addSubject() {
//        subjects[subCount++] = new Subject("1234", "자바", "9시", "임교수","A강의실");
//        subjects[subCount++] = new Subject("5768", "데이터베이스", "10시", "김교수","B강의실");
//        subjects[subCount++] = new Subject("1357", "웹", "13시", "박교수","C강의실");
//        subjects[subCount++] = new Subject("0987", "서버", "22시", "이교수","D강의실");
//        subjects[subCount++] = new Subject("9764", "통신", "17시", "남교수","E강의실");
//        subjects[subCount++] = new Subject("6473", "C++", "14시", "황교수","F강의실");
//        subjects[subCount++] = new Subject("8625", "파이썬", "11시", "곽교수","G강의실");
//        subjects[subCount++] = new Subject("2451", "자바스크립트", "16시", "리교수","H강의실");
//    }
//    
//    //------------------------------------------
//    //학번을 입력받아 그것이 존재하는지 여부 판독.
//    //학번이 입력된 학생이 행동을 하기 위해....그 학생 객체를 봐야하니까
//    //내가 필요로 하는 정보는? 내가 배열에서 특정 학생을 찾는 이유는?
//    //정확힌 해당 학번의 번지가 필요.
//    //그러므로 해당 학번의 번지를 리턴해주는 메서드를 만들거임.
//    //스캐너도 넣어서, 학번을 받아서, 존재 여부를 봐서, 번지를 리턴해주는 메서드
//    public String studentNumInput(Scanner scan) {
//    	System.out.println("학번> ");
//    	return scan.next();
//    }
//    
//    
//    
//    public int indexSearch(String num) {
//    	
//    	
//    	for(int i = 0; i < count; i++) {
//    		if(students[i].getId().equals(num)) {
//    			return i;
//    		}
//    	}
//		return -1;
//    }
//    
//    
//    //-----------------------------------------
//
//    @Override
//    public void insertStudent(Scanner scan) {
//    	//-------------------------
//    	//위에 indexSearch랑 관련 있음
////    	int index = indexSearch(scan);
////    	if(index != -1) {
////    		System.out.println("학번 중복");
////    		return;
////    	}
//    	//-----------------------
//        System.out.print("학번>");
//        String id = scan.next();
//
//        System.out.print("이름>");
//        String name = scan.next();
//
//        System.out.print("나이>");
//        int age = scan.nextInt();
//
//        System.out.print("전화번호>");
//        String phone = scan.next();
//
//        System.out.print("주소>");
//        String address = scan.next();
//
//        students[count++] = new Student(id, name, age, phone, address);
//    }
//
//    @Override
//    public void printStudentList() {
//        for(int i=0; i<count; i++) {
//            students[i].print();
//        }
//    }
//
//    @Override
//    public void searchStudent(Scanner scan) {
//        System.out.print("이름>");
//        String name = scan.next();
//
//        for(int i=0; i<count; i++) {
//            if(students[i].getName().equals(name)) {
//                students[i].print();
//                return;
//            }
//        }
//        System.out.println("없음");
//    }
//
//    @Override
//    public void insertSubject(Scanner scan) {
//        System.out.print("학생 이름>");
//        String name = scan.next();
//
//        System.out.println("수강신청 옵션. \n1기존 과목 수강신청, 2신규추가 수강신청");
//        int a = scan.nextInt();
//
//        if(a == 1) {
//            for(int i=0; i<count; i++) {
//                if(students[i].getName().equals(name)) {
//                	
//                    System.out.println("수강 가능 과목:");
//                    for(int j=0; j<subCount; j++) {
//                        System.out.println(subjects[j].getS_name());
//                    }
//                    
//                    System.out.print("과목명>");
//                    String subName = scan.next();
//                    
//                    for(int j=0; j<subCount; j++) {
//                        if(subjects[j].getS_name().equals(subName)) {
//                            students[i].addSubject(subjects[j]);
//                            System.out.println("신청 완료");
//                            return;
//                        }
//                    }
//
//                    System.out.println("과목 없음");
//                    return;
//                }
//            }
//            System.out.println("학생 없음");
//
//        } else if(a == 2) {
//
//            System.out.print("과목코드>");
//            String s_code = scan.next();
//
//            System.out.print("과목명>");
//            String s_name = scan.next();
//
//            System.out.print("과목시간>");
//            String s_time = scan.next();
//
//            System.out.print("교수명>");
//            String s_teacher = scan.next();
//
//            System.out.print("교육장소>");
//            String s_place = scan.next();
//
//            for(int i=0; i<count; i++) {
//                if(students[i].getName().equals(name)) {
//
//                    //1. 배열 꽉 찼으면 늘리기 (핵심) + 마지막 번지의 null처리.(이건 안한거같은데 ㅅㅂ)
//                    if(subCount == subjects.length) {
//                        Subject[] newArr = new Subject[subjects.length + 3];
//                        System.arraycopy(subjects, 0, newArr, 0, subjects.length);
//                        subjects = newArr;
//                    }
//
//                    Subject newSub = new Subject(s_code, s_name, s_time, s_teacher, s_place);
//
//                    subjects[subCount++] = newSub;   // 전체 과목
//                    students[i].addSubject(newSub);  // 개인 수강
//
//                    System.out.println("신규 과목 + 수강신청 완료");
//                    return;
//                }
//            }
//            System.out.println("학생 없음");
//
//        } else {
//            System.out.println("잘못된 입력입니다.");
//        }
//    }
//    
//    @Override
//    public void deleteSubject(Scanner scan) {
//    	//개인별로 수강 철회.
//    	//철회할 과목 번호를 입력받아 해당 과목 존재 여부 체크.
//    	//과목 번호를 받아 해당 객체를 Student => deleteSubject()로 전달
//    	//
//        System.out.print("학생 이름>");
//        String name = scan.next();
//        
//        for(int i=0; i<count; i++) {
//            if(students[i].getName().equals(name)) {
//            	
//                System.out.print("삭제할 과목명>");
//                String subName = scan.next();
//                
//                students[i].removeSubject(subName);
//                return;
//            } //코드만 맞으면 같은 객체로 치겠다는건 굉장히 많이 사용됨.
//            //키만 맞으면 된다.
//            //이 객체에서 다른 내용을 볼거같으면 채워야하지만 이건 그럴 필요가 없으니까
//            
//        }
//        System.out.println("학생 없음");
//    }
//}
////차라리 학번을 줘서 해당 학번의 존재 여부 리턴 메서드를 만든다면???
//// >>> 여기저기서 쓰는데 안만들 이유가 업ㅇㅅ다???




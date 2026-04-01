package studentManager;

public class Subject {
	// 과목정보 클래스  => 과목 1개
	// 과목정보 : 과목코드, 과목명, 시수, 강사명, 강의장
	// 멤버변수 -> 생성자 -> getter/setter -> toString
	
	private String subjectCode;
	private String subjectName;
	private String subjectTime;
	private String subjectProfessor;
	private String subjectRoom;
	
	public Subject() {}

	public Subject(String subjectCode, String subjectName, String subjectTime, String subjectProfessor,
			String subjectRoom) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = subjectTime;
		this.subjectProfessor = subjectProfessor;
		this.subjectRoom = subjectRoom;
	}
	
	public Subject(String subjectCode, String subjectName) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = "3";
		this.subjectProfessor = "홍길동";
		this.subjectRoom = "A강의장";
	}
	
	// 출력 메서드
	public void printSubject() {
		System.out.println(subjectName+"("+subjectCode+")"+"/"+subjectRoom);
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getSubjectProfessor() {
		return subjectProfessor;
	}

	public void setSubjectProfessor(String subjectProfessor) {
		this.subjectProfessor = subjectProfessor;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectTime=" + subjectTime
				+ ", subjectProfessor=" + subjectProfessor + ", subjectRoom=" + subjectRoom + "]";
	}
	
}
//public class Subject {
//	//과목 정보 클래스 > 과목1개, 과목정보: 코드 이름 시수 강사명 강의장
//	//멤버변수 > 생성자 > getter/setter > toStirng 순으로 만드는편
//    private String s_code;
//    private String s_name;
//    private String s_time;
//    private String s_teacher;
//    private String s_place;
//    //=========================================================
//    
//    //없던것
//    public Subject() {}
//    
//    
//    
//    public String getS_code() {
//		return s_code;
//	}
//
//	public void setS_code(String s_code) {
//		this.s_code = s_code;
//	}
//
//	public String getS_name() {
//		return s_name;
//	}
//
//	public void setS_name(String s_name) {
//		this.s_name = s_name;
//	}
//
//	public String getS_time() {
//		return s_time;
//	}
//
//	public void setS_time(String s_time) {
//		this.s_time = s_time;
//	}
//
//	public String getS_teacher() {
//		return s_teacher;
//	}
//
//	public void setS_teacher(String s_teacher) {
//		this.s_teacher = s_teacher;
//	}
//
//	public String getS_place() {
//		return s_place;
//	}
//
//	public void setS_place(String s_place) {
//		this.s_place = s_place;
//	}
////============================================================
//	public Subject(String s_code, String s_name) {
//        this.s_code = s_code;
//        this.s_name = s_name;
//    }
//
//	//이거랑 위에 빈거 2개는 필수로 만들어주면 좋다 (다 찬거랑 텅빈거 2개)
//    public Subject(String s_code, String s_name, String s_time, String s_teacher, String s_place) {
//        this.s_code = s_code;
//        this.s_name = s_name;
//        this.s_time = s_time;
//        this.s_teacher = s_teacher;
//        this.s_place = s_place;
//    }
//    
//    
//    //출력메서드
//    public void printSubject() {
//    	System.out.println(s_name);
//    }
//    
//
//    @Override
//	public String toString() {
//		return "Subject [s_code=" + s_code + ", s_name=" + s_name + ", s_time=" + s_time + ", s_teacher=" + s_teacher
//				+ ", s_place=" + s_place + "]";
//	}
//
//
//
//	public void printSubjectInfo() {
//        System.out.println("과목 코드: " + s_code);
//        System.out.println("과목명: " + s_name);
//        System.out.println("몇시수업: " + s_time);
//        System.out.println("강사명: " + s_teacher);
//        System.out.println("강의장: " + s_place);
//    }
//}
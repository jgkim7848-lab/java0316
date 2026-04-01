package studentManager;

import java.util.Arrays;

public class Student {
	// 학생정보 클래스 => 학생 1명
	// 학번, 이름, 나이, 전화번호, 주소, 수강과목[5]
	// 멤버변수에 배열이 존재하면 index 역할을 하는 변수가 필요
	private String studentNumber;
	private String studentName;
	private int studentAge;
	private String studentPhone;
	private String studentAddress;
	// 학생 1명당 본인이 수강신청한 과목의 목록
	private Subject[] subjectList = new Subject[5];
	private int cnt; // index
	
	// 생성자
	public Student() {}

	public Student(String studentNumber, String studentName, int studentAge, String studentPhone,
			String studentAddress) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
	}
	
	public Student(String studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = 20;
		this.studentPhone = "010-1111-1111";
		this.studentAddress = "서울시";
	}
	
	// 수강과목이 존재하는지 확인하는 메서드
	public boolean nullCheck(Subject sub) {
		if(sub == null) {
			return false;
		}
		if(sub.getSubjectCode().isBlank()) {
			System.out.println("수강정보가 없습니다.");
			return false;
		}
		return true;
	}
	
	// 수강과목 객체가 들어오면 내 수강배열에 추가
	// 1. 해당 배열에 이미 동일과목이 있는경우 => 이미 추가한 과목입니다.
	// 2. 배열이 꽉 찼을 경우 => 새배열을 만들어 배열복사 => 배열주소 변경
	
	public void insertSubject(Subject sub) {
		// nullCheck 메서드로 분리
		if(!nullCheck(sub)) {
			return;
		}
		
//		if(sub == null) {
//			return;
//		}
//		if(sub.getSubjectCode().isBlank()) {
//			System.out.println("수강정보가 없습니다.");
//			return;
//		}
		
		// 배열이 꽉 찼을 경우
		if(cnt == subjectList.length) {
			// 배열 늘려주기
			Subject[] tmp = new Subject[subjectList.length+3];
			// 배열복사
			System.arraycopy(subjectList, 0, tmp, 0, subjectList.length);
			// 기존 배열을 늘려준 배열로 변경
			subjectList = tmp;
		}
		
		// 이미 수강신청을 한 과목일 경우
		// cnt 까지 배열을 순회 하여 subjectCode가 일치하는 값이 있다면...
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubjectCode().equals(sub.getSubjectCode())) {
				System.out.println("이미 추가한 과목입니다.");
				return;
			}
		}
		
		subjectList[cnt] = sub;
		cnt++;
		System.out.println("수강신청 완료!!");
	}
	
	// 수강과목 객체가 들어오면 내 수강배열에서 삭제
	public void deleteSubject(Subject sub) {
		// subjectList에서 sub가 몇번지에 있는지 찾기
		int index = -1; //없는 번지 설정
		
		// nullCheck 메서드로 분리
		if(!nullCheck(sub)) {
			return;
		}
		
		// 배열에서 번지를 찾기
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubjectCode().equals(sub.getSubjectCode())) {
				index = i;
				break; // 번지를 찾았다면 반복문을 벗어나기.
			}
		}
		
		// index 번지 확인 => index = -1 
		if(index == -1) {
			// 찾는 값이 없다면...
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		
		// index를 찾았다면...
		// 삭제 : index 번지부터 cnt-1까지 뒷번지(i+1)를 앞으로 옮기는 작업.
		// 마지막 번지는 null 처리
		for(int i=index; i<cnt-1; i++) {
			subjectList[i] = subjectList[i+1];
		}
		
		// 마지막 번지는 null 처리
		subjectList[cnt-1] = null;
		cnt--; 
		System.out.println("수강철회 완료!!");
	}
	
	
	
	// 출력 메서드
	// 개인정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(studentName+"("+studentNumber+") / "+studentAge);
		System.out.println(studentPhone+" / "+ studentAddress);
	}
	
	// 수강정보 확인 후 있으면 출력하는 메서드
	public void printSubjectList() {
		if(cnt == 0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for(int i=0; i<cnt; i++) {
            System.out.print(i+1+". ");
			subjectList[i].printSubject();
			// System.out.println(subjectList[i]); // toString
		}
		System.out.println("---------------");
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentPhone=" + studentPhone + ", studentAddress=" + studentAddress + ", subjectList="
				+ Arrays.toString(subjectList) + ", cnt=" + cnt + "]";
	}
	
}
//public class Student {
//	//학생정보 클래스 > 학생 1명
//	//학번이름나이전번주소 수강과목[5]
//	//멤버변수에 배열 존재시 index역할의 변수 필요.
//    private String id;
//    private String name;
//    private int age;
//    private String phone;
//    private String address;
//
//    private Subject[] subjects = new Subject[2]; //학생 1명당 본인이 수강신청한 과목의 목록
//    private int subCount = 0;
//
//    public Student(String id, String name, int age, String phone, String address) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.address = address;
//    }
//    
//    //전체 다 차있는거 비워져있는거 만들기 // 차있는건 위에 있네.===========
//    public Student() {}
//    
//    
//    //출력메서드//개인정보출력 수강정보 확인후 있으면 출력하는 메서드
//    public void printInfo() {
//    	System.out.println(name + " " + id +" " + " " + age + " " + phone + " " + age);
//    }
//    //여기서 수강정보 확인후 있으면 출력하는 메서드 개조형이 나오네 시발 뭐지
//    public void printSubjectList() {
//    	if(subCount == 0) {
//    		System.out.println("수강과목 없음");
//    		return;
//    	}
//    	for(int i = 0; i < subCount; i++) {
//    		subjects[i].printSubjectInfo();
//    	} // 아 시발 자꾸 빨간색 나오고 뭐가 뭔지 헷갈린다 복습할때 제대로 하자잉
//    	
//    }
//    
//    //보아하니 여기서 구현해야 했던걸 싹다 StudentController에 구현한듯
//    //수강삭제랑 수강신청 싹다 거기에 있음ㅋㅋㅋㅋㅋㅋ
//    
//    
//    //-----------------------------------------=================
//
//	public String getName() {
//        return name;
//    }
//
//	
//	
//	
//	
//    public void addSubject(Subject sub) {
//
//        //배열 꽉 찼을 때 늘리기
//        if(subCount == subjects.length) {
//            Subject[] newArr = new Subject[subjects.length + 2];
//            System.arraycopy(subjects, 0, newArr, 0, subjects.length);
//            subjects = newArr;
//        }
//
//        subjects[subCount++] = sub;
//    }
//
//    //수강 삭제
//    public void removeSubject(String subName) {
//        for(int i=0; i<subCount; i++) {
//            if(subjects[i].getS_name().equals(subName)) {
//                //앞으로땡기기
//                for(int j=i; j<subCount-1; j++) {
//                    subjects[j] = subjects[j+1];
//                }https://cafe.naver.com/f-e/cafes/29767745/articles/1395?boardtype=L&menuid=25&referrerAllArticles=false
//                subjects[subCount-1] = null;
//                subCount--;
//                System.out.println("삭제 완료");
//                return;
//            }//https://cafe.naver.com/f-e/cafes/29767745/articles/1395?menuid=24&referrerAllArticles=false
//        }
//        System.out.println("해당 과목 없음");
//    }
//
//    public void print() {
//        System.out.println(id + " " + name + " " + age);
//
//        for(int i=0; i<subCount; i++) {
//        	System.out.println("==="+(i+1) + "번째 과목 정보===");
//            subjects[i].printSubjectInfo();
//        }
//    }
//    
//    
//    //=========================================
//    
//    
//    
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//    
//    
//    
//}
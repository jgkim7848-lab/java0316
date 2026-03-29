package day10;

import java.util.Scanner;

public class Student {
	private String name;
	private String phone;
	private String address;
	private String birth;
	
	


	//===============================================
	//이걸로 해보고자 하는건 데이터를 많이 넣어놓고 조회를 하는것.
	private final String COMPANY; //학원이름//final 넣으면 setter이 안됨.
	//그냥 영원히 이 값으로 고정됨. ex 회사명 브랜드 로고.
	//대체로 final 붙으면 모조리다 대문자로 적는편임.
	private String branch; //장소
	private String[] course; //수강과목
	private String[] period; //수강기간
	//한번 지정하면 변하지않을 정보를 의미함. = 상수 = final
	
	//멤버변수에 배열이 존재한다면 index변수 사용이 편리함.
	private int cnt;
	
	
	
	
	
	
	
	
	
	//java 2026-01-10~2026-02-28
	//web 2026-03-10~2026-04-28
	//DB 2026-05-10~2026-05-28
	

	public String getAcademy() {
		String academy = "KOREAIT";
		return academy;
	}

	public String getPlace() {
		String place = "강남";
		return place;
	}

	public void setPlace(String place) {
		this.branch = place;
	}

	public String[] getSubject() {
		return course;
	}

	public void setSubject(String[] subject) {
		this.course = subject;
	}

	public String[] getTime() {
		return period;
	}

	public void setTime(String[] time) {
		this.period = time;
	}
	//================================================
	
	//학원정보
	public void printCompany() {
		System.out.println(COMPANY + " " + branch);
	}
	
	public Student() {
		
	}
	
	public Student(String name,String phone,String street,String birth) {
		this.name = name;
		this.phone = phone;
		this.address = street;
		this.birth = birth;
		
	}
	
	
	public void print() {
	    if(phone.length() == 11) {
	        System.out.println(name + "\t" +
	            phone.substring(0,3) + "-" +
	            phone.substring(3,7) + "-" +
	            phone.substring(7) + "\t" +
		        address + "\t" + birth);
	    } else {
	        System.out.println("전화번호 형식 오류");
	    }
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStreet() {
		return address;
	}
	public void setStreet(String street) {
		this.address = street;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}

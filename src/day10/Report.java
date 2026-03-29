package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Report {
	
	//이거 report는한 사람의 성적표를 의미함.
	//막말로 내 성적은 알지만 남의 성적은 몰라서 등수를 여기선 알순 없다는거임.
	
	//멤버변수: 이름 국어 영어 수학 합계 평균 등수
	private String name;
	private double kor;
	private double eng;
	private double math;
	private double all;
	private double avg;
	private double rank;
	
	/*
	 * public int head;
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * 
	 * public Report() { this.name = null; this.kor = 0; this.eng = 0; this.math =
	 * 0; this.all = 0; this.avg = 0; this.rank = 1;
	 * 
	 * }
	 * 
	 * public void input() { this.name = scan.nextLine(); this.kor =
	 * scan.nextDouble(); this.eng = scan.nextDouble(); this.math =
	 * scan.nextDouble();
	 * 
	 * this.all = this.kor + this.eng + this.math; this.avg = this.all / 3; }
	 * 
	 * 
	 * // public void STD() { // 몇명 입력할건지 물어보기. // head = scan.nextInt(); // }
	 * 
	 * 
	 * public void print() { System.out.println(name+ "\t"+ kor + "\t" + eng + "\t"
	 * + math + "\t" + all + "\t" + avg + "\t" + "등수"); }//평균은 소수점 2자리 이렇게 맞추고시픈데 잘
	 * 안된다며어어언 //decimalformat이라는 클래스를 통해서 생성자로 넣고자하는 포맷팅을 만들면 된도르?? //
	 * 
	 */  //> 내가 하던거.


	public Report() {
		
	}
	
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total();
	}
	//합계 평균 계산 메서드
	public void total() {
		this.all = kor + eng + math;
		this.avg = all / (double)3;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.00");
		return name+ "\t"+ kor + "\t" + eng + "\t" + math + "\t" + all + "\t" + df.format(avg) + "\t" + rank;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getAll() {
		return all;
	}
	public void setAll(double all) {
		this.all = all;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getRank() {
		return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
	}
	
	
	
}

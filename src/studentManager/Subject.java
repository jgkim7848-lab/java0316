package studentManager;


public class Subject {
    private String s_code;
    private String s_name;
    private String s_time;
    private String s_teacher;
    private String s_place;
    //=========================================================
    public String getS_code() {
		return s_code;
	}

	public void setS_code(String s_code) {
		this.s_code = s_code;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_time() {
		return s_time;
	}

	public void setS_time(String s_time) {
		this.s_time = s_time;
	}

	public String getS_teacher() {
		return s_teacher;
	}

	public void setS_teacher(String s_teacher) {
		this.s_teacher = s_teacher;
	}

	public String getS_place() {
		return s_place;
	}

	public void setS_place(String s_place) {
		this.s_place = s_place;
	}
//============================================================
	public Subject(String s_code, String s_name) {
        this.s_code = s_code;
        this.s_name = s_name;
    }

    public Subject(String s_code, String s_name, String s_time, String s_teacher, String s_place) {
        this.s_code = s_code;
        this.s_name = s_name;
        this.s_time = s_time;
        this.s_teacher = s_teacher;
        this.s_place = s_place;
    }

    public void printSubjectInfo() {
        System.out.println("과목 코드: " + s_code);
        System.out.println("과목명: " + s_name);
        System.out.println("몇시수업: " + s_time);
        System.out.println("강사명: " + s_teacher);
        System.out.println("강의장: " + s_place);
    }
}
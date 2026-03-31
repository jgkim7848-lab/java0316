package studentManager;

public class Student {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String address;

    private Subject[] subjects = new Subject[2];
    private int subCount = 0;

    public Student(String id, String name, int age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject sub) {

        //배열 꽉 찼을 때 늘리기
        if(subCount == subjects.length) {
            Subject[] newArr = new Subject[subjects.length + 2];
            System.arraycopy(subjects, 0, newArr, 0, subjects.length);
            subjects = newArr;
        }

        subjects[subCount++] = sub;
    }

    //수강 삭제
    public void removeSubject(String subName) {
        for(int i=0; i<subCount; i++) {
            if(subjects[i].getS_name().equals(subName)) {
                //앞으로땡기기
                for(int j=i; j<subCount-1; j++) {
                    subjects[j] = subjects[j+1];
                }https://cafe.naver.com/f-e/cafes/29767745/articles/1395?boardtype=L&menuid=25&referrerAllArticles=false
                subjects[subCount-1] = null;
                subCount--;
                System.out.println("삭제 완료");
                return;
            }//https://cafe.naver.com/f-e/cafes/29767745/articles/1395?menuid=24&referrerAllArticles=false
        }
        System.out.println("해당 과목 없음");
    }

    public void print() {
        System.out.println(id + " " + name + " " + age);

        for(int i=0; i<subCount; i++) {
        	System.out.println("==="+(i+1) + "번째 과목 정보===");
            subjects[i].printSubjectInfo();
        }
    }
}
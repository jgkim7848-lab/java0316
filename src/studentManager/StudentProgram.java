package studentManager;

import java.util.Scanner;

public interface StudentProgram {
    void insertStudent(Scanner scan);
    void printStudentList();
    void searchStudent(Scanner scan);
    void insertSubject(Scanner scan);
    void deleteSubject(Scanner scan);
}
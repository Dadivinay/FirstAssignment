package MiniProjectt;

import java.util.ArrayList;

public class StudentManagementSystem {
	 private ArrayList<Student> students;

	    public StudentManagementSystem() {
	
    students = new ArrayList<>();
}

public void addStudent(Student student) {
    students.add(student);
}

public Student findStudentById(int id) {
    for (Student student : students) {
        if (student.getId() == id) {
            return student;
        }
    }
    return null;
}

public void displayAllStudents() {
    for (Student student : students) {
        System.out.println(student);
        System.out.println("====================");
    }
}

}

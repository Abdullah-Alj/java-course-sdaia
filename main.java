package day2.HW;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        var manager = new StudentManager();


        Student student1 = new Student("abdullah", 1);
        Student student2 = new Student("bandar", 2);
        Student student3 = new Student("omar", 3);


        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        Student retrievedStudent = manager.getStudentById(2);
        if (retrievedStudent != null) {
            System.out.println("Retrieved Student: " + retrievedStudent.getName() + ", ID: " + retrievedStudent.getId());
        } else {
            System.out.println("Student not found.");
        }


        System.out.println("All Students:");
        for (Student student : manager.getAllStudents()) {
            System.out.println(student.getName() + ", ID: " + student.getId());
        }


        boolean removed = manager.removeStudentById(3);
        if (removed) {
            System.out.println("Student with ID 3 removed.");
        } else {
            System.out.println("Student with ID 3 not found.");
        }


        System.out.println("All Students after removal:");
        for (Student student : manager.getAllStudents()) {
            System.out.println(student.getName() + ", ID: " + student.getId());
        }
    }
  
}

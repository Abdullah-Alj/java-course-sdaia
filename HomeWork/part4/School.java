package HomeWork.part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class School {
        private ArrayList<Student> students;
        public Object Students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentById(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                return;
            }
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void sortStudentsByName() {
        students.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    }

    public void clearStudents() {
        this.students.clear();
    }



    public int findStudentById(int studentId) {
        int left = 0;
        int right = students.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentId = students.get(mid).getStudentId();

            if (currentId == studentId) {
                return mid;
            }

            if (currentId < studentId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public void writeStudentsToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.println(student.getStudentId() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress());
            }
            System.out.println("Students written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing students to file: " + e.getMessage());
        }
    }

    public void readStudentsFromFile(String fileName) {
        students.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int studentId = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String address = parts[3];
                    Student student = new Student(studentId, name, age, address);
                    students.add(student);
                }
            }
            System.out.println("Students read from file successfully.");
        } catch (IOException e) {
            System.out.println("Error reading students from file: " + e.getMessage());
        }
    }

}

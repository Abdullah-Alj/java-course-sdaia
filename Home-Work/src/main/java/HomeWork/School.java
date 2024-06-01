package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class School {
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == studentId) {
                iterator.remove();
                break;
            }
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortStudentsByName() {
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    public Student findStudentById(int studentId) {
        int left = 0;
        int right = students.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Student student = students.get(mid);

            if (student.getStudentId() == studentId) {
                return student;
            } else if (student.getStudentId() < studentId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }


        public void writeStudentsToFile () {
            try (FileWriter writer = new FileWriter("h.w2.txt")) {
                for (Student student : students) {
                    writer.write(student.getDetails() + System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void readStudentsFromFile () {
            try (BufferedReader reader = new BufferedReader(new FileReader("h.w2.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Parse the line and create a Student object
                    // Add the student to the students list
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

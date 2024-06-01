package HomeWork.part4;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent(new Student(12345, "Alex Johnson", 19, "789 Oak St"));
        school.addStudent(new Student(23456, "Emma Thompson", 20, "456 Elm St"));
        school.addStudent(new Student(34567, "Michael Davis", 18, "123 Main St"));

        // Write students to file
        school.writeStudentsToFile("students.txt");

        // Clear students list
        school.displayAllStudents();
        //school.Students.clear();//
        school.clearStudents();
        System.out.println("Students list cleared.\n");

        // Read students from file
        school.readStudentsFromFile("students.txt");

        // Display students after reading from file
        System.out.println("Students after readingfrom file:");
        school.displayAllStudents();
    }

}
    
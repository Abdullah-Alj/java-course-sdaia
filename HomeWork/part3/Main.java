package HomeWork.part3;

public class Main {
public static void main(String[] args) {
    School school = new School();

    // Adding students
    school.addStudent(new Student(123, "Abdullah ", 19, "Al- Malqa"));
    school.addStudent(new Student(1234, "Bandar", 20, "AL - Rabwah"));
    school.addStudent(new Student(12345, " Abdulrhman", 18, "AL - Rayyan"));

    // Displaying all students
    System.out.println("All Students:");
    school.displayAllStudents();

    // Removing a student by ID
    int studentIdToRemove = 12345;
    school.removeStudentById(studentIdToRemove);
    System.out.println("\nStudent with ID " + studentIdToRemove + " removed.");

    // Displaying all students after removal
    System.out.println("\nAll Students after removal:");
    school.displayAllStudents();

    // Sorting students by name
    school.sortStudentsByName();
    System.out.println("\nStudents sorted by name:");
    school.displayAllStudents();

    // Finding a student by ID
    int studentIdToFind = 12345;
    int index = school.findStudentById(studentIdToFind);
    if (index != -1) {
        System.out.println("\nFound student with ID " + studentIdToFind + ":");
        //System.out.println(school.displayAllStudents().get(index).toString());
   

    } else {
        System.out.println("\nStudent with ID " + studentIdToFind + " not found.");
    }
   }

}
package HomeWork.part1;

public class Main {
    public static void main(String[] args) {
      
        Person person1 = new Person( "Abdullah ", 25, "Al- Malqa");
        Person person2 = new Person( "Bandar", 20, "AL - Rabwah");

        System.out.println("Person 1: ");
        System.out.println(person1.toString());

        System.out.println("\nPerson 2: ");
        System.out.println(person2.toString());

        Student student = new Student("Abdulrhman ", 19, "AL - Rayyan", 12345, "Computer Science");
        System.out.println("\nStudent: ");
        System.out.println(student.toString());
    }
}

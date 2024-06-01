package HomeWork.part4;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String address;

    public Student(int studentId, String name, int age, String address) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student Details:\n" +
                "Student ID: " + studentId + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Address: " + address + "\n";
    }

}

package HomeWork.part2;


class Person extends PersonRecord {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends PersonRecord {
    String name;
    int age;
    int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Student ID: " + studentId;
    }
}





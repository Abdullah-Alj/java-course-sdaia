package HomeWork;

class Student extends Person implements ComparableById {
    private int studentId;
    private String course;

    public Student(String name, int age, String address, int studentId, String course) {
        super(name, age, address);
        setStudentId(studentId);
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if (studentId <= 0) {
            throw new IllegalArgumentException("Invalid student ID. Student ID must be a positive integer.");
        }
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", studentId=" + studentId +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Student ID: " + getStudentId() + ", Course: " + getCourse();
    }

    @Override
    public boolean compareById(int id) {
        return studentId == id;
    }
}
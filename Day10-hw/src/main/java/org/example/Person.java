package org.example;



public class Person extends PersonRecord{
    public static double annualRate;
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        setAge(age);
        this.address = address;
    }

    public Person(String ahmed, int age) {
        super();
    }

    public static double getMonthlyRate() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150){
            this.age = age;
        }else {
            throw new IllegalArgumentException("The age must be between 0 - 150.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }

    @Override
    public String getDetails() {
        return toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("abdullah", 25, "123 Main St");
        Person p2 = new Person("Abdulrhman", 30, "456 Elm St");

        System.out.println("Details of Person 1:");
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Address: " + p1.getAddress());

        System.out.println("\nDetails of Person 2:");
        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
        System.out.println("Address: " + p2.getAddress());
    }

    public double getMonthlyInt() {

        return 0;
    }

    public Object withdraw(int i) {
        return 0;
    }

    public int getBalance() {
        return 0;
    }
}

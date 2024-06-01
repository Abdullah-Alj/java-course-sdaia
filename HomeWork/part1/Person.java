package HomeWork.part1;

public class Person {

        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) {
            this.name = name;
            setAge(age);
            this.address = address;
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
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("Age must be between 0 and 150.");
            }
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

      //  public static void main(String[] args) {
            //Person person1 = new Person("Alice", 30, "123 Street, City");
           // Person person2 = new Person("Bob", 25, "456 Road, Town");

            //System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge() + ", Address - " + person1.getAddress());
           // System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge() + ", Address - " + person2.getAddress());
        //}
    }



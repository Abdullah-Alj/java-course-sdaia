package day1.H.h;

public class w2 {

        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(getOutput(i));
            }
        }
    
        public static String getOutput(int number) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else if (number % 7 == 0) {
                return "Jazz";
            } else {
                return String.valueOf(number);
            }
        }
    }
    



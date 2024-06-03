package day2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.println(" enter mark   ");
        double m = sc.nextDouble();
        double f = sc.nextDouble();
        double marks = task2.calcBMI(m, f);
        String status = task2.getStatus(marks);
        System.out.println("yor mark " +  status);

        

    }

}

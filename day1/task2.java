package day1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int correct = 0;

        for (int i =1; i <=5 ; i++)  System.out.println("  enter a number");
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        System.out.printf("what %d * %d ? ", x, y);
        int answer = sc.nextInt();
        if (answer == x*y){
            System.out.println("بطل ");
            correct++;

        }else {
            System.out.println(" خطاء");
        }


}
}

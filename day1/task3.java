package day1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int answer = sc.nextInt();

        while (answer != x * y) {
            System.out.println("try again");
             x = (int) (Math.random() * 10);
             y = (int) (Math.random() * 10);
            System.out.printf("what %d * %d ? ", x, y);
             answer = sc.nextInt();
        }
        System.out.println("game over !");

    }

}

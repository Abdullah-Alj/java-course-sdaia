package day1;


import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int day =sc.nextInt();
        System.out.println("number a day ");
        if (day ==7 || day >=1 && day <=4){
            System.out.println("is work");

        }else if  (day ==5 ||day==6) {
            System.out.println("off");
        }
            else {
                System.out.println("invalid ");
        }
            switch (day){
                case 1: System.out.println("s");
                break;
                case 2: System.out.println("m");
                break;
                case 3: System.out.println("t");
                break;
                case 4: System.out.println("w");
                break;
                case 5: System.out.println("r");
                break;
                case 6: System.out.println("y");
                break;
                case 7: System.out.println("y");
                break;

            }

        }

    }

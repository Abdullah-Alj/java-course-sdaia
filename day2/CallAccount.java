package day2;

public class CallAccount {
    



    public static void main(String[] args) {
        Account X1 = new Account("Abdullah", 51532);
        Account X2 = new Account("Abdulrhman", 415.512);

        X1.getMonthlyRate();
        

        System.out.println(X1.name);
        System.out.println(X1.getBalance());
        System.out.println(X1.getMonthlyRate());
        System.out.println(X1.getMonthlyIntrest());
        System.out.println("_________/////////______________");
        System.out.println(X2.name);
        System.out.println(X2.getBalance());
        System.out.println(X2.getMonthlyRate());
        System.out.println(X2.getMonthlyIntrest());
    }
}



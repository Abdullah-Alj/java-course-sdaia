package day3;



public class CallAccount {




    public static void main(String[] args) {
        Account X1 = new Account("Abdullah", 51532);
        Account X2 = new Account("Abdulrhman", 415.512);

        savingacount q1 = new savingacount("abdullah", 2000 , 520);
        checkingAccount q2 = new checkingAccount("Abdulrhman", 6000);


       // X1.getMonthlyRate();
        q1.withdraw(500);
        q2.withdraw(50);



        System.out.println(q1.name);
        System.out.println(q1.getBalance());
        System.out.println(q1.getMonthlyRate());
        System.out.println(q1.getMonthlyIntrest());
        System.out.println("_________/////////______________");
        System.out.println(q2.name);
        System.out.println(q2.getBalance());
       // System.out.println(X2.getMonthlyRate());
       // System.out.println(X2.getMonthlyIntrest());
    }
}
package day3 ;

public class checkingAccount extends  Account{
    public checkingAccount(String name, double balance ) {
        super(name, balance);

    }

    @Override
    public void withdraw(int amount) {
        if (balance - amount >= 0)
        super.withdraw(amount);
    }
}

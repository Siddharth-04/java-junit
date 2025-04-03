package bridgelabz.advanceJunitProblems;

public class BankAccount {
    double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public double deposit(double amount){
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient funds");
        }
        else this.balance -= amount;
        return this.balance;
    }

    public double getBalance(){
        return this.balance;
    }
}

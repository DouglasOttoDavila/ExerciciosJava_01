package poo;

public class Account {

    private int number = 0;
    String holder;
    private double balance;
    private int withdrawTax = 5;

    public void createNumber(int number) {
        if (this.number == 0) {
            this.number = number;
        } else {
            System.out.println("<<Não é possível alterar>>");
        }
    }

    public int showNumber() {
        return number;
    }

    public double showBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance = (balance - amount) - withdrawTax;
    }
    
}

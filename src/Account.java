package src;
//Hw get and set methods for name and balance and fix printAccount

public class Account {
    //attributes
    private String customer;
    private double balance;

    // default constructor
    public Account () {};

    //constructor
    public Account (String customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    };

    //setters
    public void setCustomer (String customer) {
        this.customer = customer;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    //getters
    public String getCustomer (){
        return customer;
    }

    public double getBalance () {
        return balance;
    }

    //print method
    public void printAccount() {
        System.out.println("Account name: " + getCustomer() + " balance: " + getBalance());
    }

    //Main method
    public static void main(String[] args){
        Account account = new Account();
        account.setCustomer("Todd");
        account.setBalance(0);
        account.printAccount();

        Account account1 = new Account("Bob", 10000.0);
        account1.printAccount();

    }
}

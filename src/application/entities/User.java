package application.entities;

public class User {

    private int id;
    private String name;
    private double balance;
    private static double TAX = 5;

    public User(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        deposit(balance);
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {balance += amount;}

    public void withDraw(double amount) {balance -= amount + TAX;}

    public String toString() {
        return "Id:" + getId() +
                ", name:" + getName() +
                ", balance:" + String.format("%.2f", getBalance());
    }


}

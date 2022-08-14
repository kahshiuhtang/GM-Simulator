package main.Player;

public class Contract {
    private int expirationYear;
    private double amount;
    public Contract(int year, double amount){
        expirationYear = year;
        this.amount = amount;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

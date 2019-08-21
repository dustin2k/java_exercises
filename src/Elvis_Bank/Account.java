package Elvis_Bank;

import java.io.Serializable;

public class Account implements Serializable {
    private String customerName;
    private int accountNumber;
    private double balance;

    Account (String _name, int _number, double _balance) {
        customerName = _name;
        accountNumber = _number;
        balance = _balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

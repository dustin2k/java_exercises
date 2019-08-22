package Elvis_Bank;

import java.util.Scanner;

public class Bank_test {
    public static void main(String[] args) {
        // Test createAccount function
        // Bank bank = new Bank("VCB", "Vietcombank", "Tran Dai Nghia");
        // bank.createAccount("Thanh T", 45000000);
        // bank.listAccount();
        // bank.createAccount("Huyen L", 5000000);
        // bank.listAccount();
        // bank.createAccount("Nguyen C", 1000000);
        // bank.listAccount();

        // Test listAccount function
        // Bank bank = new Bank();
        // bank.listAccount();

        // Test withdraw + deposit function
        Bank bank = new Bank();
        int accountNumber;
        double amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNumber = input.nextInt();
        System.out.print("Enter the amount: ");
        amount = input.nextDouble();
        try {
            bank.withdraw(accountNumber, amount);
        } catch (accountNumberException e) {
            System.out.println(e.getMessage());
        } catch (balanceException e) {
            System.out.println(e.getMessage());
        }
        // try {
        //     bank.deposit(accountNumber, amount);
        // } catch(accountNumberException e) {
        //     // System.out.println("Account number not found");
        //     System.out.println(e.getMessage());
        // }
        input.close();
        bank.listAccount();
    }
}
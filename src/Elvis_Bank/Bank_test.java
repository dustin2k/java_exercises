package Elvis_Bank;

import java.util.Scanner;

public class Bank_test {
    public static void main(String[] args) {
        // Test createAccount function
        //       Bank bank = new Bank("VCB", "Vietcombank", "Tran Dai Nghia");
        //       bank.createAccount("Hoang G", 100000);

        // Test listAccount function
         Bank bank = new Bank();
         bank.listAccount();

        // Test withdraw function
//         Bank bank = new Bank();
//         int accountNumber;
//         double amount;
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter Account Number: ");
//         accountNumber = input.nextInt();
//         System.out.print("Enter the amount: ");
//         amount = input.nextDouble();
//         try {
//             bank.withdraw(accountNumber, amount);
//         } catch (accountNumberException e) {
//             System.out.println("Account number not found");
//         } catch (balanceException e) {
//             System.out.println("Not enough in balance to withdraw");
//         }
//         input.close();
    }
}
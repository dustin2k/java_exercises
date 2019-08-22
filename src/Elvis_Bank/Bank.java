package Elvis_Bank;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

public class Bank {
    private String bankId;
    private String bankName;
    private String branch;

    Bank() {};

    Bank(String _bankId, String _bankName, String _branch) {
        bankId = _bankId;
        bankName = _bankName;
        branch = _branch;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void displayAccountDetails(Account acc) {
        System.out.println("Bank: " + this.bankName);
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Customer Name: " + acc.getCustomerName());
        System.out.println("Balance: " + acc.getBalance());
    }

    public void createAccount(String username, double balance) {
        // Matcher m = Pattern.compile("\\s.").matcher(username);
        // String id = "";
        // while (m.find()) {
        //     id += m.group();
        // }
        // m = Pattern.compile("\\s").matcher(id);
        // id = m.replaceAll("");
        int id;
        Date date = new Date();
        id = -(int) date.getTime();
        Account acc = new Account(username, id, balance);
        try {
            FileOutputStream f = new FileOutputStream("account.txt", true);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(acc);
            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    void listAccount() {
        try {
            FileInputStream f = new FileInputStream("account.txt");
            while (true) {
                try {
                    ObjectInputStream o = new ObjectInputStream(f);
                    Account acc = (Account) o.readObject();
                    System.out.println(acc.getAccountNumber() + " " + acc.getCustomerName() + " " + acc.getBalance());
                } catch (EOFException e) {
                    break;
                }
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            //            System.out.println("Error initializing stream");
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    void withdraw(int accountNumber, double amount) throws accountNumberException, balanceException {
        try {
            int flag = 0;
            FileInputStream fi = new FileInputStream(new File("account.txt"));
            ArrayList < Account > arr_account = new ArrayList < Account > ();
            while (true) {
                try {
                    ObjectInputStream oi = new ObjectInputStream(fi);
                    Account acc = (Account) oi.readObject();
                    arr_account.add(acc);
                    if (acc.getAccountNumber() == accountNumber) {
                        if (acc.getBalance() < amount) throw new balanceException("Not enough in balance");
                        else {
                            System.out.println("OK");
                        }
                        flag = 1;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            fi.close();
            if (flag == 0) throw new accountNumberException("Account number not found");
            else {
                FileOutputStream fo = new FileOutputStream(new File("account.txt"));
                for (Account acc: arr_account) {
                    ObjectOutputStream oo = new ObjectOutputStream(fo);
                    if (acc.getAccountNumber() == accountNumber) {
                        Account _acc = new Account(acc.getCustomerName(), acc.getAccountNumber(), acc.getBalance() - amount);
                        oo.writeObject(_acc);
                    } else oo.writeObject(acc);
                }
                fo.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    void deposit(int accountNumber, double amount) throws accountNumberException {
        try {
            int flag = 0;
            FileInputStream fi = new FileInputStream("account.txt");
            ArrayList < Account > arr_account = new ArrayList < Account > ();
            while (true) {
                try{
                    ObjectInputStream oi = new ObjectInputStream(fi);
                    Account acc = (Account) oi.readObject();
                    arr_account.add(acc);
                    if(acc.getAccountNumber() == accountNumber) {
                        flag = 1;
                    }
                } catch(EOFException e) {
                    break;
                }
            }
            fi.close();
            if(flag == 0) throw new accountNumberException("Account number not found");
            else {
                FileOutputStream fo = new FileOutputStream("account.txt");
                for(Account acc: arr_account) {
                    ObjectOutputStream oo = new ObjectOutputStream(fo);
                    if(acc.getAccountNumber() == accountNumber) {
                        Account _acc = new Account(acc.getCustomerName(), acc.getAccountNumber(), acc.getBalance() + amount);
                        oo.writeObject(_acc);
                    } else oo.writeObject(acc);
                }
                fo.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
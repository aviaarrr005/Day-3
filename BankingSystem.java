/*
Question 2 – Banking System (Single Level)

Problem Statement:

1. Create class Account:
- accountNumber, balance
- Static block to initialize bank name
- IIB to print "Account instance initializing"
- Constructor to set account details
- Method withdraw(double amount)

2. Create class SavingsAccount:
- interestRate
- Override withdraw():
  - Prevent withdrawal if balance < 1000
  - Print appropriate message

3. In main:
  Account a = new SavingsAccount(...);
  a.withdraw(...);

Students must:
- Show overriding
- Use super keyword
- Show execution flow clearly
*/

@SuppressWarnings("InitializerMayBeStatic")
class Account
{
    @SuppressWarnings("unused")
    int accountNumber;
    double balance;
    static String bankName;
    
    static
    {
        bankName = "National Bank";
        System.out.println("Bank Name: " + bankName);
    }
    
    {
        System.out.println("Account Instance Initializing");
    }
    
    Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account created with Number: " + accountNumber);
    }
    
    void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}

class SavingsAccount extends Account
{
    @SuppressWarnings("unused")
    int interestRate;
    
    SavingsAccount(int accountNumber, double balance, int interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        System.out.println("SavingsAccount created with Interest Rate: " + interestRate + "%");
    }
    
    @Override
    void withdraw(double amount)
    {
        if (balance < 1000) {
            System.out.println("Cannot withdraw! Minimum balance of 1000 required.");
            System.out.println("Current Balance: " + balance);
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankingSystem
{
    public static void main(String args[])
    {
        System.out.println("===== Banking System =====\n");
        
        Account a = new SavingsAccount(101, 5000, 5);
        System.out.println();
        
        System.out.println("--- Withdrawal Attempt 1 ---");
        a.withdraw(2000);
        System.out.println();
        
        System.out.println("--- Withdrawal Attempt 2 (Should Fail) ---");
        a.withdraw(4000);
    }
}
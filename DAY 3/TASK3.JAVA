public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
                System.out.println("New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Current balance: $" + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
        }
    }

   d
    public double getBalance() {
        return balance;
    }

   
    public String getAccountHolder() {
        return accountHolder;
    }

  
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public static void main(String[] args) {
      
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
        
       
        account.deposit(500.0);
        account.deposit(-50.0); // Should show error
        
       
        account.withdraw(200.0);
        account.withdraw(2000.0); 
        account.withdraw(-100.0);
        
    
        System.out.println("Final balance for " + account.getAccountHolder() + 
                          " (Account #" + account.getAccountNumber() + "): $" + 
                          account.getBalance());
    }
}

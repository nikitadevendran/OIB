package atm;
import java.util.Scanner;
public class ATM {
private double balance;
    private String transactionHistory;
    
    public ATM() {
        balance = 0.0;
        transactionHistory = "";
    }
    
    public void deposit(double amount) {
        balance += amount;
        transactionHistory += "Deposit Amount: ₹" + amount + "\n";
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory += "Withdrawal Amount: ₹" + amount + "\n";
        } else {
            System.out.println("Inadequate stash.");
        }
    }
    
    public void transfer(double amount, ATM otherAccount) {
        if (balance >= amount) {
            withdraw(amount);
            otherAccount.deposit(amount);
            transactionHistory += "Transfer: ₹" + amount + " to account " + otherAccount + "\n";
        } else {
            System.out.println("Inadequate stash");
        }
    }
    
    public void showTransactionHistory() {
        System.out.println(transactionHistory);
    }
    
    public static void main(String[] args) {
        ATM account1 = new ATM();
        ATM account2 = new ATM();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        while (!quit) {
            System.out.println("Welcome To ATM Machine !"+ "\n");
            System.out.println("Choose the operation you want to perform." + "\n");
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Transfer");
            System.out.println("4 -> Show transaction history");
            System.out.println("5 -> Exit"+ "\n");
            int choice = scanner.nextInt();
             System.out.println("\n");
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double amount = scanner.nextDouble();
                    account1.deposit(amount);
                    System.out.println("Amount is deposited."+ "\n");
                    System.out.println("Thankyou for using our services."+ "\n");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = scanner.nextDouble();
                    account1.withdraw(amount);
                    System.out.println("Amount is withdrawed."+ "\n");
                    System.out.println("Thankyou for using our services."+ "\n");
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ₹");
                    amount = scanner.nextDouble();
                    account1.transfer(amount, account2);
                    System.out.println("Amount is transferred."+ "\n");
                    System.out.println("Thankyou for using our services."+ "\n");
                    break;
                case 4:
                    System.out.print("Your transaction history is as follows : "+ "\n");
                    account1.showTransactionHistory();
                    System.out.println("Thankyou for using our services."+ "\n");
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
   
}

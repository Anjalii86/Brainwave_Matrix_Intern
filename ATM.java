import java.util.Scanner;

    public class ATM {
        // Variables to store account balance, deposit amount, and withdrawal amount
        private double balance;
        private double depositAmount;
        private double withdrawAmount;
    
        // Constructor to initialize balance
        public ATM() {
            balance = 0.0;
        }
    
        // Method to display ATM options
        public void showMenu() {
            System.out.println("\nWelcome to the ATM Interface!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
        }
    
        // Method to check the account balance
        public void checkBalance() {
            System.out.println("Current Balance: $" + balance);
        }
    
        // Method to deposit money into the account
        public void depositMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to deposit: $");
            depositAmount = scanner.nextDouble();
            if (depositAmount > 0) {
                balance += depositAmount;
                System.out.println("$" + depositAmount + " has been deposited.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    
        // Method to withdraw money from the account
        public void withdrawMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: $");
            withdrawAmount = scanner.nextDouble();
            if (withdrawAmount > 0 && withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.println("$" + withdrawAmount + " has been withdrawn.");
            } else if (withdrawAmount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    
        // Main method to drive the ATM interface
        public static void main(String[] args) {
            ATM atm = new ATM();
            Scanner scanner = new Scanner(System.in);
            int option;
    
            // Keep showing the menu until user chooses to exit
            do {
                atm.showMenu();
                System.out.print("Choose an option: ");
                option = scanner.nextInt();
    
                switch (option) {
                    case 1:
                        atm.checkBalance();
                        break;
                    case 2:
                        atm.depositMoney();
                        break;
                    case 3:
                        atm.withdrawMoney();
                        break;
                    case 4:
                        System.out.println("Exiting... Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
    
            } while (option != 4);
    
            scanner.close();
        }
    }
    
    


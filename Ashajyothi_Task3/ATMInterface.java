import java.util.Scanner;

class BankAccount {

    double balance = 10000;

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    // Withdraw Method
    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Check Balance Method
    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        // PIN Verification
        int pin = 1234;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            sc.close();
            return;
        }

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 2:

                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 3:

                    account.checkBalance();
                    break;

                case 4:

                    System.out.println("Thank you for using ATM!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
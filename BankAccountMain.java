import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountMain {
    static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        accounts.add(new BankAccount("Stiorra", 5000, 1001));
        accounts.add(new BankAccount("Alfred", 100000, 1002));
        accounts.add(new BankAccount("Uthred", 50000, 1003));

        System.out.println("Hello world! Welcome to the Bank of Bunnies!");
        System.out.println("Are you an existing customer? (-1 to exit) \n 1. Yes\n 2. No");
        int firstCustomerInput = Integer.valueOf(scanner.nextLine());

        while (true) {
            if (firstCustomerInput == -1) {
                System.out.println("Have a nice day!");
                break;
            } else if (firstCustomerInput == 1) {
                System.out.println("Can you please give me your account number?");
                int accountNumCustomerInput = Integer.valueOf(scanner.nextLine());
                boolean isExisitngCustomer = false;
                int index = -1;
                for (int i = 0; i < accounts.size(); i++) {
                    BankAccount account = accounts.get(i);
                    if (accountNumCustomerInput == account.getAccountNumber()) {
                        isExisitngCustomer = true;
                        index = i;
                    }
                }

                if (isExisitngCustomer) {
                    mainMenu(accounts.get(index));
                } else {
                    System.out.println("Your account number doesn't exist");
                }
            } else if (firstCustomerInput == 2) {
                BankAccount newAccount = new BankAccount();
                System.out.println("Let's make a new account");
                System.out.println("What is the name for the account?");
                String accountHolderName = scanner.nextLine();
                newAccount.setAccountHolderName(accountHolderName);
                System.out.println("What is the beginning balance for the account?");
                double accountBalance = Double.parseDouble(scanner.nextLine());
                newAccount.setAccountBalance(accountBalance);
                accounts.add(newAccount);
                mainMenu(accounts.get(accounts.size() - 1));

            }

        }

    }

    public static void mainMenu(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome " + account.getAccountHolderName() + " to the Bank of Bunnies!");
        System.out.println("Welcome to the Main Menu. What would you like to do today?");
        System.out.println("1. To check account balance.");
        System.out.println("2. To make a withdrawal.");
        System.out.println("3. To make a deposit.");
        System.out.println("4. To make a transfer to an another account.");
        System.out.println("0. To exit.");

        int mainMenuCustomerInput = Integer.valueOf(scanner.nextLine());

        while (mainMenuCustomerInput != 0) {

            if (mainMenuCustomerInput == 1) {
                account.getAccountBalance();
                System.out.println("Your current balance is " + account.getAccountBalance());
                mainMenu(accounts.get(accounts.size() - 1));
            }
            if (mainMenuCustomerInput == 2) {
                System.out.println("How much would you like to withdraw?");
                double withDrawAmount = Double.parseDouble(scanner.nextLine());
                account.getWithdrawal(withDrawAmount);
                System.out.println("You have withdrew " + withDrawAmount + " from your account");
                mainMenu(accounts.get(accounts.size() - 1));
            }
            if (mainMenuCustomerInput == 3) {
                System.out.println("How much would you like to deposit?");
                double depositAmount = Double.parseDouble(scanner.nextLine());
                account.getDeposit(depositAmount);
                System.out.println("You have deposited " + depositAmount + " to your account");
                mainMenu(accounts.get(accounts.size() - 1));
            }
            if (mainMenuCustomerInput == 4) {
                System.out.println("Please enter the account number to transfer to ");
                int accountToTransferTo = Integer.valueOf(scanner.nextLine());
                BankAccount toTransferTo = new BankAccount();
                boolean isExisitngCustomer = false;
                int index = -1;
                for (int i = 0; i < accounts.size(); i++) {
                    BankAccount account1 = accounts.get(i);
                    if (accountToTransferTo == account1.getAccountNumber()) {
                        toTransferTo = account1;
                        isExisitngCustomer = true;
                        index = i;
                    }
                }

                if (isExisitngCustomer) {
                    System.out.println("How much would you like to transfer?");
                    double transferAmount = Double.valueOf(scanner.nextLine());

                    account.getTransfer(toTransferTo, transferAmount);
                    System.out.println(account.getAccountHolderName() + " transferred " + transferAmount + " and now has " + account.getAccountBalance());
                    System.out.println(toTransferTo.getAccountHolderName() + " was given " + transferAmount + " and now has " + toTransferTo.getAccountBalance());
                    break;
                } else {
                    System.out.println("Your account number doesn't exist.");
                    mainMenu(account);
                }
                break;
            }
            if (mainMenuCustomerInput == 0) {
                break;
            }
        }
    }
}

package view;

import controller.AccountController;
import model.Account;

import java.util.List;
import java.util.Scanner;

public class AccountView {
    public static void main(Scanner sc) {
        AccountController accountController = new AccountController();
        while (true) {
            System.out.println("[Account] 0-Exit 1-Create 2-Deposit 3-Withdraw 4-Balance 5-RemoveAccount ");
            switch (sc.next()) {
                case "0":
                    System.out.println("Exit.");
                    return;
                case "1":
                    System.out.println("Create account.");
                    System.out.println(accountController.createAccount(sc));
                    break;
                case "2":
                    System.out.println("Deposit.");
                    System.out.println(accountController.deposit(sc));
                    break;
                case "3":
                    System.out.println("Withdraw.");
                    System.out.println(accountController.withdraw(sc));
                    break;
                case "4":
                    System.out.println("Balance.");
                    System.out.println(accountController.balance(sc));
                    break;
                case "5":
                    System.out.println("Remove account.");
                    accountController.cancelAccount(sc);
                    break;
                case "6":
                    System.out.println("account list.");
                    List<Account> temp = accountController.getAccounts(sc);
            }
        }

    }
}

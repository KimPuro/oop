package serviceImpl;
import lombok.Getter;
import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Getter
    private static AccountService instance = new AccountServiceImpl();
    List<Account> accounts;

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public String createAccount(Account account) {
        return null;
    }

    @Override
    public String deposit(Account account) {
        return null;
    }

    @Override
    public String withdraw(Account account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAccounts(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }
}

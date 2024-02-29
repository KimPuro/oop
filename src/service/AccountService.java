package service;

import model.AccountDto;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDto account);
    String deposit(AccountDto account);
    String withdraw(AccountDto account);
    String getBalance(String accountNumber);
    List<AccountDto> getAccounts(String accountNumber); //계좌 목록
    String cancelAccount(String accountNumber);
}
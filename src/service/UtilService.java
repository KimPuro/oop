package service;

public interface UtilService {
    public
    int createRandomInt(int start, int end);
    double createRandomDouble(int start, int end);
    String createRandomName();
    String createRandomContent();
    String createRandomTitle();

    String createRandomLowerCaseUsername();
    String createRandomEnglishName();
    String createRandomCompany();

    interface AccountService {
        void createAccount(String accountNumber, String accountHolder);
        void deposit(String accountNumber, double amount);
        void withdraw(String accountNumber, double amount);
        double getBalance(String accountNumber);
        void cancelAccount(String accountNumber);
    }
}

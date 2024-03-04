package model;

import lombok.*;

import java.util.Date;

@Getter
@ToString(exclude = {"id"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private Date transactionDate;

    @Builder
    public Account(long id, String accountNumber, String accountHolder, double balance, Date transactionDate) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionDate = transactionDate;
    }
}
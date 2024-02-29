package model;

import builder.AccountBuilder;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {


    private long id;

    private String accountNumber;

    private String accountHolder;

    private double balance;

    private Date transactionDate;

    }
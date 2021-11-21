package com.bank.account.domain;

import lombok.Data;

@Data
public class Account {

    private String id;
    private String idAccountType;
    private String idCurrency;
    private String number;
    private Double balance;

}

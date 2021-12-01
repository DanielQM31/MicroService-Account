package com.bank.account.domain;

import lombok.Data;

@Data
public class Account {

    private String id;                  //Código de Cuenta
    private String idAccountType;       //Tipo de Cuenta
    private String idCurrency;          //Código de Moneda
    private String number;              //Número de Cuenta
    private Double balance;             //Saldo en la Cuenta

}

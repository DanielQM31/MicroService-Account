package com.bank.account.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Account {

    private String id;                  //Código de Cuenta
    private String idAccountType;       //Tipo de Cuenta
    private String idCurrency;          //Código de Moneda
    @NotEmpty(message = "El número de cuenta es obligatorio")
    private String number;              //Número de Cuenta
    private Double balance;             //Saldo en la Cuenta

}

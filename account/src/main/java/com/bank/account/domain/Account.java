package com.bank.account.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Account {

    private String id;                  //Código de Cuenta

    @NotEmpty(message = "El campo no debe ser vacío")
    private String idAccountType;       //Tipo de Cuenta

    @NotEmpty(message = "El campo no debe ser vacío")
    private String idCurrency;          //Código de Moneda

    @NotEmpty(message = "El campo no debe ser vacío")
    @NotEmpty(message = "El número de cuenta es obligatorio")
    private String number;              //Número de Cuenta

    private Double balance;             //Saldo en la Cuenta

}

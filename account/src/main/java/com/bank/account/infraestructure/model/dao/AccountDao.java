package com.bank.account.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Document("account")
public class AccountDao {

    @Id
    private String id;                  //Código de Cuenta
    private String idAccountType;       //Tipo de Cuenta
    private String idCurrency;          //Código de Moneda
    private String number;              //Número de Cuenta
    private Double balance;             //Saldo en la Cuenta

}

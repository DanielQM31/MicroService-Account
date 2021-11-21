package com.bank.account.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("account")
public class AccountDao {

    @Id
    private String id;
    private String idAccountType;
    private String idCurrency;
    private String number;
    private Double balance;

}

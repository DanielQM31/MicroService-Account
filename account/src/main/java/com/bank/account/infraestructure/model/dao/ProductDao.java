package com.bank.account.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("product")
public class ProductDao {

    @Id
    private String id;
    private String idAccount;
    private String idBusiness;
    private String idUser;
    private String userType;

}

package com.bank.account.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("product")
public class ProductDao {

    @Id
    private String id;                  //Código del Producto(Asignación)
    private String idAccount;           //Código de Cuenta
    private String idBusiness;          //Código de Empresa
    private String idUser;              //Código de Usuario
    private String userType;            //Tipo de Usuario (Titular(T) o Firmante(F))

}

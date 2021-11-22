package com.bank.account.domain;

import lombok.Data;

@Data
public class Product {

    private String id;                  //Código del Producto(Asignación)
    private String idAccount;           //Código de Cuenta
    private String idBusiness;          //Código de Empresa
    private String idUser;              //Código de Usuario
    private String userType;            //Tipo de Usuario (Titular(T) o Firmante(F))

}

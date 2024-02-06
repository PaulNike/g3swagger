package com.semana7.swagger.response;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class AutorResponse {
    private Long idAutor;
    private String tipoDoc;
    private String numDoc;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer estado;
    private String userCreate;
    private Timestamp dateCreate;
    private String userModif;
    private Timestamp dateModif;
    private String userDelete;
    private Timestamp dateDelete;
}

package com.semana7.swagger.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "autor")
public class AutorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    /*
    *   tipo_doc CHAR(2) NOT NULL,
  num_doc VARCHAR(11) NOT NULL,
  nombres VARCHAR(100) NOT NULL,
  apellidos VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  estado INT NOT NULL,
  user_create VARCHAR(45),
  date_create TIMESTAMP,
  user_modif VARCHAR(45),
  date_modif TIMESTAMP,
  user_delete VARCHAR(45),
  date_delete TIMESTAMP
    * */
}

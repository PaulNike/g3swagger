package com.semana7.swagger.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorRequest {
    private Long idAutor;
    private String tipoDoc;
    private String numDoc;
    private String nombres;
    private String apellidos;
    private String email;
}

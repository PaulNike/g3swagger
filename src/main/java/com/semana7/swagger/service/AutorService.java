package com.semana7.swagger.service;

import com.semana7.swagger.entity.AutorEntity;
import com.semana7.swagger.request.AutorRequest;

import java.util.List;

public interface AutorService {

    AutorEntity crearAutor(AutorRequest autor);
    List<AutorEntity> obtenerTodos();
    AutorEntity obtenerUno(Long id);
    AutorEntity actualizar(Long id, AutorEntity autor);
    AutorEntity eliminar(Long id);

}

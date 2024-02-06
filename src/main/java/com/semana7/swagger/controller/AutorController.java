package com.semana7.swagger.controller;

import com.semana7.swagger.entity.AutorEntity;
import com.semana7.swagger.request.AutorRequest;
import com.semana7.swagger.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping()
    public List<AutorEntity> listarAutores(){
        List<AutorEntity> autores = autorService.obtenerTodos();
        return autores;
    }

    @GetMapping("/{id}")
    public AutorEntity listarAutor(@PathVariable Long id){
        AutorEntity autores = autorService.obtenerUno(id);
        return autores;
    }

    @PostMapping()
    public AutorEntity crearAutor(@RequestBody AutorRequest autor){
        AutorEntity autorCreado = autorService.crearAutor(autor);
        return autorCreado;
    }

    @PutMapping()
    public AutorEntity actualizarAutor(@PathVariable Long id,@RequestBody AutorEntity autor){
        AutorEntity autorActualizado = autorService.actualizar(id,autor);
        return autorActualizado;
    }
    @DeleteMapping("/{id}")
    public AutorEntity deleteAutor(@PathVariable Long id){
        AutorEntity eliminado = autorService.eliminar(id);
        return eliminado;
    }




}

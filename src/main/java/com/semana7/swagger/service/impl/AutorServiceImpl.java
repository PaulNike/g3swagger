package com.semana7.swagger.service.impl;

import com.semana7.swagger.entity.AutorEntity;
import com.semana7.swagger.repository.AutorRepository;
import com.semana7.swagger.request.AutorRequest;
import com.semana7.swagger.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private AutorRepository autorRepository;


    @Override
    public AutorEntity crearAutor(AutorRequest autor) {
        AutorEntity entity = new AutorEntity();
        entity.setTipoDoc(autor.getTipoDoc());
        entity.setNumDoc(autor.getNumDoc());
        entity.setNombres(autor.getNombres());
        entity.setApellidos(autor.getApellidos());
        entity.setEmail(autor.getEmail());
        entity.setEstado(1);
        entity.setUserCreate("Paul");
        entity.setDateCreate(getTimestamp());

        return autorRepository.save(entity);
    }

    @Override
    public List<AutorEntity> obtenerTodos() {
        return autorRepository.findAll();
    }

    @Override
    public AutorEntity obtenerUno(Long id) {
        Optional<AutorEntity> autor = autorRepository.findById(id);
        if(autor.isPresent()){
            return autor.get();
        }else{
            return null;
        }

    }

    @Override
    public AutorEntity actualizar(Long id, AutorEntity autor) {
        boolean exists = autorRepository.existsById(id);
        if(exists){
            Optional<AutorEntity> entity = autorRepository.findById(id);
            AutorEntity autorUpdate = entity.get();
            autorUpdate.setNombres(autor.getNombres());
            autorUpdate.setApellidos(autor.getApellidos());
            return autorRepository.save(autorUpdate);
        }
        return null;

    }

    @Override
    public AutorEntity eliminar(Long id) {
        boolean exists = autorRepository.existsById(id);
        if(exists){
            Optional<AutorEntity> entity = autorRepository.findById(id);
            AutorEntity autorUpdate = entity.get();
            autorUpdate.setEstado(0);
            return autorRepository.save(autorUpdate);
        }
        return null;
    }

    private Timestamp getTimestamp(){
        long currentTime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(currentTime);
        return timestamp;
    }
}

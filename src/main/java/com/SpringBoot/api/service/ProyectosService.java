/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Proyectos;
import com.SpringBoot.api.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    private ProyectosRepository proyecRepo;

    @Override
    public List<Proyectos> verProyectos() {
        List<Proyectos> listaProyectos= proyecRepo.findAll();
                return listaProyectos;
    }

    @Override
    public void crearProyecto(Proyectos proyec) {
        proyecRepo.save(proyec);
        
    }

    @Override
    public void borrarProyecto(Long id) {
       proyecRepo.deleteById(id);
       
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
       Proyectos proyec = proyecRepo.findById(id).orElse(null);
       return proyec;
    }
    
}

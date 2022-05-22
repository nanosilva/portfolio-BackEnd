/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Educacion;
import com.SpringBoot.api.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository educRepo;

    @Override
    public List<Educacion> verEducacion() {
        List<Educacion> listaEducacion = educRepo.findAll();
        return listaEducacion;
    }

    @Override
    public void crearEducacion(Educacion educ) {
        educRepo.save(educ);
        
    }

    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById(id);
        
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion educ = educRepo.findById(id).orElse(null);
        return educ;
        
    }
    
}

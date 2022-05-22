/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Educacion;
import java.util.List;

/**
 *
 * @author user
 */
public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion educ);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Experiencia;
import java.util.List;

/**
 *
 * @author user
 */
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia expe);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia buscarExperiencia(Long id);
    
}

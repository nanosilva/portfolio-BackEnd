/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Proyectos;
import java.util.List;

/**
 *
 * @author user
 */
public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    
    public void crearProyecto(Proyectos proyec);
    
    public void borrarProyecto(Long id);
    
    public Proyectos buscarProyecto(Long id);
    
    
    
}

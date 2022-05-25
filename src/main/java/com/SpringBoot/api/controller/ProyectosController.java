/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.controller;

import com.SpringBoot.api.model.Proyectos;
import com.SpringBoot.api.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class ProyectosController {
    
    @Autowired
    private IProyectosService proyecServ;
    
    @CrossOrigin(origins="*")
    @GetMapping("/proyectos/ver")
    public List<Proyectos> verProyectos(){
        return proyecServ.verProyectos();
        
    }
    @PostMapping("/proyectos/new")
    public void agregarProyecto(@RequestBody Proyectos proyec){
        proyecServ.crearProyecto(proyec);
    }
    @DeleteMapping("/proyectos/delete/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyecServ.borrarProyecto(id);
        
    }
    @PostMapping("/proyectos/edit/{id}")
    public Proyectos editarProyecto(@PathVariable Long id,
                                    @RequestBody Proyectos proyec){
        
                
        proyecServ.crearProyecto(proyec);
        return proyec;
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.controller;

import com.SpringBoot.api.model.Experiencia;
import com.SpringBoot.api.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expeServ;
    
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expeServ.verExperiencia();
    }
    @PostMapping("/experiencia/new")
    public void agregarExperiencia(@RequestBody Experiencia expe){
        expeServ.crearExperiencia(expe);
    }
    
    @DeleteMapping("/experiencia/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expeServ.borrarExperiencia(id);  
        
    }
    
    @PostMapping("/experiencia/edit/{id}")
    public Experiencia editarExperiencia(@PathVariable Long id   ,        
                                  @RequestBody Experiencia expe){
                     
        expeServ.crearExperiencia(expe);
       
        return expe;
    }
}
    

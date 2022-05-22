/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.controller;

import com.SpringBoot.api.model.Persona;
import com.SpringBoot.api.service.IPersonaService;
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
@CrossOrigin(origins="http://localhost:4200",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;    
    
   
    @PostMapping("/persona/new")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        
    }
    
    @GetMapping("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas(){
       return persoServ.verPersona();
    }
    
    @DeleteMapping("/persona/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        
    }
    @PostMapping("/persona/edit/{id}")
    public void editarPersona(@PathVariable Long id   ,        
                             @RequestBody Persona pers){
                     
        persoServ.crearPersona(pers);
}
}
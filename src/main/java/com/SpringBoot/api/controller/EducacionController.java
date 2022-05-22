/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.controller;

import com.SpringBoot.api.model.Educacion;
import com.SpringBoot.api.service.IEducacionService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@CrossOrigin(origins="http://localhost:4200",methods={RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class EducacionController {
    
    @Autowired
    private IEducacionService educServ;
    @CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*")
    @GetMapping("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educServ.verEducacion();
}
    
    @PostMapping("/educacion/new")
    public void agregarEducacion(@RequestBody Educacion educ){
        educServ.crearEducacion(educ);
        
    }
    @DeleteMapping("/educacion/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educServ.borrarEducacion(id);
        
    }
   
    @PostMapping("/educacion/edit/{id}")
    public void editarEducacion(@PathVariable Long id,
                                     @RequestBody Educacion educ){
         
           educServ.crearEducacion(educ);
        
        
    }
    
    
}
    
    

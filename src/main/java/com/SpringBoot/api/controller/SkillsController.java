/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.controller;

import com.SpringBoot.api.model.Skills;
import com.SpringBoot.api.service.ISkillsService;
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
public class SkillsController {
    
    @Autowired
    private ISkillsService skillServ;
    
   
    @GetMapping("/skills/ver")
    @ResponseBody
    public List<Skills> verSkills(){
        return skillServ.verSkills();
    }
    
    @PostMapping("/skills/new")
    public void agregarSkill(@RequestBody Skills skill){
        skillServ.crearSkill(skill);
        
    }
    
    @DeleteMapping("/skills/delete/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
        
    }
   
    @PostMapping("/skills/edit/{id}")
    public void editarSkill(@PathVariable Long id,
                             @RequestBody Skills skill
                              ){
               
        skillServ.crearSkill(skill);
       
        
    }
        
}

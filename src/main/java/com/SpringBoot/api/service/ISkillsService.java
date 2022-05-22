/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Skills;
import java.util.List;

/**
 *
 * @author user
 */
public interface ISkillsService {
    
    public List<Skills> verSkills();
    
    public void crearSkill(Skills skill);
    
    public void borrarSkill(Long id);
    
    public Skills buscarSkill(Long id);
    
    
    
}

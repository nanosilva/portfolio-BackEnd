/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Skills;
import com.SpringBoot.api.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class SkillsService implements ISkillsService{
    
    @Autowired
    private SkillsRepository skillRepo;

    @Override
    public List<Skills> verSkills() {
        List<Skills> listaSkills = skillRepo.findAll();
        return listaSkills;
    }

    @Override
    public void crearSkill(Skills skill) {
        skillRepo.save(skill);
        
       
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
                
    }

    @Override
    public Skills buscarSkill(Long id) {
        Skills skill= skillRepo.findById(id).orElse(null);
        return skill;
        
        
    }
    
    
    
    
}

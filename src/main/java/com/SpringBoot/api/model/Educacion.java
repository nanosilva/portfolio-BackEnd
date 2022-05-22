/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author user
 */
@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE  )
    private Long id;
    private String school;
    private String title;
    private String img;
    private String career;
    private String inicio;
    private String fin;

    public Educacion() {
    }

    public Educacion(Long id, String school, String title, String img, String career, String inicio, String fin) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    
    
}

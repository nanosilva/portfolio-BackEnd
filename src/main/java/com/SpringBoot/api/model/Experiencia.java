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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String position;
    private String company;
    private String funcion;
    private String img;
    private String mode;
    private String inicio;
    private String fin;
    private String timeElapsed;

    public Experiencia() {
    }

    public Experiencia(Long id, String position, String company, String function, String img, String mode, String start, String end, String timeElapsed) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.funcion = function;
        this.img = img;
        this.mode = mode;
        this.inicio = start;
        this.fin = end;
        this.timeElapsed = timeElapsed;
    }
    
    
    
    
    
}

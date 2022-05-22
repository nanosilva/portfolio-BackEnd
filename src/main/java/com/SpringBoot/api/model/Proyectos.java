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
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String detalle;
    private String fecha;
    private String link;
    private String imagen;
    
    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String detalle, String fecha, String link, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.fecha = fecha;
        this.link = link;
        this.imagen = imagen;
        
    }
    
    
    
    
}

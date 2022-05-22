/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author user
 */
public interface IUsuarioService {
    public List <Usuario> verUsuario();
    
    public void crearUsuario(Usuario usuario);
    
    public void borrarUsuario(Long id);
    
    public Usuario buscarUsuario(Long id);
    
   public Optional<Usuario> buscarEmailPass(Usuario usuario);
   
   
    
}

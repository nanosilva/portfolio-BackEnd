/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.service;

import com.SpringBoot.api.model.Usuario;
import com.SpringBoot.api.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepo;
    
    @Override
    public List<Usuario> verUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void borrarUsuario(Long id) {
       usuarioRepo.deleteById(id);
       
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        Usuario usuario = usuarioRepo.findById(id).orElse(null);
        return usuario;
    }

    @Override
    public Optional<Usuario> buscarEmailPass(Usuario usuario) {
       Optional<Usuario> usuarios= usuarioRepo.findByEmailAndPassword(usuario.getEmail(),usuario.getPassword());
       if(!usuarios.isEmpty()){
           return usuarios;
       }
       return null;
    }
   
   
}

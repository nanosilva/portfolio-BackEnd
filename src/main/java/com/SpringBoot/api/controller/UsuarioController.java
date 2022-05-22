/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringBoot.api.controller;

import com.SpringBoot.api.model.Usuario;
import com.SpringBoot.api.service.IUsuarioService;
import java.util.List;
import java.util.Optional;
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
public class UsuarioController {
    
    @Autowired
    private IUsuarioService usuarioServ;
    
    @GetMapping("/usuario/ver")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioServ.verUsuario();
    }
    @PostMapping("/usuario/new")
    public void agregarUsuario(@RequestBody Usuario usuario){
        usuarioServ.crearUsuario(usuario);
    }
    
    @DeleteMapping("/usuario/delete/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
      
        
    }
    @PostMapping("/login")
    public Optional login(@RequestBody Usuario usuario){
        return usuarioServ.buscarEmailPass(usuario);
        
    }
    
          
    
    
}

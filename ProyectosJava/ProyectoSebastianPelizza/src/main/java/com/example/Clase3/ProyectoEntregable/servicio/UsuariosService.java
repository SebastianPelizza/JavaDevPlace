package com.example.Clase3.ProyectoEntregable.servicio;

import com.example.Clase3.ProyectoEntregable.repositorio.UsuariosRepository;

public class UsuariosService{
    private UsuariosRepository usuariosRepository;

    public UsuariosService() {
    }

    public boolean login(String cuil, String password){
        //Logica de un login
        return usuariosRepository.login(cuil,password);
    }
}

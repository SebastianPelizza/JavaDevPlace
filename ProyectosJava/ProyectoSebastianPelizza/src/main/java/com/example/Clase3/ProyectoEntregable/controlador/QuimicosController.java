package com.example.Clase3.ProyectoEntregable.controlador;

import com.example.Clase3.ProyectoEntregable.servicio.UsuariosService;

public class QuimicosController {

    private UsuariosService usuariosService;

    public QuimicosController() {
    }

    public boolean login (String cuil, String password){
        return usuariosService.login(cuil, password);
    }
}

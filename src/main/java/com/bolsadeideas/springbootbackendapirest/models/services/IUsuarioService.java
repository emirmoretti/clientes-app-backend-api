package com.bolsadeideas.springbootbackendapirest.models.services;

import com.bolsadeideas.springbootbackendapirest.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);

}

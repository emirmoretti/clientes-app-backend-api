package com.bolsadeideas.springbootbackendapirest.models.services;

import com.bolsadeideas.springbootbackendapirest.models.entity.Cliente;
import com.bolsadeideas.springbootbackendapirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public Cliente findById(Long id);
    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pagleable);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public List<Region> findAllRegiones();

}

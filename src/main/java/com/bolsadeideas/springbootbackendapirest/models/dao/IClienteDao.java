package com.bolsadeideas.springbootbackendapirest.models.dao;

import com.bolsadeideas.springbootbackendapirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long> {
}

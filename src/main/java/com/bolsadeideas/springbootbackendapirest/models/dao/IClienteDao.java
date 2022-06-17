package com.bolsadeideas.springbootbackendapirest.models.dao;

import com.bolsadeideas.springbootbackendapirest.models.entity.Cliente;
import com.bolsadeideas.springbootbackendapirest.models.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long> {
    @Query("from Region")
    public List<Region> findAllRegiones();
}

package com.bolsadeideas.springbootbackendapirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 20)
    private String nombre;
    /* el dueño de la relacion es la tabla usuario, y role es la relacion inversa
    @ManyToMany(mappedBy="roles") NOMBRE DEL ATRIBUTO QUE CONTIENE LA OTRA COSA DUEÑA DE LA RELACION
                                    solo importa en la clase usuario obtener sus roles
    private List<Usuario> usuarios;
    */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

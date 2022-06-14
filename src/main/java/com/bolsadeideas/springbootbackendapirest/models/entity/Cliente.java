package com.bolsadeideas.springbootbackendapirest.models.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotEmpty(message = "no puede estar vacio")
    @Size(min = 4, max = 12)
    private String nombre;
    @NotEmpty(message = "no puede estar vacio")
    private String apellido;
    @Column(nullable = false, unique = false) /*Unique true para que solo exista ese email*/
    @NotEmpty(message = "no puede estar vacio")
    @Email
    private String email;
    @NotNull(message = "no puede estar vacio")
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date date;

    private String foto;

    //@PrePersist
    public void prePersist(){
        date = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String firstname) {
        this.nombre = firstname;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String lastname) {
        this.apellido = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date createAt) {
        this.date = createAt;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    private static final long serialVersionUID = 1L;
}

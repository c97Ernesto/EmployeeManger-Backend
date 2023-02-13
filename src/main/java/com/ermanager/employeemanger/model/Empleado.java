package com.ermanager.employeemanger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Empleado implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String email;
    private String tituloTrabajo;
    private String telefono;
    private String urlImagen;
    @Column(nullable = false, updatable = false)
    private String codigoEmpleado;

    
    public Empleado() {
    }
    public Empleado(Long id, String nombre, String email, String tituloTrabajo, String telefono, String urlImagen, String codigoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tituloTrabajo = tituloTrabajo;
        this.telefono = telefono;
        this.urlImagen = urlImagen;
        this.codigoEmpleado = codigoEmpleado;
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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTituloTrabajo() {
        return tituloTrabajo;
    }
    public void setTituloTrabajo(String tituloTrabajo) {
        this.tituloTrabajo = tituloTrabajo;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", email=" + email +
                ", tituloTrabajo=" + tituloTrabajo +
                ", telefono=" + telefono +
                ", ulrImagen=" + urlImagen +
                '}';
    }
    
}

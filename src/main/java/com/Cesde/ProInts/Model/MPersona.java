package com.Cesde.ProInts.Model;

public class MPersona {

    protected String nombre;
    protected String email;
    protected String id;
    protected String celular;
    protected String rol;

    // Constructor vacío
    public MPersona() {
    }

    // Constructor con parámetros
    public MPersona(String nombre, String email, String id, String celular, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.celular = celular;
        this.rol = rol;
    }

    // Getters y Setters
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}

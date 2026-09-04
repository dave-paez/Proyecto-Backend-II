package com.Cesde.ProInts.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="Recurso")
public class MRecursos {

   
    public MRecursos(String id, String nombre, String categoria, Boolean estado, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    @Id
    @Column(length = 15,nullable = false)
    private String id;
    @Column(length = 100,nullable = false)
    private String nombre;
    @Column(length = 100,nullable = false)
    private String categoria;
    @Column(nullable = false)
    private Boolean estado; 
     @Column(length = 100,nullable = false)
    private String ubicacion;

 public MRecursos() {
    }

 public String getId() {
    return id;
 }

 public void setId(String id) {
    this.id = id;
 }

 public String getNombre() {
    return nombre;
 }

 public void setNombre(String nombre) {
    this.nombre = nombre;
 }

 public String getCategoria() {
    return categoria;
 }

 public void setCategoria(String categoria) {
    this.categoria = categoria;
 }

 public Boolean getEstado() {
    return estado;
 }

 public void setEstado(Boolean estado) {
    this.estado = estado;
 }

 public String getUbicacion() {
    return ubicacion;
 }

 public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
 }

    

}
package com.Cesde.ProInts.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="Recurso")
public class MRecursos {

    @Id
    @Column(length = 15,nullable = false)
    private String idrecurso;
    @Column(length = 100,nullable = false)
    private String nomrecurso;
    @Column(length = 100,nullable = false)
    private String tiporecurso;
    @Column(length = 100,nullable = false)
    private Boolean estado;   
    @Column(nullable = false)
    private LocalDate fechainicio;
    @Column(nullable = false)
    private LocalDate fechafin;

    // CONSTRUCTORES


    public MRecursos() {
    }

    public MRecursos(Boolean estado, String idrecurso, String nomrecurso, String tiporecurso, LocalDate fechainicio, LocalDate fechafin) {
        this.estado = estado;
        this.idrecurso = idrecurso;
        this.nomrecurso = nomrecurso;
        this.tiporecurso = tiporecurso;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    // ENCASUPLAMIENTO GETTERS Y SETTERS

    public String getIdrecurso() {
        return idrecurso;
    }

    public void setIdrecurso(String idrecurso) {
        this.idrecurso = idrecurso;
    }

    public String getNomrecurso() {
        return nomrecurso;
    }

    public void setNomrecurso(String nomrecurso) {
        this.nomrecurso = nomrecurso;
    }

    public String getTiporecurso() {
        return tiporecurso;
    }

    public void setTiporecurso(String tiporecurso) {
        this.tiporecurso = tiporecurso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }


   

}
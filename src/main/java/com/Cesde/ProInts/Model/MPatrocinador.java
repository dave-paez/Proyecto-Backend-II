package com.Cesde.ProInts.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "patrocinador")
@PrimaryKeyJoinColumn(name = "id")
public class MPatrocinador extends MPersona {

    private String contactoPatrocinador;
    private String tipoPatrocinador;
    private String aportePatrocinador;

    @ManyToMany
    @JoinTable(
        name = "patrocinador_persona",
        joinColumns = @JoinColumn(name = "patrocinador_id"),
        inverseJoinColumns = @JoinColumn(name = "persona_id")
    )
    private List<MPersona> personasPatrocinadas = new ArrayList<>();

    // Constructor vacío
    public MPatrocinador() {
        super();
    }

    // Constructor con parámetros
    public MPatrocinador(String nombre, String email, String id, String celular, String rol,
            String contactoPatrocinador, String tipoPatrocinador, String aportePatrocinador) {
        super(nombre, email, id, celular, rol);
        this.contactoPatrocinador = contactoPatrocinador;
        this.tipoPatrocinador = tipoPatrocinador;
        this.aportePatrocinador = aportePatrocinador;
    }

    // Getters y Setters
    public String getContactoPatrocinador() {
        return contactoPatrocinador;
    }

    public void setContactoPatrocinador(String contactoPatrocinador) {
        this.contactoPatrocinador = contactoPatrocinador;
    }

    public String getTipoPatrocinador() {
        return tipoPatrocinador;
    }

    public void setTipoPatrocinador(String tipoPatrocinador) {
        this.tipoPatrocinador = tipoPatrocinador;
    }

    public String getAportePatrocinador() {
        return aportePatrocinador;
    }

    public void setAportePatrocinador(String aportePatrocinador) {
        this.aportePatrocinador = aportePatrocinador;
    }

    public List<MPersona> getPersonasPatrocinadas() {
        return personasPatrocinadas;
    }

    public void setPersonasPatrocinadas(List<MPersona> personasPatrocinadas) {
        this.personasPatrocinadas = personasPatrocinadas;
    }

}

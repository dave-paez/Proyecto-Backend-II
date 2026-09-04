package com.Cesde.ProInts.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cesde.ProInts.Model.MPatrocinador;
import com.Cesde.ProInts.Repository.RPatrocinador;

@Service
public class SPatrocinador {

    @Autowired
    private RPatrocinador rPatrocinador;

    public List<MPatrocinador> listar() {
        return rPatrocinador.findAll();
    }

    public Optional<MPatrocinador> buscarPorId(String id) {
        return rPatrocinador.findById(id);
    }

    public MPatrocinador guardar(MPatrocinador patrocinador) {
        return rPatrocinador.save(patrocinador);
    }

    public void eliminar(String id) {
        rPatrocinador.deleteById(id);
    }

}

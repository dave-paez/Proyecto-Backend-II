package com.Cesde.ProInts.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cesde.ProInts.Model.MPatrocinador;
import com.Cesde.ProInts.Service.SPatrocinador;

@RestController
@RequestMapping("/api/patrocinadores")
public class CPatrocinador {

    @Autowired
    private SPatrocinador sPatrocinador;

    @GetMapping
    public List<MPatrocinador> listar() {
        return sPatrocinador.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MPatrocinador> buscarPorId(@PathVariable String id) {
        Optional<MPatrocinador> patrocinador = sPatrocinador.buscarPorId(id);
        return patrocinador.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public MPatrocinador crear(@RequestBody MPatrocinador patrocinador) {
        return sPatrocinador.guardar(patrocinador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MPatrocinador> actualizar(@PathVariable String id, @RequestBody MPatrocinador patrocinador) {
        if (sPatrocinador.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        patrocinador.setId(id);
        return ResponseEntity.ok(sPatrocinador.guardar(patrocinador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        if (sPatrocinador.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        sPatrocinador.eliminar(id);
        return ResponseEntity.noContent().build();
    }

}

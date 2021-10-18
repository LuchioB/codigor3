/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.web;

import Reto3_domingo.Reto3_domingo.Services.CategoryServie;
import Reto3_domingo.Reto3_domingo.modelo.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PERSONALCASA
 */

@RestController
@RequestMapping("/api/Category")
public class webCategoria {
    @Autowired
    private CategoryServie servie;
    @GetMapping("/all")
    public List<Categoria>getCategoria(){
        return servie.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Categoria>getCategoria(@PathVariable("id")int idCategory){
        return servie.getCategoria(idCategory);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save (@RequestBody Categoria categoria) {
        return servie.save(categoria);
        
    }
}

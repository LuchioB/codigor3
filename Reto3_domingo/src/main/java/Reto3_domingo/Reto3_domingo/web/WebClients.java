/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.web;

import Reto3_domingo.Reto3_domingo.Services.ClientsService;
import Reto3_domingo.Reto3_domingo.modelo.Clients;
import Reto3_domingo.Reto3_domingo.modelo.Ortesis;
import java.util.List;
import java.util.Optional;
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
@RequestMapping("/api/Client")
public class WebClients {
    private ClientsService servicios;
    @GetMapping("/all")
    public List<Clients> getClients(){
        return servicios.getAll();
    }
   @GetMapping("/(id)")
    public Optional<Clients> getClients(@PathVariable("id")int idclients){
        return servicios.getClients(idclients); 
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Clients save(@RequestBody Clients clients) {
        return servicios.save(clients);
    }
}

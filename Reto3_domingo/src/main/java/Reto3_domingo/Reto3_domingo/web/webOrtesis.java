package Reto3_domingo.Reto3_domingo.web;


import Reto3_domingo.Reto3_domingo.Services.ortesisService;
import Reto3_domingo.Reto3_domingo.modelo.Ortesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Ortopedic/save")
public class webOrtesis {
    @Autowired
    private ortesisService servicios;
    @GetMapping("/all")
    public List<Ortesis> getOrtesis(){
        return servicios.getAll();
    }

    @GetMapping("/(id)")
    public Optional<Ortesis> getOrtesis(@PathVariable("id")int idOrtesis){
        return servicios.getOrtesis(idOrtesis);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortesis save(@RequestBody Ortesis ortesis) {
        return servicios.save(ortesis);
    }

}

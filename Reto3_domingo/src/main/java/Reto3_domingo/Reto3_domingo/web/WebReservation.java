/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.web;

import Reto3_domingo.Reto3_domingo.Services.ReservationService;
import Reto3_domingo.Reto3_domingo.modelo.Reservation;
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
@RequestMapping("/api/Reservation")
public class WebReservation {

    private ReservationService service;
    @GetMapping("/all")
    public List<Reservation> getResevation(){
        return service.getAll();
    }
    @GetMapping("/(id)")
    public Optional<Reservation> getReservation(@PathVariable("id")int idReservation){
        return service.getReservation(idReservation); 
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation) {
        return service.save(reservation);
    }
}

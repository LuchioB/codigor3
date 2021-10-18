/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Repository;

import Reto3_domingo.Reto3_domingo.Interface.ReservationInterface;
import Reto3_domingo.Reto3_domingo.modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PERSONALCASA
 */

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationInterface crud;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) crud.findAll();
    }
    public Optional <Reservation> getReservation(int id){
        return crud.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return crud.save(reservation);
    }
}

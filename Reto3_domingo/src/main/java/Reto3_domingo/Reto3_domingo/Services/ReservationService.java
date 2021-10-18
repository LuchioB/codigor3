/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Services;

import Reto3_domingo.Reto3_domingo.Repository.ReservationRepository;
import Reto3_domingo.Reto3_domingo.modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PERSONALCASA
 */
@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository metodsCrud;
    
    public List<Reservation> getAll(){
        return metodsCrud.getAll();
    }
    public Optional<Reservation> getReservation(int idReservation){
        return metodsCrud.getReservation(idReservation);
    }
   public Reservation save(Reservation reservation){
       
       if (reservation.getIdReservation()==null){
           return metodsCrud.save(reservation);        
       }else{
           Optional<Reservation> evt=metodsCrud.getReservation(reservation.getIdReservation());
           if(evt.isEmpty()){
               return metodsCrud.save(reservation);
           }else{
               return reservation;
           }
       }
   }

}

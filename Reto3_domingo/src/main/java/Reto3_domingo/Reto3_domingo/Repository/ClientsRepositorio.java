/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Repository;

import Reto3_domingo.Reto3_domingo.Interface.ClientsInterface;
import Reto3_domingo.Reto3_domingo.modelo.Clients;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PERSONALCASA
 */
@Repository
public class ClientsRepositorio {
    @Autowired
    private ClientsInterface crud;

    public List<Clients> getAll(){
        return (List<Clients>) crud.findAll();
    }

    public Optional <Clients> getClients(int id){
        return crud.findById(id);
    }
    public Clients save(Clients clients){
        return crud.save(clients);
}
    
}

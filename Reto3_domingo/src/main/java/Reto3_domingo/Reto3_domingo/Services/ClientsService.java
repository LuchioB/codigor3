/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Services;

import Reto3_domingo.Reto3_domingo.Repository.CategoriaRepositorio;
import Reto3_domingo.Reto3_domingo.Repository.ClientsRepositorio;
import Reto3_domingo.Reto3_domingo.modelo.Categoria;
import Reto3_domingo.Reto3_domingo.modelo.Clients;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PERSONALCASA
 */
@Service
public class ClientsService {
    
    @Autowired
   private ClientsRepositorio metodsCrud;
    public List<Clients>getAll(){
        return metodsCrud.getAll();
    }
    
    public Optional<Clients>getClients(int idclients){
        return metodsCrud.getClients(idclients);
    }
    public Clients save (Clients clients){
        if(clients.getIdclients()==null){
            return metodsCrud.save(clients);
        }else{
            Optional<Clients> evt=metodsCrud.getClients(clients.getIdclients());
            if(evt.isEmpty()){
                return metodsCrud.save(clients);
            }else{
                return clients;
            }
        }
    }
}


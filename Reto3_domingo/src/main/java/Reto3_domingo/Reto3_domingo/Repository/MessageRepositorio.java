/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Repository;

import Reto3_domingo.Reto3_domingo.Interface.MessageInterface;
import Reto3_domingo.Reto3_domingo.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PERSONALCASA
 */

@Repository
public class MessageRepositorio {
    
    @Autowired
    private MessageInterface crud;
    
    public List<Message> getAll(){
        return (List<Message>) crud.findAll();
    }
    public Optional <Message> getMessage(int id){
        return crud.findById(id);
    }
    public Message save(Message message){
        return crud.save(message);
    }
}

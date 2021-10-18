/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Services;

import Reto3_domingo.Reto3_domingo.Repository.MessageRepositorio;
import Reto3_domingo.Reto3_domingo.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PERSONALCASA
 */
@Service
public class MessageService {
    
    @Autowired
    private MessageRepositorio metodsCrud;
    public List<Message>getAll(){
        return metodsCrud.getAll();
    }
    
    public Optional<Message>getMessage(int idMessage){
        return metodsCrud.getMessage(idMessage);
    }
    
    public Message save (Message message){
        if(message.getIdMessage()==null){
            return metodsCrud.save(message);
        }else{
            Optional<Message> evt=metodsCrud.getMessage(message.getIdMessage());
            if(evt.isEmpty()){
                return metodsCrud.save(message);
            }else{
                return message;
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.web;

import Reto3_domingo.Reto3_domingo.Services.MessageService;
import Reto3_domingo.Reto3_domingo.modelo.Message;
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
@RequestMapping("/api/Message")
public class WebMessage {
    private MessageService service;
    @GetMapping("/all")
    public List<Message> getMessage(){
        return service.getAll();
    }
    @GetMapping("/(id)")
    public Optional<Message> getMessage(@PathVariable("id")int idMessage){
        return service.getMessage(idMessage); 
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message) {
        return service.save(message);
    }
}

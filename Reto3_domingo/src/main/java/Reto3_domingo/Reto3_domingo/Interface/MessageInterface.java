/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Interface;

import Reto3_domingo.Reto3_domingo.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PERSONALCASA
 */
public interface MessageInterface extends CrudRepository<Message, Integer>{
    
}

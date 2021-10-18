/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_domingo.Reto3_domingo.Services;

import Reto3_domingo.Reto3_domingo.Repository.CategoriaRepositorio;
import Reto3_domingo.Reto3_domingo.modelo.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PERSONALCASA
 */

@Service
public class CategoryServie {
    @Autowired
   private CategoriaRepositorio metodsCrud;
    public List<Categoria>getAll(){
        return metodsCrud.getAll();
        
    }
    
    public Optional<Categoria>getCategoria(int idCategoria){
        return metodsCrud.getCategoria(idCategoria);
    }
    public Categoria save (Categoria categoria){
        if(categoria.getIdCategory()==null){
            return metodsCrud.save(categoria);
        }else{
            Optional<Categoria> evt=metodsCrud.getCategoria(categoria.getIdCategory());
            if(evt.isEmpty()){
                return metodsCrud.save(categoria);
            }else{
                return categoria;
            }
        }
    }
}

package Reto3_domingo.Reto3_domingo.Repository;


import Reto3_domingo.Reto3_domingo.Interface.CategoryInterfae;
import Reto3_domingo.Reto3_domingo.modelo.Categoria;
import Reto3_domingo.Reto3_domingo.modelo.Ortesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepositorio {

    @Autowired
    private CategoryInterfae crud;

    public List<Categoria>getAll(){
        return (List<Categoria>) crud.findAll();
    }

    public Optional<Categoria>getCategoria(int id){
        return crud.findById(id);
    }
    public Categoria save(Categoria categoria){
        return crud.save(categoria);
    }
}

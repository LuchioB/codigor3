package Reto3_domingo.Reto3_domingo.Repository;


import Reto3_domingo.Reto3_domingo.Interface.OrtesisInterface;
import Reto3_domingo.Reto3_domingo.modelo.Ortesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrtesisRepository {
    @Autowired
    private OrtesisInterface crud;

    public List<Ortesis> getAll(){
        return (List<Ortesis>) crud.findAll();
    }

    public Optional <Ortesis> getOrtesis(int id){
        return crud.findById(id);
    }
    public Ortesis save(Ortesis ortesis){
        return crud.save(ortesis);
    }
}

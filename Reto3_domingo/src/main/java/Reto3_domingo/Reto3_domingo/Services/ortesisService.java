package Reto3_domingo.Reto3_domingo.Services;

import Reto3_domingo.Reto3_domingo.Repository.OrtesisRepository;
import Reto3_domingo.Reto3_domingo.modelo.Ortesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ortesisService {
    @Autowired
    private OrtesisRepository metodsCrud;

    public List<Ortesis> getAll(){
        return metodsCrud.getAll();
    }
    public Optional<Ortesis> getOrtesis(int idOrtesis){
        return metodsCrud.getOrtesis(idOrtesis);
            }
    public Ortesis save (Ortesis ortesis){
        if (ortesis.getIdOrtesis()==null) {
            return metodsCrud.save(ortesis);           
        }else{
            Optional<Ortesis>evt=metodsCrud.getOrtesis(ortesis.getIdOrtesis());
            if (evt.isEmpty()) {
                return metodsCrud.save(ortesis);                
            }else{
                return ortesis;
            }
        }
        
    }

    


}


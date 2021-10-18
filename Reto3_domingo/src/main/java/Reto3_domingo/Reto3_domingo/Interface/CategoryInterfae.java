package Reto3_domingo.Reto3_domingo.Interface;

import Reto3_domingo.Reto3_domingo.modelo.Categoria;
import Reto3_domingo.Reto3_domingo.modelo.Ortesis;
import org.springframework.data.repository.CrudRepository;

public interface CategoryInterfae extends CrudRepository<Categoria, Integer> {
}

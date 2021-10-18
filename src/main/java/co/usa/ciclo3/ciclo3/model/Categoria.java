package co.usa.ciclo3.ciclo3.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name="categoria")
public class Categoria implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ortopedic> getOrtopedic(){
        return Ortopedic;
    }
    public void setOrtopedic(List<Ortopedic>)

}

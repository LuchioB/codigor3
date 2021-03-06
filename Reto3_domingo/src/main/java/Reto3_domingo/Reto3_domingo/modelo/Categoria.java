package Reto3_domingo.Reto3_domingo.modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue
    private Integer idCategory;
    private String name;
    private String description;

    @OneToMany (cascade={CascadeType.PERSIST},mappedBy = "categoria")
    @JsonIgnoreProperties("Ortesis")
    private List<Ortesis> ortesis;

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
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

    public List<Ortesis> getOrtesis() {
        return ortesis;
    }

    public void setOrtesis(List<Ortesis> ortesis) {
        this.ortesis = ortesis;
    }
}

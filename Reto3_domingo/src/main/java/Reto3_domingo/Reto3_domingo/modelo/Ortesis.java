package Reto3_domingo.Reto3_domingo.modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ortesis")
public class Ortesis implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idOrtesis;
    private String  brand;
    private String  name;
    private Integer year;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "idCategory")
    @JsonIgnoreProperties("categoria")
    private Categoria categoria;

    public Integer getIdOrtesis() {
        return idOrtesis;
    }

    public void setIdOrtesis(Integer idOrtesis) {
        this.idOrtesis = idOrtesis;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   

   

}

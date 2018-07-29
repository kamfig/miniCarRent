package pl.KamilF.miniSelfProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Typ {
    @OneToMany(mappedBy = "typ")
    List<Model> models;

    public List<Model>getModels(){
        return models;
        }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}

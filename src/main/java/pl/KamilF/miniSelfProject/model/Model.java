package pl.KamilF.miniSelfProject.model;

import javax.persistence.*;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private int year;
    private int doorNumber;

    @OneToOne Typ typ;

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", doorNumber=" + doorNumber +
                ", typ=" + typ +
                '}';
    }
}

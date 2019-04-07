package pl.javastart.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sklep {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nazwa;
    private String miasto;
    private String ulica;
    private String nrBudynku;

    public Sklep(){}

    public Sklep(String nazwa, String miasto, String ulica, String nrBudynku) {
        this.nazwa = nazwa;
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrBudynku() {
        return nrBudynku;
    }

    public void setNrBudynku(String nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nrBudynku='" + nrBudynku + '\'' +
                '}';
    }
}

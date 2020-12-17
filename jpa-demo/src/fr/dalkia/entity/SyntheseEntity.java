package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "synthese", schema = "activite", catalog = "activite")
public class SyntheseEntity extends IntEntity {

    private Object dateDebut;
    private Object dateFin;
    private String duree;


    @Basic
    @Column(name = "date_debut", nullable = true)
    public Object getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Object dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Basic
    @Column(name = "date_fin", nullable = true)
    public Object getDateFin() {
        return dateFin;
    }

    public void setDateFin(Object dateFin) {
        this.dateFin = dateFin;
    }

    @Basic
    @Column(name = "duree", nullable = true, length = -1)
    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SyntheseEntity that = (SyntheseEntity) o;
        return id == that.id &&
                Objects.equals(dateDebut, that.dateDebut) &&
                Objects.equals(dateFin, that.dateFin) &&
                Objects.equals(duree, that.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateDebut, dateFin, duree, id);
    }
}

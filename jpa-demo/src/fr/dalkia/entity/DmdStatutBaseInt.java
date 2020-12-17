package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dmd_statut", schema = "activite", catalog = "activite")
public class DmdStatutBaseInt extends IntEntity {

    private String statut;

    @Basic
    @Column(name = "statut", nullable = false, length = -1)
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdStatutBaseInt that = (DmdStatutBaseInt) o;
        return id == that.id &&
                Objects.equals(statut, that.statut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statut);
    }
}

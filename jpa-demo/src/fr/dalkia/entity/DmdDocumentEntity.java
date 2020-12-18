package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dmd_document", schema = "activite", catalog = "activite")
public class DmdDocumentEntity extends UuidEntity{

    private DemandeEntity demande;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdDocumentEntity that = (DmdDocumentEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemande() {
        return demande;
    }

    public void setDemande(DemandeEntity demande) {
        this.demande = demande;
    }

}

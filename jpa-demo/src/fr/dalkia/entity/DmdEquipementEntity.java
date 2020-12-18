package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_equipement", schema = "activite", catalog = "activite")
public class DmdEquipementEntity extends UuidEntity{

    private UUID idEquipement;
    private DemandeEntity demande;


    @Basic
    @Column(name = "id_equipement", nullable = false)
    public UUID getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(UUID idEquipement) {
        this.idEquipement = idEquipement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdEquipementEntity that = (DmdEquipementEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idEquipement, that.idEquipement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idEquipement);
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

package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_equipement", schema = "activite", catalog = "activite")
public class DmdEquipementEntity {
    private UUID id;
    private UUID idEquipement;
    private DemandeEntity demandeByIdDemande;
    private DemandeEntity demandeByIdDemande_0;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id", nullable = false)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
    public DemandeEntity getDemandeByIdDemande() {
        return demandeByIdDemande;
    }

    public void setDemandeByIdDemande(DemandeEntity demandeByIdDemande) {
        this.demandeByIdDemande = demandeByIdDemande;
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemandeByIdDemande_0() {
        return demandeByIdDemande_0;
    }

    public void setDemandeByIdDemande_0(DemandeEntity demandeByIdDemande_0) {
        this.demandeByIdDemande_0 = demandeByIdDemande_0;
    }
}

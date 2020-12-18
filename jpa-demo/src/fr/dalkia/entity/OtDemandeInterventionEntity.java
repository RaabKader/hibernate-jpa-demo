package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_demande_intervention", schema = "activite", catalog = "activite")
@IdClass(OtDemandeInterventionEntityPK.class)
public class OtDemandeInterventionEntity {

    private UUID id;
    private UUID idOt;
    private UUID idDemandeIntervention;

    @Id
    @Column(name = "id", nullable = false)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Id
    @Column(name = "id_ot", nullable = false)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Id
    @Column(name = "id_demande_intervention", nullable = false)
    public UUID getIdDemandeIntervention() {
        return idDemandeIntervention;
    }

    public void setIdDemandeIntervention(UUID idDemandeIntervention) {
        this.idDemandeIntervention = idDemandeIntervention;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtDemandeInterventionEntity that = (OtDemandeInterventionEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idDemandeIntervention, that.idDemandeIntervention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idDemandeIntervention);
    }
}

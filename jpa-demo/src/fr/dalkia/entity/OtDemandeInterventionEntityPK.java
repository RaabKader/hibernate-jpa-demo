package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtDemandeInterventionEntityPK implements Serializable {
    private UUID id;
    private UUID idOt;
    private UUID idDemandeIntervention;

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

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id_ot", nullable = false)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
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
        OtDemandeInterventionEntityPK that = (OtDemandeInterventionEntityPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idDemandeIntervention, that.idDemandeIntervention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idDemandeIntervention);
    }
}

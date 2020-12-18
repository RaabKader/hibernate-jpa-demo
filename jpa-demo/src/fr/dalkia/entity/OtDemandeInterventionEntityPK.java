package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtDemandeInterventionEntityPK implements Serializable {

    private UUID id;
    private UUID idOt;
    private UUID idDemandeIntervention;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdOt() {
        return idOt;
    }
    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

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

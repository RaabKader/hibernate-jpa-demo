package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtFormulaireSaisiEntityPK implements Serializable {

    private UUID idOt;
    private UUID idFormulaire;

    public UUID getIdOt() {
        return idOt;
    }
    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }
    public UUID getIdFormulaire() {
        return idFormulaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtFormulaireSaisiEntityPK that = (OtFormulaireSaisiEntityPK) o;
        return Objects.equals(idOt, that.idOt) &&
                Objects.equals(idFormulaire, that.idFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOt, idFormulaire);
    }
}

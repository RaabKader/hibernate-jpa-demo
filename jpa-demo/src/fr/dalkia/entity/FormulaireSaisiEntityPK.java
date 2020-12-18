package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class FormulaireSaisiEntityPK implements Serializable {

    private UUID idFormulaire;
    private UUID idTypeFormulaire;

    public UUID getIdFormulaire() {
        return idFormulaire;
    }
    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    public UUID getIdTypeFormulaire() {
        return idTypeFormulaire;
    }
    public void setIdTypeFormulaire(UUID idTypeFormulaire) {
        this.idTypeFormulaire = idTypeFormulaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormulaireSaisiEntityPK that = (FormulaireSaisiEntityPK) o;
        return Objects.equals(idFormulaire, that.idFormulaire) &&
                Objects.equals(idTypeFormulaire, that.idTypeFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormulaire, idTypeFormulaire);
    }
}

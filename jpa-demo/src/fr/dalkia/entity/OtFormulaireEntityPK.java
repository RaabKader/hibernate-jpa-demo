package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtFormulaireEntityPK implements Serializable {

    private UUID id;
    private UUID idOt;
    private UUID idFormulaire;

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

    public UUID getIdFormulaire() {
        return idFormulaire;
    }
    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtFormulaireEntityPK that = (OtFormulaireEntityPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idFormulaire, that.idFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idFormulaire);
    }
}

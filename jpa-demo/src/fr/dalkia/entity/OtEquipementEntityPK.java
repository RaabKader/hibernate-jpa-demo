package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtEquipementEntityPK implements Serializable {

    private UUID id;
    private UUID idOt;
    private UUID idEquipement;


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
        OtEquipementEntityPK that = (OtEquipementEntityPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idEquipement, that.idEquipement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idEquipement);
    }
}

package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtInstallationEntityPK implements Serializable {

    private UUID id;
    private UUID idOt;
    private UUID idInstallation;

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

    public UUID getIdInstallation() {
        return idInstallation;
    }
    public void setIdInstallation(UUID idInstallation) {
        this.idInstallation = idInstallation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtInstallationEntityPK that = (OtInstallationEntityPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idInstallation, that.idInstallation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idInstallation);
    }
}

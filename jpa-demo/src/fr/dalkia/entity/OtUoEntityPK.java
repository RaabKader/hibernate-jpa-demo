package fr.dalkia.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtUoEntityPK implements Serializable {

    private UUID id;
    private UUID idOt;
    private UUID idUo;

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

    public UUID getIdUo() {
        return idUo;
    }
    public void setIdUo(UUID idUo) {
        this.idUo = idUo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtUoEntityPK that = (OtUoEntityPK) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idUo, that.idUo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idUo);
    }
}

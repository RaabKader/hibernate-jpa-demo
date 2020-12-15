package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_uo", schema = "activite", catalog = "activite")
@IdClass(OtUoEntityPK.class)
public class OtUoEntity {
    private UUID id;
    private Object idOt;
    private Object idUo;

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
    public Object getIdOt() {
        return idOt;
    }

    public void setIdOt(Object idOt) {
        this.idOt = idOt;
    }

    @Id
    @Column(name = "id_uo", nullable = false)
    public Object getIdUo() {
        return idUo;
    }

    public void setIdUo(Object idUo) {
        this.idUo = idUo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtUoEntity that = (OtUoEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idUo, that.idUo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idUo);
    }
}

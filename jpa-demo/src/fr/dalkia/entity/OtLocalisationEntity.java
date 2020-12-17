package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_localisation", schema = "activite", catalog = "activite")
public class OtLocalisationEntity extends UuidEntity{

    private Object idLocalisation;
    private Object idSite;
    private OtEntity otByIdOt;

    @Basic
    @Column(name = "id_localisation", nullable = true)
    public Object getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(Object idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    @Basic
    @Column(name = "id_site", nullable = true)
    public Object getIdSite() {
        return idSite;
    }

    public void setIdSite(Object idSite) {
        this.idSite = idSite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtLocalisationEntity that = (OtLocalisationEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idLocalisation, that.idLocalisation) &&
                Objects.equals(idSite, that.idSite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idLocalisation, idSite);
    }

    @ManyToOne
    @JoinColumn(name = "id_ot", referencedColumnName = "id")
    public OtEntity getOtByIdOt() {
        return otByIdOt;
    }

    public void setOtByIdOt(OtEntity otByIdOt) {
        this.otByIdOt = otByIdOt;
    }
}

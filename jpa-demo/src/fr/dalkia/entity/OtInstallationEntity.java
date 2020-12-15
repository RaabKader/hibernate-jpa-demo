package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_installation", schema = "activite", catalog = "activite")
@IdClass(OtInstallationEntityPK.class)
public class OtInstallationEntity {
    private UUID id;
    private UUID idOt;
    private UUID idInstallation;
    private OtEntity otByIdOt;

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
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Id
    @Column(name = "id_installation", nullable = false)
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
        OtInstallationEntity that = (OtInstallationEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idInstallation, that.idInstallation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idInstallation);
    }

    @ManyToOne
    @JoinColumn(name = "id_ot", referencedColumnName = "id", nullable = false)
    public OtEntity getOtByIdOt() {
        return otByIdOt;
    }

    public void setOtByIdOt(OtEntity otByIdOt) {
        this.otByIdOt = otByIdOt;
    }
}

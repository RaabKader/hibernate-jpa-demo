package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_equipement", schema = "activite", catalog = "activite")
@IdClass(OtEquipementEntityPK.class)
public class OtEquipementEntity {
    private UUID id;
    private UUID idOt;
    private UUID idEquipement;
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
    @Column(name = "id_equipement", nullable = false)
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
        OtEquipementEntity that = (OtEquipementEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idEquipement, that.idEquipement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idEquipement);
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

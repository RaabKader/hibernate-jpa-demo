package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "wo_sigma_csc", schema = "activite", catalog = "activite")
public class WoSigmaCscEntity {
    private UUID id;
    private UUID idOt;
    private UUID idDemande;
    private UUID idSia;
    private Integer cascadePosition;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id", nullable = false)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_ot", nullable = false)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Basic
    @Column(name = "id_demande", nullable = true)
    public UUID getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(UUID idDemande) {
        this.idDemande = idDemande;
    }

    @Basic
    @Column(name = "id_sia", nullable = true)
    public UUID getIdSia() {
        return idSia;
    }

    public void setIdSia(UUID idSia) {
        this.idSia = idSia;
    }

    @Basic
    @Column(name = "cascade_position", nullable = true)
    public Integer getCascadePosition() {
        return cascadePosition;
    }

    public void setCascadePosition(Integer cascadePosition) {
        this.cascadePosition = cascadePosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WoSigmaCscEntity that = (WoSigmaCscEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idDemande, that.idDemande) &&
                Objects.equals(idSia, that.idSia) &&
                Objects.equals(cascadePosition, that.cascadePosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idDemande, idSia, cascadePosition);
    }
}

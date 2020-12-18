package fr.dalkia.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "releve_temperature", schema = "activite", catalog = "activite")
public class ReleveTemperatureEntity extends UuidEntity{

    private UUID idConditionReleve;
    private ZonedDateTime dateCreation;
    private ZonedDateTime dateModification;
    private String mesureLocalisation;
    private String typeMesure;
    private String libelleTypeMesure;
    private BigInteger mesure;


    @Basic
    @Column(name = "id_condition_releve", nullable = false)
    public UUID getIdConditionReleve() {
        return idConditionReleve;
    }

    public void setIdConditionReleve(UUID idConditionReleve) {
        this.idConditionReleve = idConditionReleve;
    }

    @Basic
    @Column(name = "date_creation", nullable = false)
    public ZonedDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(ZonedDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_modification", nullable = true)
    public ZonedDateTime getDateModification() {
        return dateModification;
    }

    public void setDateModification(ZonedDateTime dateModification) {
        this.dateModification = dateModification;
    }

    @Basic
    @Column(name = "mesure_localisation", nullable = false, length = -1)
    public String getMesureLocalisation() {
        return mesureLocalisation;
    }

    public void setMesureLocalisation(String mesureLocalisation) {
        this.mesureLocalisation = mesureLocalisation;
    }

    @Basic
    @Column(name = "type_mesure", nullable = false, length = -1)
    public String getTypeMesure() {
        return typeMesure;
    }

    public void setTypeMesure(String typeMesure) {
        this.typeMesure = typeMesure;
    }

    @Basic
    @Column(name = "libelle_type_mesure", nullable = true, length = -1)
    public String getLibelleTypeMesure() {
        return libelleTypeMesure;
    }

    public void setLibelleTypeMesure(String libelleTypeMesure) {
        this.libelleTypeMesure = libelleTypeMesure;
    }

    @Basic
    @Column(name = "mesure", nullable = false, precision = 0)
    public BigInteger getMesure() {
        return mesure;
    }

    public void setMesure(BigInteger mesure) {
        this.mesure = mesure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReleveTemperatureEntity that = (ReleveTemperatureEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idConditionReleve, that.idConditionReleve) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(dateModification, that.dateModification) &&
                Objects.equals(mesureLocalisation, that.mesureLocalisation) &&
                Objects.equals(typeMesure, that.typeMesure) &&
                Objects.equals(libelleTypeMesure, that.libelleTypeMesure) &&
                Objects.equals(mesure, that.mesure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idConditionReleve, dateCreation, dateModification, mesureLocalisation, typeMesure, libelleTypeMesure, mesure);
    }
}

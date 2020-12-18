package fr.dalkia.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
@Table(name = "condition_releve", schema = "activite", catalog = "activite")
public class ConditionReleveEntity extends UuidEntity {

    private OffsetDateTime dateCreation;
    private OffsetDateTime dateModification;
    private OffsetDateTime heureMesure;
    private BigInteger temperatureExterieure;
    private String valeurSoleil;
    private String valeurPluie;
    private String valeurVent;
    private String observations;
    private CrEntity cr;


    @Basic
    @Column(name = "date_creation", nullable = false)
    public OffsetDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(OffsetDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_modification", nullable = true)
    public OffsetDateTime getDateModification() {
        return dateModification;
    }

    public void setDateModification(OffsetDateTime dateModification) {
        this.dateModification = dateModification;
    }

    @Basic
    @Column(name = "heure_mesure", nullable = false)
    public OffsetDateTime getHeureMesure() {
        return heureMesure;
    }

    public void setHeureMesure(OffsetDateTime heureMesure) {
        this.heureMesure = heureMesure;
    }

    @Basic
    @Column(name = "temperature_exterieure", nullable = true, precision = 0)
    public BigInteger getTemperatureExterieure() {
        return temperatureExterieure;
    }

    public void setTemperatureExterieure(BigInteger temperatureExterieure) {
        this.temperatureExterieure = temperatureExterieure;
    }

    @Basic
    @Column(name = "valeur_soleil", nullable = true, length = -1)
    public String getValeurSoleil() {
        return valeurSoleil;
    }

    public void setValeurSoleil(String valeurSoleil) {
        this.valeurSoleil = valeurSoleil;
    }

    @Basic
    @Column(name = "valeur_pluie", nullable = true, length = -1)
    public String getValeurPluie() {
        return valeurPluie;
    }

    public void setValeurPluie(String valeurPluie) {
        this.valeurPluie = valeurPluie;
    }

    @Basic
    @Column(name = "valeur_vent", nullable = true, length = -1)
    public String getValeurVent() {
        return valeurVent;
    }

    public void setValeurVent(String valeurVent) {
        this.valeurVent = valeurVent;
    }

    @Basic
    @Column(name = "observations", nullable = true, length = -1)
    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConditionReleveEntity that = (ConditionReleveEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(dateModification, that.dateModification) &&
                Objects.equals(heureMesure, that.heureMesure) &&
                Objects.equals(temperatureExterieure, that.temperatureExterieure) &&
                Objects.equals(valeurSoleil, that.valeurSoleil) &&
                Objects.equals(valeurPluie, that.valeurPluie) &&
                Objects.equals(valeurVent, that.valeurVent) &&
                Objects.equals(observations, that.observations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, dateModification, heureMesure, temperatureExterieure, valeurSoleil, valeurPluie, valeurVent, observations);
    }

    @ManyToOne
    @JoinColumn(name = "id_cr", referencedColumnName = "id", nullable = false)
    public CrEntity getCr() {
        return cr;
    }

    public void setCr(CrEntity cr) {
        this.cr = cr;
    }
}

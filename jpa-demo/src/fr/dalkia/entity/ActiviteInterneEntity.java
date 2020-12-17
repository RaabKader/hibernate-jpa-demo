package fr.dalkia.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "activite_interne", schema = "activite", catalog = "activite")
public class ActiviteInterneEntity extends UuidEntity {

    private ZonedDateTime dateCreation;
    private UUID idIntervenant;
    private String matricule;
    private String email;
    private String origine;
    private boolean planifiee;
    private String idTempo;
    private String typeActiviteInternePlanifiee;
    private ZonedDateTime planificationDateDebut;
    private ZonedDateTime planificationDateFin;

    @Basic
    @Column(name = "date_creation", nullable = false)
    public ZonedDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(ZonedDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "id_intervenant", nullable = false)
    public UUID getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(UUID idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    @Basic
    @Column(name = "matricule", nullable = true, length = -1)
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "origine", nullable = false, length = -1)
    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Basic
    @Column(name = "planifiee", nullable = false)
    public boolean isPlanifiee() {
        return planifiee;
    }

    public void setPlanifiee(boolean planifiee) {
        this.planifiee = planifiee;
    }

    @Basic
    @Column(name = "id_tempo", nullable = true, length = -1)
    public String getIdTempo() {
        return idTempo;
    }

    public void setIdTempo(String idTempo) {
        this.idTempo = idTempo;
    }

    @Basic
    @Column(name = "type_activite_interne_planifiee", nullable = true, length = -1)
    public String getTypeActiviteInternePlanifiee() {
        return typeActiviteInternePlanifiee;
    }

    public void setTypeActiviteInternePlanifiee(String typeActiviteInternePlanifiee) {
        this.typeActiviteInternePlanifiee = typeActiviteInternePlanifiee;
    }

    @Basic
    @Column(name = "planification_date_debut", nullable = true)
    public ZonedDateTime getPlanificationDateDebut() {
        return planificationDateDebut;
    }

    public void setPlanificationDateDebut(ZonedDateTime planificationDateDebut) {
        this.planificationDateDebut = planificationDateDebut;
    }

    @Basic
    @Column(name = "planification_date_fin", nullable = true)
    public ZonedDateTime getPlanificationDateFin() {
        return planificationDateFin;
    }

    public void setPlanificationDateFin(ZonedDateTime planificationDateFin) {
        this.planificationDateFin = planificationDateFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActiviteInterneEntity that = (ActiviteInterneEntity) o;
        return planifiee == that.planifiee &&
                Objects.equals(id, that.id) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(idIntervenant, that.idIntervenant) &&
                Objects.equals(matricule, that.matricule) &&
                Objects.equals(email, that.email) &&
                Objects.equals(origine, that.origine) &&
                Objects.equals(idTempo, that.idTempo) &&
                Objects.equals(typeActiviteInternePlanifiee, that.typeActiviteInternePlanifiee) &&
                Objects.equals(planificationDateDebut, that.planificationDateDebut) &&
                Objects.equals(planificationDateFin, that.planificationDateFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, idIntervenant, matricule, email, origine, planifiee, idTempo, typeActiviteInternePlanifiee, planificationDateDebut, planificationDateFin);
    }
}

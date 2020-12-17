package fr.dalkia.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "cr_activite_interne", schema = "activite", catalog = "activite")
public class CrActiviteInterneEntity extends UuidEntity {

    private UUID idActiviteInterne;
    private OffsetDateTime crDateCreation;
    private String crCommentaireIntervenant;
    private String crTypeActiviteRealisee;
    private OffsetDateTime crActiviteInterneDateDebut;
    private OffsetDateTime crActiviteInterneDateFin;
    private int crActiviteInterneDuree;
    private OffsetDateTime crDeplacementDateDebut;
    private OffsetDateTime crDeplacementDateFin;
    private Integer crDeplacementDuree;
    private int crDureeTotale;

    @Basic
    @Column(name = "id_activite_interne", nullable = false)
    public UUID getIdActiviteInterne() {
        return idActiviteInterne;
    }

    public void setIdActiviteInterne(UUID idActiviteInterne) {
        this.idActiviteInterne = idActiviteInterne;
    }

    @Basic
    @Column(name = "cr_date_creation", nullable = false)
    public OffsetDateTime getCrDateCreation() {
        return crDateCreation;
    }

    public void setCrDateCreation(OffsetDateTime crDateCreation) {
        this.crDateCreation = crDateCreation;
    }

    @Basic
    @Column(name = "cr_commentaire_intervenant", nullable = true, length = -1)
    public String getCrCommentaireIntervenant() {
        return crCommentaireIntervenant;
    }

    public void setCrCommentaireIntervenant(String crCommentaireIntervenant) {
        this.crCommentaireIntervenant = crCommentaireIntervenant;
    }

    @Basic
    @Column(name = "cr_type_activite_realisee", nullable = false, length = -1)
    public String getCrTypeActiviteRealisee() {
        return crTypeActiviteRealisee;
    }

    public void setCrTypeActiviteRealisee(String crTypeActiviteRealisee) {
        this.crTypeActiviteRealisee = crTypeActiviteRealisee;
    }

    @Basic
    @Column(name = "cr_activite_interne_date_debut", nullable = false)
    public OffsetDateTime getCrActiviteInterneDateDebut() {
        return crActiviteInterneDateDebut;
    }

    public void setCrActiviteInterneDateDebut(OffsetDateTime crActiviteInterneDateDebut) {
        this.crActiviteInterneDateDebut = crActiviteInterneDateDebut;
    }

    @Basic
    @Column(name = "cr_activite_interne_date_fin", nullable = false)
    public OffsetDateTime getCrActiviteInterneDateFin() {
        return crActiviteInterneDateFin;
    }

    public void setCrActiviteInterneDateFin(OffsetDateTime crActiviteInterneDateFin) {
        this.crActiviteInterneDateFin = crActiviteInterneDateFin;
    }

    @Basic
    @Column(name = "cr_activite_interne_duree", nullable = false)
    public int getCrActiviteInterneDuree() {
        return crActiviteInterneDuree;
    }

    public void setCrActiviteInterneDuree(int crActiviteInterneDuree) {
        this.crActiviteInterneDuree = crActiviteInterneDuree;
    }

    @Basic
    @Column(name = "cr_deplacement_date_debut", nullable = true)
    public OffsetDateTime getCrDeplacementDateDebut() {
        return crDeplacementDateDebut;
    }

    public void setCrDeplacementDateDebut(OffsetDateTime crDeplacementDateDebut) {
        this.crDeplacementDateDebut = crDeplacementDateDebut;
    }

    @Basic
    @Column(name = "cr_deplacement_date_fin", nullable = true)
    public OffsetDateTime getCrDeplacementDateFin() {
        return crDeplacementDateFin;
    }

    public void setCrDeplacementDateFin(OffsetDateTime crDeplacementDateFin) {
        this.crDeplacementDateFin = crDeplacementDateFin;
    }

    @Basic
    @Column(name = "cr_deplacement_duree", nullable = true)
    public Integer getCrDeplacementDuree() {
        return crDeplacementDuree;
    }

    public void setCrDeplacementDuree(Integer crDeplacementDuree) {
        this.crDeplacementDuree = crDeplacementDuree;
    }

    @Basic
    @Column(name = "cr_duree_totale", nullable = false)
    public int getCrDureeTotale() {
        return crDureeTotale;
    }

    public void setCrDureeTotale(int crDureeTotale) {
        this.crDureeTotale = crDureeTotale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrActiviteInterneEntity that = (CrActiviteInterneEntity) o;
        return crActiviteInterneDuree == that.crActiviteInterneDuree &&
                crDureeTotale == that.crDureeTotale &&
                Objects.equals(id, that.id) &&
                Objects.equals(idActiviteInterne, that.idActiviteInterne) &&
                Objects.equals(crDateCreation, that.crDateCreation) &&
                Objects.equals(crCommentaireIntervenant, that.crCommentaireIntervenant) &&
                Objects.equals(crTypeActiviteRealisee, that.crTypeActiviteRealisee) &&
                Objects.equals(crActiviteInterneDateDebut, that.crActiviteInterneDateDebut) &&
                Objects.equals(crActiviteInterneDateFin, that.crActiviteInterneDateFin) &&
                Objects.equals(crDeplacementDateDebut, that.crDeplacementDateDebut) &&
                Objects.equals(crDeplacementDateFin, that.crDeplacementDateFin) &&
                Objects.equals(crDeplacementDuree, that.crDeplacementDuree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idActiviteInterne, crDateCreation, crCommentaireIntervenant, crTypeActiviteRealisee, crActiviteInterneDateDebut, crActiviteInterneDateFin, crActiviteInterneDuree, crDeplacementDateDebut, crDeplacementDateFin, crDeplacementDuree, crDureeTotale);
    }
}

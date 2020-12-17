package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cr", schema = "activite", catalog = "activite")
public class CrEntity extends UuidEntity {

    private String statutCr;
    private String commentaireClient;
    private String commentaireManager;
    private Object interventionDateDebut;
    private Object interventionDateFin;
    private Integer interventionDuree;
    private Object deplacementDateDebut;
    private Object deplacementDateFin;
    private Integer deplacementDuree;
    private Integer dureeTotale;
    private Object idIntervenant;
    private Object dateCreation;
    private Object dateModificationIntervenant;
    private Object dateModificationMop;
    private Boolean resteAFaire;
    private String origine;
    private Object dateEnvoiVersGmao;
    private boolean chronoUtilise;
    private boolean syntheseTempsModifie;
    private String idCrGmao;
    private String motifCrPartiel;
    private Collection<ConditionReleveEntity> conditionRelevesById;
    private OtEntity otByIdOt;
    private Collection<CrDocumentEntity> crDocumentsById;


    @Basic
    @Column(name = "statut_cr", nullable = true, length = -1)
    public String getStatutCr() {
        return statutCr;
    }

    public void setStatutCr(String statutCr) {
        this.statutCr = statutCr;
    }

    @Basic
    @Column(name = "commentaire_client", nullable = true, length = -1)
    public String getCommentaireClient() {
        return commentaireClient;
    }

    public void setCommentaireClient(String commentaireClient) {
        this.commentaireClient = commentaireClient;
    }

    @Basic
    @Column(name = "commentaire_manager", nullable = true, length = -1)
    public String getCommentaireManager() {
        return commentaireManager;
    }

    public void setCommentaireManager(String commentaireManager) {
        this.commentaireManager = commentaireManager;
    }

    @Basic
    @Column(name = "intervention_date_debut", nullable = true)
    public Object getInterventionDateDebut() {
        return interventionDateDebut;
    }

    public void setInterventionDateDebut(Object interventionDateDebut) {
        this.interventionDateDebut = interventionDateDebut;
    }

    @Basic
    @Column(name = "intervention_date_fin", nullable = true)
    public Object getInterventionDateFin() {
        return interventionDateFin;
    }

    public void setInterventionDateFin(Object interventionDateFin) {
        this.interventionDateFin = interventionDateFin;
    }

    @Basic
    @Column(name = "intervention_duree", nullable = true)
    public Integer getInterventionDuree() {
        return interventionDuree;
    }

    public void setInterventionDuree(Integer interventionDuree) {
        this.interventionDuree = interventionDuree;
    }

    @Basic
    @Column(name = "deplacement_date_debut", nullable = true)
    public Object getDeplacementDateDebut() {
        return deplacementDateDebut;
    }

    public void setDeplacementDateDebut(Object deplacementDateDebut) {
        this.deplacementDateDebut = deplacementDateDebut;
    }

    @Basic
    @Column(name = "deplacement_date_fin", nullable = true)
    public Object getDeplacementDateFin() {
        return deplacementDateFin;
    }

    public void setDeplacementDateFin(Object deplacementDateFin) {
        this.deplacementDateFin = deplacementDateFin;
    }

    @Basic
    @Column(name = "deplacement_duree", nullable = true)
    public Integer getDeplacementDuree() {
        return deplacementDuree;
    }

    public void setDeplacementDuree(Integer deplacementDuree) {
        this.deplacementDuree = deplacementDuree;
    }

    @Basic
    @Column(name = "duree_totale", nullable = true)
    public Integer getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(Integer dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    @Basic
    @Column(name = "id_intervenant", nullable = true)
    public Object getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(Object idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    @Basic
    @Column(name = "date_creation", nullable = true)
    public Object getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Object dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_modification_intervenant", nullable = true)
    public Object getDateModificationIntervenant() {
        return dateModificationIntervenant;
    }

    public void setDateModificationIntervenant(Object dateModificationIntervenant) {
        this.dateModificationIntervenant = dateModificationIntervenant;
    }

    @Basic
    @Column(name = "date_modification_mop", nullable = true)
    public Object getDateModificationMop() {
        return dateModificationMop;
    }

    public void setDateModificationMop(Object dateModificationMop) {
        this.dateModificationMop = dateModificationMop;
    }

    @Basic
    @Column(name = "reste_a_faire", nullable = true)
    public Boolean getResteAFaire() {
        return resteAFaire;
    }

    public void setResteAFaire(Boolean resteAFaire) {
        this.resteAFaire = resteAFaire;
    }

    @Basic
    @Column(name = "origine", nullable = true, length = -1)
    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Basic
    @Column(name = "date_envoi_vers_gmao", nullable = true)
    public Object getDateEnvoiVersGmao() {
        return dateEnvoiVersGmao;
    }

    public void setDateEnvoiVersGmao(Object dateEnvoiVersGmao) {
        this.dateEnvoiVersGmao = dateEnvoiVersGmao;
    }

    @Basic
    @Column(name = "chrono_utilise", nullable = false)
    public boolean isChronoUtilise() {
        return chronoUtilise;
    }

    public void setChronoUtilise(boolean chronoUtilise) {
        this.chronoUtilise = chronoUtilise;
    }

    @Basic
    @Column(name = "synthese_temps_modifie", nullable = false)
    public boolean isSyntheseTempsModifie() {
        return syntheseTempsModifie;
    }

    public void setSyntheseTempsModifie(boolean syntheseTempsModifie) {
        this.syntheseTempsModifie = syntheseTempsModifie;
    }

    @Basic
    @Column(name = "id_cr_gmao", nullable = true, length = -1)
    public String getIdCrGmao() {
        return idCrGmao;
    }

    public void setIdCrGmao(String idCrGmao) {
        this.idCrGmao = idCrGmao;
    }

    @Basic
    @Column(name = "motif_cr_partiel", nullable = true, length = -1)
    public String getMotifCrPartiel() {
        return motifCrPartiel;
    }

    public void setMotifCrPartiel(String motifCrPartiel) {
        this.motifCrPartiel = motifCrPartiel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrEntity crEntity = (CrEntity) o;
        return chronoUtilise == crEntity.chronoUtilise &&
                syntheseTempsModifie == crEntity.syntheseTempsModifie &&
                Objects.equals(id, crEntity.id) &&
                Objects.equals(statutCr, crEntity.statutCr) &&
                Objects.equals(commentaireClient, crEntity.commentaireClient) &&
                Objects.equals(commentaireManager, crEntity.commentaireManager) &&
                Objects.equals(interventionDateDebut, crEntity.interventionDateDebut) &&
                Objects.equals(interventionDateFin, crEntity.interventionDateFin) &&
                Objects.equals(interventionDuree, crEntity.interventionDuree) &&
                Objects.equals(deplacementDateDebut, crEntity.deplacementDateDebut) &&
                Objects.equals(deplacementDateFin, crEntity.deplacementDateFin) &&
                Objects.equals(deplacementDuree, crEntity.deplacementDuree) &&
                Objects.equals(dureeTotale, crEntity.dureeTotale) &&
                Objects.equals(idIntervenant, crEntity.idIntervenant) &&
                Objects.equals(dateCreation, crEntity.dateCreation) &&
                Objects.equals(dateModificationIntervenant, crEntity.dateModificationIntervenant) &&
                Objects.equals(dateModificationMop, crEntity.dateModificationMop) &&
                Objects.equals(resteAFaire, crEntity.resteAFaire) &&
                Objects.equals(origine, crEntity.origine) &&
                Objects.equals(dateEnvoiVersGmao, crEntity.dateEnvoiVersGmao) &&
                Objects.equals(idCrGmao, crEntity.idCrGmao) &&
                Objects.equals(motifCrPartiel, crEntity.motifCrPartiel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statutCr, commentaireClient, commentaireManager, interventionDateDebut, interventionDateFin, interventionDuree, deplacementDateDebut, deplacementDateFin, deplacementDuree, dureeTotale, idIntervenant, dateCreation, dateModificationIntervenant, dateModificationMop, resteAFaire, origine, dateEnvoiVersGmao, chronoUtilise, syntheseTempsModifie, idCrGmao, motifCrPartiel);
    }

    @OneToMany(mappedBy = "crByIdCr")
    public Collection<ConditionReleveEntity> getConditionRelevesById() {
        return conditionRelevesById;
    }

    public void setConditionRelevesById(Collection<ConditionReleveEntity> conditionRelevesById) {
        this.conditionRelevesById = conditionRelevesById;
    }

    @ManyToOne
    @JoinColumn(name = "id_ot", referencedColumnName = "id")
    public OtEntity getOtByIdOt() {
        return otByIdOt;
    }

    public void setOtByIdOt(OtEntity otByIdOt) {
        this.otByIdOt = otByIdOt;
    }

    @OneToMany(mappedBy = "crByIdCr")
    public Collection<CrDocumentEntity> getCrDocumentsById() {
        return crDocumentsById;
    }

    public void setCrDocumentsById(Collection<CrDocumentEntity> crDocumentsById) {
        this.crDocumentsById = crDocumentsById;
    }
}

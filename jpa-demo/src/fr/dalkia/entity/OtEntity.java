package fr.dalkia.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot", schema = "activite", catalog = "activite")
public class OtEntity extends UuidEntity{

    private String idGmao;
    private String idInstanceGmao;
    private ZonedDateTime dateImport;
    private String numeroOt;
    private String typeActivite;
    private String periodiciteCode;
    private String periodiciteLibelle;
    private String priorite;
    private String libelleIntervention;
    private String description;
    private String conditionSla;
    private Boolean existanceSla;
    private boolean multiIntervenant;
    private ZonedDateTime dateModification;
    private String idOtParentGmao;
    private ZonedDateTime previsionDateDebut;
    private ZonedDateTime previsionDateFin;
    private String previsionDuree;
    private ZonedDateTime planDateDebut;
    private ZonedDateTime planDateFin;
    private String idAuteurGmao;
    private Boolean idAuteurOtDlk;
    private Boolean estRdvClient;
    private Boolean estControleReglementaire;
    private String statutOt;
    private ZonedDateTime statutDateValidationMop;
    private ZonedDateTime statutDateClotureIntervenant;
    private ZonedDateTime statutDateCreation;
    private String origine;
    private ZonedDateTime dateEnvoiVersGmao;
    private ZonedDateTime dateMajVersGmao;
    private Boolean statutRealisationPartiel;
    private UUID idOtParentDlk;
    private String numeroOtParent;
    private String canalModification;
    private String typeActiviteSigma;
    private ZonedDateTime datePlafond;
    private ZonedDateTime datePlancher;
    private String numeroOtCsc;
    private String typologie;
    private String sousTypologie;
    private String libelleOrigine;
    private String numeroFicheMp;
    private String numeroGamme;
    private String numeroArret;
    private ZonedDateTime dateEnvoiVersPivot;
    private DemandeEntity demande;

    @Basic
    @Column(name = "id_gmao", nullable = true, length = -1)
    public String getIdGmao() {
        return idGmao;
    }

    public void setIdGmao(String idGmao) {
        this.idGmao = idGmao;
    }

    @Basic
    @Column(name = "id_instance_gmao", nullable = true, length = -1)
    public String getIdInstanceGmao() {
        return idInstanceGmao;
    }

    public void setIdInstanceGmao(String idInstanceGmao) {
        this.idInstanceGmao = idInstanceGmao;
    }

    @Basic
    @Column(name = "date_import", nullable = false)
    public ZonedDateTime getDateImport() {
        return dateImport;
    }

    public void setDateImport(ZonedDateTime dateImport) {
        this.dateImport = dateImport;
    }

    @Basic
    @Column(name = "numero_ot", nullable = true, length = -1)
    public String getNumeroOt() {
        return numeroOt;
    }

    public void setNumeroOt(String numeroOt) {
        this.numeroOt = numeroOt;
    }

    @Basic
    @Column(name = "type_activite", nullable = false, length = -1)
    public String getTypeActivite() {
        return typeActivite;
    }

    public void setTypeActivite(String typeActivite) {
        this.typeActivite = typeActivite;
    }

    @Basic
    @Column(name = "periodicite_code", nullable = true, length = -1)
    public String getPeriodiciteCode() {
        return periodiciteCode;
    }

    public void setPeriodiciteCode(String periodiciteCode) {
        this.periodiciteCode = periodiciteCode;
    }

    @Basic
    @Column(name = "periodicite_libelle", nullable = true, length = -1)
    public String getPeriodiciteLibelle() {
        return periodiciteLibelle;
    }

    public void setPeriodiciteLibelle(String periodiciteLibelle) {
        this.periodiciteLibelle = periodiciteLibelle;
    }

    @Basic
    @Column(name = "priorite", nullable = true, length = -1)
    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    @Basic
    @Column(name = "libelle_intervention", nullable = true, length = -1)
    public String getLibelleIntervention() {
        return libelleIntervention;
    }

    public void setLibelleIntervention(String libelleIntervention) {
        this.libelleIntervention = libelleIntervention;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "condition_sla", nullable = true, length = -1)
    public String getConditionSla() {
        return conditionSla;
    }

    public void setConditionSla(String conditionSla) {
        this.conditionSla = conditionSla;
    }

    @Basic
    @Column(name = "existance_sla", nullable = true)
    public Boolean getExistanceSla() {
        return existanceSla;
    }

    public void setExistanceSla(Boolean existanceSla) {
        this.existanceSla = existanceSla;
    }

    @Basic
    @Column(name = "multi_intervenant", nullable = false)
    public boolean isMultiIntervenant() {
        return multiIntervenant;
    }

    public void setMultiIntervenant(boolean multiIntervenant) {
        this.multiIntervenant = multiIntervenant;
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
    @Column(name = "id_ot_parent_gmao", nullable = true, length = -1)
    public String getIdOtParentGmao() {
        return idOtParentGmao;
    }

    public void setIdOtParentGmao(String idOtParentGmao) {
        this.idOtParentGmao = idOtParentGmao;
    }

    @Basic
    @Column(name = "prevision_date_debut", nullable = true)
    public ZonedDateTime getPrevisionDateDebut() {
        return previsionDateDebut;
    }

    public void setPrevisionDateDebut(ZonedDateTime previsionDateDebut) {
        this.previsionDateDebut = previsionDateDebut;
    }

    @Basic
    @Column(name = "prevision_date_fin", nullable = true)
    public ZonedDateTime getPrevisionDateFin() {
        return previsionDateFin;
    }

    public void setPrevisionDateFin(ZonedDateTime previsionDateFin) {
        this.previsionDateFin = previsionDateFin;
    }

    @Basic
    @Column(name = "prevision_duree", nullable = true, length = -1)
    public String getPrevisionDuree() {
        return previsionDuree;
    }

    public void setPrevisionDuree(String previsionDuree) {
        this.previsionDuree = previsionDuree;
    }

    @Basic
    @Column(name = "plan_date_debut", nullable = true)
    public ZonedDateTime getPlanDateDebut() {
        return planDateDebut;
    }

    public void setPlanDateDebut(ZonedDateTime planDateDebut) {
        this.planDateDebut = planDateDebut;
    }

    @Basic
    @Column(name = "plan_date_fin", nullable = true)
    public ZonedDateTime getPlanDateFin() {
        return planDateFin;
    }

    public void setPlanDateFin(ZonedDateTime planDateFin) {
        this.planDateFin = planDateFin;
    }

    @Basic
    @Column(name = "id_auteur_gmao", nullable = true, length = -1)
    public String getIdAuteurGmao() {
        return idAuteurGmao;
    }

    public void setIdAuteurGmao(String idAuteurGmao) {
        this.idAuteurGmao = idAuteurGmao;
    }

    @Basic
    @Column(name = "id_auteur_ot_dlk", nullable = true)
    public Boolean getIdAuteurOtDlk() {
        return idAuteurOtDlk;
    }

    public void setIdAuteurOtDlk(Boolean idAuteurOtDlk) {
        this.idAuteurOtDlk = idAuteurOtDlk;
    }

    @Basic
    @Column(name = "est_rdv_client", nullable = true)
    public Boolean getEstRdvClient() {
        return estRdvClient;
    }

    public void setEstRdvClient(Boolean estRdvClient) {
        this.estRdvClient = estRdvClient;
    }

    @Basic
    @Column(name = "est_controle_reglementaire", nullable = true)
    public Boolean getEstControleReglementaire() {
        return estControleReglementaire;
    }

    public void setEstControleReglementaire(Boolean estControleReglementaire) {
        this.estControleReglementaire = estControleReglementaire;
    }

    @Basic
    @Column(name = "statut_ot", nullable = true, length = -1)
    public String getStatutOt() {
        return statutOt;
    }

    public void setStatutOt(String statutOt) {
        this.statutOt = statutOt;
    }

    @Basic
    @Column(name = "statut_date_validation_mop", nullable = true)
    public ZonedDateTime getStatutDateValidationMop() {
        return statutDateValidationMop;
    }

    public void setStatutDateValidationMop(ZonedDateTime statutDateValidationMop) {
        this.statutDateValidationMop = statutDateValidationMop;
    }

    @Basic
    @Column(name = "statut_date_cloture_intervenant", nullable = true)
    public ZonedDateTime getStatutDateClotureIntervenant() {
        return statutDateClotureIntervenant;
    }

    public void setStatutDateClotureIntervenant(ZonedDateTime statutDateClotureIntervenant) {
        this.statutDateClotureIntervenant = statutDateClotureIntervenant;
    }

    @Basic
    @Column(name = "statut_date_creation", nullable = true)
    public ZonedDateTime getStatutDateCreation() {
        return statutDateCreation;
    }

    public void setStatutDateCreation(ZonedDateTime statutDateCreation) {
        this.statutDateCreation = statutDateCreation;
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
    public ZonedDateTime getDateEnvoiVersGmao() {
        return dateEnvoiVersGmao;
    }

    public void setDateEnvoiVersGmao(ZonedDateTime dateEnvoiVersGmao) {
        this.dateEnvoiVersGmao = dateEnvoiVersGmao;
    }

    @Basic
    @Column(name = "date_maj_vers_gmao", nullable = true)
    public ZonedDateTime getDateMajVersGmao() {
        return dateMajVersGmao;
    }

    public void setDateMajVersGmao(ZonedDateTime dateMajVersGmao) {
        this.dateMajVersGmao = dateMajVersGmao;
    }

    @Basic
    @Column(name = "statut_realisation_partiel", nullable = true)
    public Boolean getStatutRealisationPartiel() {
        return statutRealisationPartiel;
    }

    public void setStatutRealisationPartiel(Boolean statutRealisationPartiel) {
        this.statutRealisationPartiel = statutRealisationPartiel;
    }

    @Basic
    @Column(name = "id_ot_parent_dlk", nullable = true)
    public UUID getIdOtParentDlk() {
        return idOtParentDlk;
    }

    public void setIdOtParentDlk(UUID idOtParentDlk) {
        this.idOtParentDlk = idOtParentDlk;
    }

    @Basic
    @Column(name = "numero_ot_parent", nullable = true, length = -1)
    public String getNumeroOtParent() {
        return numeroOtParent;
    }

    public void setNumeroOtParent(String numeroOtParent) {
        this.numeroOtParent = numeroOtParent;
    }

    @Basic
    @Column(name = "canal_modification", nullable = true, length = -1)
    public String getCanalModification() {
        return canalModification;
    }

    public void setCanalModification(String canalModification) {
        this.canalModification = canalModification;
    }

    @Basic
    @Column(name = "type_activite_sigma", nullable = true, length = -1)
    public String getTypeActiviteSigma() {
        return typeActiviteSigma;
    }

    public void setTypeActiviteSigma(String typeActiviteSigma) {
        this.typeActiviteSigma = typeActiviteSigma;
    }

    @Basic
    @Column(name = "date_plafond", nullable = true)
    public ZonedDateTime getDatePlafond() {
        return datePlafond;
    }

    public void setDatePlafond(ZonedDateTime datePlafond) {
        this.datePlafond = datePlafond;
    }

    @Basic
    @Column(name = "date_plancher", nullable = true)
    public ZonedDateTime getDatePlancher() {
        return datePlancher;
    }

    public void setDatePlancher(ZonedDateTime datePlancher) {
        this.datePlancher = datePlancher;
    }

    @Basic
    @Column(name = "numero_ot_csc", nullable = true, length = -1)
    public String getNumeroOtCsc() {
        return numeroOtCsc;
    }

    public void setNumeroOtCsc(String numeroOtCsc) {
        this.numeroOtCsc = numeroOtCsc;
    }

    @Basic
    @Column(name = "typologie", nullable = true, length = -1)
    public String getTypologie() {
        return typologie;
    }

    public void setTypologie(String typologie) {
        this.typologie = typologie;
    }

    @Basic
    @Column(name = "sous_typologie", nullable = true, length = -1)
    public String getSousTypologie() {
        return sousTypologie;
    }

    public void setSousTypologie(String sousTypologie) {
        this.sousTypologie = sousTypologie;
    }

    @Basic
    @Column(name = "libelle_origine", nullable = true, length = -1)
    public String getLibelleOrigine() {
        return libelleOrigine;
    }

    public void setLibelleOrigine(String libelleOrigine) {
        this.libelleOrigine = libelleOrigine;
    }

    @Basic
    @Column(name = "numero_fiche_mp", nullable = true, length = -1)
    public String getNumeroFicheMp() {
        return numeroFicheMp;
    }

    public void setNumeroFicheMp(String numeroFicheMp) {
        this.numeroFicheMp = numeroFicheMp;
    }

    @Basic
    @Column(name = "numero_gamme", nullable = true, length = -1)
    public String getNumeroGamme() {
        return numeroGamme;
    }

    public void setNumeroGamme(String numeroGamme) {
        this.numeroGamme = numeroGamme;
    }

    @Basic
    @Column(name = "numero_arret", nullable = true, length = -1)
    public String getNumeroArret() {
        return numeroArret;
    }

    public void setNumeroArret(String numeroArret) {
        this.numeroArret = numeroArret;
    }

    @Basic
    @Column(name = "date_envoi_vers_pivot", nullable = true)
    public ZonedDateTime getDateEnvoiVersPivot() {
        return dateEnvoiVersPivot;
    }

    public void setDateEnvoiVersPivot(ZonedDateTime dateEnvoiVersPivot) {
        this.dateEnvoiVersPivot = dateEnvoiVersPivot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtEntity otEntity = (OtEntity) o;
        return multiIntervenant == otEntity.multiIntervenant &&
                Objects.equals(id, otEntity.id) &&
                Objects.equals(idGmao, otEntity.idGmao) &&
                Objects.equals(idInstanceGmao, otEntity.idInstanceGmao) &&
                Objects.equals(dateImport, otEntity.dateImport) &&
                Objects.equals(numeroOt, otEntity.numeroOt) &&
                Objects.equals(typeActivite, otEntity.typeActivite) &&
                Objects.equals(periodiciteCode, otEntity.periodiciteCode) &&
                Objects.equals(periodiciteLibelle, otEntity.periodiciteLibelle) &&
                Objects.equals(priorite, otEntity.priorite) &&
                Objects.equals(libelleIntervention, otEntity.libelleIntervention) &&
                Objects.equals(description, otEntity.description) &&
                Objects.equals(conditionSla, otEntity.conditionSla) &&
                Objects.equals(existanceSla, otEntity.existanceSla) &&
                Objects.equals(dateModification, otEntity.dateModification) &&
                Objects.equals(idOtParentGmao, otEntity.idOtParentGmao) &&
                Objects.equals(previsionDateDebut, otEntity.previsionDateDebut) &&
                Objects.equals(previsionDateFin, otEntity.previsionDateFin) &&
                Objects.equals(previsionDuree, otEntity.previsionDuree) &&
                Objects.equals(planDateDebut, otEntity.planDateDebut) &&
                Objects.equals(planDateFin, otEntity.planDateFin) &&
                Objects.equals(idAuteurGmao, otEntity.idAuteurGmao) &&
                Objects.equals(idAuteurOtDlk, otEntity.idAuteurOtDlk) &&
                Objects.equals(estRdvClient, otEntity.estRdvClient) &&
                Objects.equals(estControleReglementaire, otEntity.estControleReglementaire) &&
                Objects.equals(statutOt, otEntity.statutOt) &&
                Objects.equals(statutDateValidationMop, otEntity.statutDateValidationMop) &&
                Objects.equals(statutDateClotureIntervenant, otEntity.statutDateClotureIntervenant) &&
                Objects.equals(statutDateCreation, otEntity.statutDateCreation) &&
                Objects.equals(origine, otEntity.origine) &&
                Objects.equals(dateEnvoiVersGmao, otEntity.dateEnvoiVersGmao) &&
                Objects.equals(dateMajVersGmao, otEntity.dateMajVersGmao) &&
                Objects.equals(statutRealisationPartiel, otEntity.statutRealisationPartiel) &&
                Objects.equals(idOtParentDlk, otEntity.idOtParentDlk) &&
                Objects.equals(numeroOtParent, otEntity.numeroOtParent) &&
                Objects.equals(canalModification, otEntity.canalModification) &&
                Objects.equals(typeActiviteSigma, otEntity.typeActiviteSigma) &&
                Objects.equals(datePlafond, otEntity.datePlafond) &&
                Objects.equals(datePlancher, otEntity.datePlancher) &&
                Objects.equals(numeroOtCsc, otEntity.numeroOtCsc) &&
                Objects.equals(typologie, otEntity.typologie) &&
                Objects.equals(sousTypologie, otEntity.sousTypologie) &&
                Objects.equals(libelleOrigine, otEntity.libelleOrigine) &&
                Objects.equals(numeroFicheMp, otEntity.numeroFicheMp) &&
                Objects.equals(numeroGamme, otEntity.numeroGamme) &&
                Objects.equals(numeroArret, otEntity.numeroArret) &&
                Objects.equals(dateEnvoiVersPivot, otEntity.dateEnvoiVersPivot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idGmao, idInstanceGmao, dateImport, numeroOt, typeActivite, periodiciteCode, periodiciteLibelle, priorite, libelleIntervention, description, conditionSla, existanceSla, multiIntervenant, dateModification, idOtParentGmao, previsionDateDebut, previsionDateFin, previsionDuree, planDateDebut, planDateFin, idAuteurGmao, idAuteurOtDlk, estRdvClient, estControleReglementaire, statutOt, statutDateValidationMop, statutDateClotureIntervenant, statutDateCreation, origine, dateEnvoiVersGmao, dateMajVersGmao, statutRealisationPartiel, idOtParentDlk, numeroOtParent, canalModification, typeActiviteSigma, datePlafond, datePlancher, numeroOtCsc, typologie, sousTypologie, libelleOrigine, numeroFicheMp, numeroGamme, numeroArret, dateEnvoiVersPivot);
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id")
    public DemandeEntity getDemandeByIdDemande() {
        return demande;
    }

    public void setDemandeByIdDemande(DemandeEntity demandeByIdDemande) {
        this.demande = demandeByIdDemande;
    }
}

package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_histo", schema = "activite", catalog = "activite")
public class OtHistoEntity extends UuidEntity{

    private Object dateVersion;
    private int numeroVersion;
    private String idGmao;
    private String idInstanceGmao;
    private Object dateImport;
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
    private Object dateModification;
    private String idOtParentGmao;
    private Object previsionDateDebut;
    private Object previsionDateFin;
    private String previsionDuree;
    private Object planDateDebut;
    private Object planDateFin;
    private String idAuteurGmao;
    private Boolean idAuteurOtDlk;
    private Boolean estRdvClient;
    private Boolean estControleReglementaire;
    private String statutOt;
    private Object statutDateValidationMop;
    private Object statutDateClotureIntervenant;
    private Object statutDateCreation;
    private String origine;
    private Object dateEnvoiVersGmao;
    private Object dateMajVersGmao;
    private Boolean statutRealisationPartiel;
    private Object idOtParentDlk;
    private UUID idDemande;
    private String numeroOtParent;
    private String canalModification;
    private String typeActiviteSigma;
    private Object datePlafond;
    private Object datePlancher;
    private String numeroOtCsc;
    private String typologie;
    private String sousTypologie;
    private String libelleOrigine;
    private String numeroFicheMp;
    private String numeroGamme;
    private String numeroArret;
    private Object dateEnvoiVersPivot;
    private OtEntity otByIdOt;


    @Basic
    @Column(name = "date_version", nullable = false)
    public Object getDateVersion() {
        return dateVersion;
    }

    public void setDateVersion(Object dateVersion) {
        this.dateVersion = dateVersion;
    }

    @Basic
    @Column(name = "numero_version", nullable = false)
    public int getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(int numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

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
    public Object getDateImport() {
        return dateImport;
    }

    public void setDateImport(Object dateImport) {
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
    public Object getDateModification() {
        return dateModification;
    }

    public void setDateModification(Object dateModification) {
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
    public Object getPrevisionDateDebut() {
        return previsionDateDebut;
    }

    public void setPrevisionDateDebut(Object previsionDateDebut) {
        this.previsionDateDebut = previsionDateDebut;
    }

    @Basic
    @Column(name = "prevision_date_fin", nullable = true)
    public Object getPrevisionDateFin() {
        return previsionDateFin;
    }

    public void setPrevisionDateFin(Object previsionDateFin) {
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
    public Object getPlanDateDebut() {
        return planDateDebut;
    }

    public void setPlanDateDebut(Object planDateDebut) {
        this.planDateDebut = planDateDebut;
    }

    @Basic
    @Column(name = "plan_date_fin", nullable = true)
    public Object getPlanDateFin() {
        return planDateFin;
    }

    public void setPlanDateFin(Object planDateFin) {
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
    public Object getStatutDateValidationMop() {
        return statutDateValidationMop;
    }

    public void setStatutDateValidationMop(Object statutDateValidationMop) {
        this.statutDateValidationMop = statutDateValidationMop;
    }

    @Basic
    @Column(name = "statut_date_cloture_intervenant", nullable = true)
    public Object getStatutDateClotureIntervenant() {
        return statutDateClotureIntervenant;
    }

    public void setStatutDateClotureIntervenant(Object statutDateClotureIntervenant) {
        this.statutDateClotureIntervenant = statutDateClotureIntervenant;
    }

    @Basic
    @Column(name = "statut_date_creation", nullable = true)
    public Object getStatutDateCreation() {
        return statutDateCreation;
    }

    public void setStatutDateCreation(Object statutDateCreation) {
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
    public Object getDateEnvoiVersGmao() {
        return dateEnvoiVersGmao;
    }

    public void setDateEnvoiVersGmao(Object dateEnvoiVersGmao) {
        this.dateEnvoiVersGmao = dateEnvoiVersGmao;
    }

    @Basic
    @Column(name = "date_maj_vers_gmao", nullable = true)
    public Object getDateMajVersGmao() {
        return dateMajVersGmao;
    }

    public void setDateMajVersGmao(Object dateMajVersGmao) {
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
    public Object getIdOtParentDlk() {
        return idOtParentDlk;
    }

    public void setIdOtParentDlk(Object idOtParentDlk) {
        this.idOtParentDlk = idOtParentDlk;
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
    public Object getDatePlafond() {
        return datePlafond;
    }

    public void setDatePlafond(Object datePlafond) {
        this.datePlafond = datePlafond;
    }

    @Basic
    @Column(name = "date_plancher", nullable = true)
    public Object getDatePlancher() {
        return datePlancher;
    }

    public void setDatePlancher(Object datePlancher) {
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
    public Object getDateEnvoiVersPivot() {
        return dateEnvoiVersPivot;
    }

    public void setDateEnvoiVersPivot(Object dateEnvoiVersPivot) {
        this.dateEnvoiVersPivot = dateEnvoiVersPivot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtHistoEntity that = (OtHistoEntity) o;
        return numeroVersion == that.numeroVersion &&
                multiIntervenant == that.multiIntervenant &&
                Objects.equals(id, that.id) &&
                Objects.equals(dateVersion, that.dateVersion) &&
                Objects.equals(idGmao, that.idGmao) &&
                Objects.equals(idInstanceGmao, that.idInstanceGmao) &&
                Objects.equals(dateImport, that.dateImport) &&
                Objects.equals(numeroOt, that.numeroOt) &&
                Objects.equals(typeActivite, that.typeActivite) &&
                Objects.equals(periodiciteCode, that.periodiciteCode) &&
                Objects.equals(periodiciteLibelle, that.periodiciteLibelle) &&
                Objects.equals(priorite, that.priorite) &&
                Objects.equals(libelleIntervention, that.libelleIntervention) &&
                Objects.equals(description, that.description) &&
                Objects.equals(conditionSla, that.conditionSla) &&
                Objects.equals(existanceSla, that.existanceSla) &&
                Objects.equals(dateModification, that.dateModification) &&
                Objects.equals(idOtParentGmao, that.idOtParentGmao) &&
                Objects.equals(previsionDateDebut, that.previsionDateDebut) &&
                Objects.equals(previsionDateFin, that.previsionDateFin) &&
                Objects.equals(previsionDuree, that.previsionDuree) &&
                Objects.equals(planDateDebut, that.planDateDebut) &&
                Objects.equals(planDateFin, that.planDateFin) &&
                Objects.equals(idAuteurGmao, that.idAuteurGmao) &&
                Objects.equals(idAuteurOtDlk, that.idAuteurOtDlk) &&
                Objects.equals(estRdvClient, that.estRdvClient) &&
                Objects.equals(estControleReglementaire, that.estControleReglementaire) &&
                Objects.equals(statutOt, that.statutOt) &&
                Objects.equals(statutDateValidationMop, that.statutDateValidationMop) &&
                Objects.equals(statutDateClotureIntervenant, that.statutDateClotureIntervenant) &&
                Objects.equals(statutDateCreation, that.statutDateCreation) &&
                Objects.equals(origine, that.origine) &&
                Objects.equals(dateEnvoiVersGmao, that.dateEnvoiVersGmao) &&
                Objects.equals(dateMajVersGmao, that.dateMajVersGmao) &&
                Objects.equals(statutRealisationPartiel, that.statutRealisationPartiel) &&
                Objects.equals(idOtParentDlk, that.idOtParentDlk) &&
                Objects.equals(idDemande, that.idDemande) &&
                Objects.equals(numeroOtParent, that.numeroOtParent) &&
                Objects.equals(canalModification, that.canalModification) &&
                Objects.equals(typeActiviteSigma, that.typeActiviteSigma) &&
                Objects.equals(datePlafond, that.datePlafond) &&
                Objects.equals(datePlancher, that.datePlancher) &&
                Objects.equals(numeroOtCsc, that.numeroOtCsc) &&
                Objects.equals(typologie, that.typologie) &&
                Objects.equals(sousTypologie, that.sousTypologie) &&
                Objects.equals(libelleOrigine, that.libelleOrigine) &&
                Objects.equals(numeroFicheMp, that.numeroFicheMp) &&
                Objects.equals(numeroGamme, that.numeroGamme) &&
                Objects.equals(numeroArret, that.numeroArret) &&
                Objects.equals(dateEnvoiVersPivot, that.dateEnvoiVersPivot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateVersion, numeroVersion, idGmao, idInstanceGmao, dateImport, numeroOt, typeActivite, periodiciteCode, periodiciteLibelle, priorite, libelleIntervention, description, conditionSla, existanceSla, multiIntervenant, dateModification, idOtParentGmao, previsionDateDebut, previsionDateFin, previsionDuree, planDateDebut, planDateFin, idAuteurGmao, idAuteurOtDlk, estRdvClient, estControleReglementaire, statutOt, statutDateValidationMop, statutDateClotureIntervenant, statutDateCreation, origine, dateEnvoiVersGmao, dateMajVersGmao, statutRealisationPartiel, idOtParentDlk, idDemande, numeroOtParent, canalModification, typeActiviteSigma, datePlafond, datePlancher, numeroOtCsc, typologie, sousTypologie, libelleOrigine, numeroFicheMp, numeroGamme, numeroArret, dateEnvoiVersPivot);
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

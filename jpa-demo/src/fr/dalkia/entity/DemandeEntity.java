package fr.dalkia.entity;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "demande", schema = "activite", catalog = "activite")
public class DemandeEntity extends UuidEntity {

    private UUID idInstanceGmao;
    private String idDemandeGmao;
    private OffsetDateTime dateMaj;
    private OffsetDateTime dateCreationGmao;
    private OffsetDateTime dateMajGmao;
    private String referenceExterne;
    private int idStatut;
    private String description;
    private String commentaireClient;
    private String commentaireInterne;
    private OffsetDateTime dateDebutCible;
    private OffsetDateTime dateFinCible;
    private OffsetDateTime dateDebutReel;
    private OffsetDateTime dateFinReel;
    private String dkCodeDemande;
    private OffsetDateTime dateEnvoiGmaoCreation;
    private OffsetDateTime dateEnvoiGmaoMaj;
    private UUID idLocalisation;
    private String codeDi;
    private String criticiteCodeGmao;
    private String criticiteDescription;
    private boolean criticiteEstUrgent;
    private String impactPanne;
    private String criticiteIdGmao;
    private OffsetDateTime dateLimiteAcquittement;
    private OffsetDateTime dateLimiteDemarrageIntervention;
    private OffsetDateTime dateLimiteFinIntervention;
    private OffsetDateTime datePriseEnCharge;
    private OffsetDateTime dateCreation;
    private Boolean estAstreinte;
    private String natureCas;
    private DemandeEntity demande;

    @Basic
    @Column(name = "id_instance_gmao", nullable = true)
    public UUID getIdInstanceGmao() {
        return idInstanceGmao;
    }

    public void setIdInstanceGmao(UUID idInstanceGmao) {
        this.idInstanceGmao = idInstanceGmao;
    }

    @Basic
    @Column(name = "id_demande_gmao", nullable = true, length = -1)
    public String getIdDemandeGmao() {
        return idDemandeGmao;
    }

    public void setIdDemandeGmao(String idDemandeGmao) {
        this.idDemandeGmao = idDemandeGmao;
    }

    @Basic
    @Column(name = "date_maj", nullable = false)
    public OffsetDateTime getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(OffsetDateTime dateMaj) {
        this.dateMaj = dateMaj;
    }

    @Basic
    @Column(name = "date_creation_gmao", nullable = true)
    public OffsetDateTime getDateCreationGmao() {
        return dateCreationGmao;
    }

    public void setDateCreationGmao(OffsetDateTime dateCreationGmao) {
        this.dateCreationGmao = dateCreationGmao;
    }

    @Basic
    @Column(name = "date_maj_gmao", nullable = true)
    public OffsetDateTime getDateMajGmao() {
        return dateMajGmao;
    }

    public void setDateMajGmao(OffsetDateTime dateMajGmao) {
        this.dateMajGmao = dateMajGmao;
    }

    @Basic
    @Column(name = "reference_externe", nullable = true, length = -1)
    public String getReferenceExterne() {
        return referenceExterne;
    }

    public void setReferenceExterne(String referenceExterne) {
        this.referenceExterne = referenceExterne;
    }

    @Basic
    @Column(name = "id_statut", nullable = false)
    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "commentaire_interne", nullable = true, length = -1)
    public String getCommentaireInterne() {
        return commentaireInterne;
    }

    public void setCommentaireInterne(String commentaireInterne) {
        this.commentaireInterne = commentaireInterne;
    }

    @Basic
    @Column(name = "date_debut_cible", nullable = true)
    public OffsetDateTime getDateDebutCible() {
        return dateDebutCible;
    }

    public void setDateDebutCible(OffsetDateTime dateDebutCible) {
        this.dateDebutCible = dateDebutCible;
    }

    @Basic
    @Column(name = "date_fin_cible", nullable = true)
    public OffsetDateTime getDateFinCible() {
        return dateFinCible;
    }

    public void setDateFinCible(OffsetDateTime dateFinCible) {
        this.dateFinCible = dateFinCible;
    }

    @Basic
    @Column(name = "date_debut_reel", nullable = true)
    public OffsetDateTime getDateDebutReel() {
        return dateDebutReel;
    }

    public void setDateDebutReel(OffsetDateTime dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    @Basic
    @Column(name = "date_fin_reel", nullable = true)
    public OffsetDateTime getDateFinReel() {
        return dateFinReel;
    }

    public void setDateFinReel(OffsetDateTime dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    @Basic
    @Column(name = "dk_code_demande", nullable = true, length = -1)
    public String getDkCodeDemande() {
        return dkCodeDemande;
    }

    public void setDkCodeDemande(String dkCodeDemande) {
        this.dkCodeDemande = dkCodeDemande;
    }

    @Basic
    @Column(name = "date_envoi_gmao_creation", nullable = true)
    public OffsetDateTime getDateEnvoiGmaoCreation() {
        return dateEnvoiGmaoCreation;
    }

    public void setDateEnvoiGmaoCreation(OffsetDateTime dateEnvoiGmaoCreation) {
        this.dateEnvoiGmaoCreation = dateEnvoiGmaoCreation;
    }

    @Basic
    @Column(name = "date_envoi_gmao_maj", nullable = true)
    public OffsetDateTime getDateEnvoiGmaoMaj() {
        return dateEnvoiGmaoMaj;
    }

    public void setDateEnvoiGmaoMaj(OffsetDateTime dateEnvoiGmaoMaj) {
        this.dateEnvoiGmaoMaj = dateEnvoiGmaoMaj;
    }

    @Basic
    @Column(name = "id_localisation", nullable = false)
    public UUID getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(UUID idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    @Basic
    @Column(name = "code_di", nullable = true, length = -1)
    public String getCodeDi() {
        return codeDi;
    }

    public void setCodeDi(String codeDi) {
        this.codeDi = codeDi;
    }

    @Basic
    @Column(name = "criticite_code_gmao", nullable = true, length = -1)
    public String getCriticiteCodeGmao() {
        return criticiteCodeGmao;
    }

    public void setCriticiteCodeGmao(String criticiteCodeGmao) {
        this.criticiteCodeGmao = criticiteCodeGmao;
    }

    @Basic
    @Column(name = "criticite_description", nullable = true, length = -1)
    public String getCriticiteDescription() {
        return criticiteDescription;
    }

    public void setCriticiteDescription(String criticiteDescription) {
        this.criticiteDescription = criticiteDescription;
    }

    @Basic
    @Column(name = "criticite_est_urgent", nullable = false)
    public boolean isCriticiteEstUrgent() {
        return criticiteEstUrgent;
    }

    public void setCriticiteEstUrgent(boolean criticiteEstUrgent) {
        this.criticiteEstUrgent = criticiteEstUrgent;
    }

    @Basic
    @Column(name = "impact_panne", nullable = true, length = -1)
    public String getImpactPanne() {
        return impactPanne;
    }

    public void setImpactPanne(String impactPanne) {
        this.impactPanne = impactPanne;
    }

    @Basic
    @Column(name = "criticite_id_gmao", nullable = true, length = -1)
    public String getCriticiteIdGmao() {
        return criticiteIdGmao;
    }

    public void setCriticiteIdGmao(String criticiteIdGmao) {
        this.criticiteIdGmao = criticiteIdGmao;
    }

    @Basic
    @Column(name = "date_limite_acquittement", nullable = true)
    public OffsetDateTime getDateLimiteAcquittement() {
        return dateLimiteAcquittement;
    }

    public void setDateLimiteAcquittement(OffsetDateTime dateLimiteAcquittement) {
        this.dateLimiteAcquittement = dateLimiteAcquittement;
    }

    @Basic
    @Column(name = "date_limite_demarrage_intervention", nullable = true)
    public OffsetDateTime getDateLimiteDemarrageIntervention() {
        return dateLimiteDemarrageIntervention;
    }

    public void setDateLimiteDemarrageIntervention(OffsetDateTime dateLimiteDemarrageIntervention) {
        this.dateLimiteDemarrageIntervention = dateLimiteDemarrageIntervention;
    }

    @Basic
    @Column(name = "date_limite_fin_intervention", nullable = true)
    public OffsetDateTime getDateLimiteFinIntervention() {
        return dateLimiteFinIntervention;
    }

    public void setDateLimiteFinIntervention(OffsetDateTime dateLimiteFinIntervention) {
        this.dateLimiteFinIntervention = dateLimiteFinIntervention;
    }

    @Basic
    @Column(name = "date_prise_en_charge", nullable = true)
    public OffsetDateTime getDatePriseEnCharge() {
        return datePriseEnCharge;
    }

    public void setDatePriseEnCharge(OffsetDateTime datePriseEnCharge) {
        this.datePriseEnCharge = datePriseEnCharge;
    }

    @Basic
    @Column(name = "date_creation", nullable = true)
    public OffsetDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(OffsetDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "est_astreinte", nullable = true)
    public Boolean getEstAstreinte() {
        return estAstreinte;
    }

    public void setEstAstreinte(Boolean estAstreinte) {
        this.estAstreinte = estAstreinte;
    }

    @Basic
    @Column(name = "nature_cas", nullable = true, length = -1)
    public String getNatureCas() {
        return natureCas;
    }

    public void setNatureCas(String natureCas) {
        this.natureCas = natureCas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandeEntity that = (DemandeEntity) o;
        return idStatut == that.idStatut &&
                criticiteEstUrgent == that.criticiteEstUrgent &&
                Objects.equals(id, that.id) &&
                Objects.equals(idInstanceGmao, that.idInstanceGmao) &&
                Objects.equals(idDemandeGmao, that.idDemandeGmao) &&
                Objects.equals(dateMaj, that.dateMaj) &&
                Objects.equals(dateCreationGmao, that.dateCreationGmao) &&
                Objects.equals(dateMajGmao, that.dateMajGmao) &&
                Objects.equals(referenceExterne, that.referenceExterne) &&
                Objects.equals(description, that.description) &&
                Objects.equals(commentaireClient, that.commentaireClient) &&
                Objects.equals(commentaireInterne, that.commentaireInterne) &&
                Objects.equals(dateDebutCible, that.dateDebutCible) &&
                Objects.equals(dateFinCible, that.dateFinCible) &&
                Objects.equals(dateDebutReel, that.dateDebutReel) &&
                Objects.equals(dateFinReel, that.dateFinReel) &&
                Objects.equals(dkCodeDemande, that.dkCodeDemande) &&
                Objects.equals(dateEnvoiGmaoCreation, that.dateEnvoiGmaoCreation) &&
                Objects.equals(dateEnvoiGmaoMaj, that.dateEnvoiGmaoMaj) &&
                Objects.equals(idLocalisation, that.idLocalisation) &&
                Objects.equals(codeDi, that.codeDi) &&
                Objects.equals(criticiteCodeGmao, that.criticiteCodeGmao) &&
                Objects.equals(criticiteDescription, that.criticiteDescription) &&
                Objects.equals(impactPanne, that.impactPanne) &&
                Objects.equals(criticiteIdGmao, that.criticiteIdGmao) &&
                Objects.equals(dateLimiteAcquittement, that.dateLimiteAcquittement) &&
                Objects.equals(dateLimiteDemarrageIntervention, that.dateLimiteDemarrageIntervention) &&
                Objects.equals(dateLimiteFinIntervention, that.dateLimiteFinIntervention) &&
                Objects.equals(datePriseEnCharge, that.datePriseEnCharge) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(estAstreinte, that.estAstreinte) &&
                Objects.equals(natureCas, that.natureCas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idInstanceGmao, idDemandeGmao, dateMaj, dateCreationGmao, dateMajGmao, referenceExterne, idStatut, description, commentaireClient, commentaireInterne, dateDebutCible, dateFinCible, dateDebutReel, dateFinReel, dkCodeDemande, dateEnvoiGmaoCreation, dateEnvoiGmaoMaj, idLocalisation, codeDi, criticiteCodeGmao, criticiteDescription, criticiteEstUrgent, impactPanne, criticiteIdGmao, dateLimiteAcquittement, dateLimiteDemarrageIntervention, dateLimiteFinIntervention, datePriseEnCharge, dateCreation, estAstreinte, natureCas);
    }

    @ManyToOne
    @JoinColumn(name = "id_parent", referencedColumnName = "id")
    public DemandeEntity getDemande() {
        return demande;
    }

    public void setDemande(DemandeEntity demande) {
        this.demande = demande;
    }
}

package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "demande_histo", schema = "activite", catalog = "activite")
public class DemandeHistoEntity {
    private UUID id;
    private UUID idInstanceGmao;
    private String idDemandeGmao;
    private Object dateMaj;
    private int idCanalMaj;
    private int idCanalCreation;
    private Object dateCreationGmao;
    private Object dateMajGmao;
    private String referenceExterne;
    private int idStatut;
    private String description;
    private String commentaireClient;
    private String commentaireInterne;
    private Object dateDebutCible;
    private Object dateFinCible;
    private Object dateDebutReel;
    private Object dateFinReel;
    private Integer idTypeDemande;
    private String dkCodeDemande;
    private Object idParent;
    private Object dateEnvoiGmaoCreation;
    private Object dateEnvoiGmaoMaj;
    private Object idLocalisation;
    private String codeDi;
    private String criticiteCodeGmao;
    private String criticiteDescription;
    private boolean criticiteEstUrgent;

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
    public Object getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Object dateMaj) {
        this.dateMaj = dateMaj;
    }

    @Basic
    @Column(name = "id_canal_maj", nullable = false)
    public int getIdCanalMaj() {
        return idCanalMaj;
    }

    public void setIdCanalMaj(int idCanalMaj) {
        this.idCanalMaj = idCanalMaj;
    }

    @Basic
    @Column(name = "id_canal_creation", nullable = false)
    public int getIdCanalCreation() {
        return idCanalCreation;
    }

    public void setIdCanalCreation(int idCanalCreation) {
        this.idCanalCreation = idCanalCreation;
    }

    @Basic
    @Column(name = "date_creation_gmao", nullable = true)
    public Object getDateCreationGmao() {
        return dateCreationGmao;
    }

    public void setDateCreationGmao(Object dateCreationGmao) {
        this.dateCreationGmao = dateCreationGmao;
    }

    @Basic
    @Column(name = "date_maj_gmao", nullable = true)
    public Object getDateMajGmao() {
        return dateMajGmao;
    }

    public void setDateMajGmao(Object dateMajGmao) {
        this.dateMajGmao = dateMajGmao;
    }

    @Basic
    @Column(name = "reference_externe", nullable = false, length = -1)
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
    public Object getDateDebutCible() {
        return dateDebutCible;
    }

    public void setDateDebutCible(Object dateDebutCible) {
        this.dateDebutCible = dateDebutCible;
    }

    @Basic
    @Column(name = "date_fin_cible", nullable = true)
    public Object getDateFinCible() {
        return dateFinCible;
    }

    public void setDateFinCible(Object dateFinCible) {
        this.dateFinCible = dateFinCible;
    }

    @Basic
    @Column(name = "date_debut_reel", nullable = true)
    public Object getDateDebutReel() {
        return dateDebutReel;
    }

    public void setDateDebutReel(Object dateDebutReel) {
        this.dateDebutReel = dateDebutReel;
    }

    @Basic
    @Column(name = "date_fin_reel", nullable = true)
    public Object getDateFinReel() {
        return dateFinReel;
    }

    public void setDateFinReel(Object dateFinReel) {
        this.dateFinReel = dateFinReel;
    }

    @Basic
    @Column(name = "id_type_demande", nullable = true)
    public Integer getIdTypeDemande() {
        return idTypeDemande;
    }

    public void setIdTypeDemande(Integer idTypeDemande) {
        this.idTypeDemande = idTypeDemande;
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
    @Column(name = "id_parent", nullable = true)
    public Object getIdParent() {
        return idParent;
    }

    public void setIdParent(Object idParent) {
        this.idParent = idParent;
    }

    @Basic
    @Column(name = "date_envoi_gmao_creation", nullable = true)
    public Object getDateEnvoiGmaoCreation() {
        return dateEnvoiGmaoCreation;
    }

    public void setDateEnvoiGmaoCreation(Object dateEnvoiGmaoCreation) {
        this.dateEnvoiGmaoCreation = dateEnvoiGmaoCreation;
    }

    @Basic
    @Column(name = "date_envoi_gmao_maj", nullable = true)
    public Object getDateEnvoiGmaoMaj() {
        return dateEnvoiGmaoMaj;
    }

    public void setDateEnvoiGmaoMaj(Object dateEnvoiGmaoMaj) {
        this.dateEnvoiGmaoMaj = dateEnvoiGmaoMaj;
    }

    @Basic
    @Column(name = "id_localisation", nullable = false)
    public Object getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(Object idLocalisation) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandeHistoEntity that = (DemandeHistoEntity) o;
        return idCanalMaj == that.idCanalMaj &&
                idCanalCreation == that.idCanalCreation &&
                idStatut == that.idStatut &&
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
                Objects.equals(idTypeDemande, that.idTypeDemande) &&
                Objects.equals(dkCodeDemande, that.dkCodeDemande) &&
                Objects.equals(idParent, that.idParent) &&
                Objects.equals(dateEnvoiGmaoCreation, that.dateEnvoiGmaoCreation) &&
                Objects.equals(dateEnvoiGmaoMaj, that.dateEnvoiGmaoMaj) &&
                Objects.equals(idLocalisation, that.idLocalisation) &&
                Objects.equals(codeDi, that.codeDi) &&
                Objects.equals(criticiteCodeGmao, that.criticiteCodeGmao) &&
                Objects.equals(criticiteDescription, that.criticiteDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idInstanceGmao, idDemandeGmao, dateMaj, idCanalMaj, idCanalCreation, dateCreationGmao, dateMajGmao, referenceExterne, idStatut, description, commentaireClient, commentaireInterne, dateDebutCible, dateFinCible, dateDebutReel, dateFinReel, idTypeDemande, dkCodeDemande, idParent, dateEnvoiGmaoCreation, dateEnvoiGmaoMaj, idLocalisation, codeDi, criticiteCodeGmao, criticiteDescription, criticiteEstUrgent);
    }
}

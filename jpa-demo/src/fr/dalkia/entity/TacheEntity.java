package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tache", schema = "activite", catalog = "activite")
public class TacheEntity extends UuidEntity{

    private String idGmao;
    private String idEquipement;
    private Integer ordonnancement;
    private String libelleTache;
    private String commentaireMop;
    private String commentaireClient;
    private String statutTache;
    private UUID dateValidation;
    private UUID realiseDateDebut;
    private UUID realiseDateFin;
    private Integer realiseDuree;
    private String idIntervenant;
    private String idFormulaire;
    private String idLocalisation;
    private String idTacheGmao;
    private String commentaireInterne;
    private OtEntity ot;


    @Basic
    @Column(name = "id_gmao", nullable = true, length = -1)
    public String getIdGmao() {
        return idGmao;
    }

    public void setIdGmao(String idGmao) {
        this.idGmao = idGmao;
    }

    @Basic
    @Column(name = "id_equipement", nullable = true, length = -1)
    public String getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(String idEquipement) {
        this.idEquipement = idEquipement;
    }

    @Basic
    @Column(name = "ordonnancement", nullable = true)
    public Integer getOrdonnancement() {
        return ordonnancement;
    }

    public void setOrdonnancement(Integer ordonnancement) {
        this.ordonnancement = ordonnancement;
    }

    @Basic
    @Column(name = "libelle_tache", nullable = true, length = -1)
    public String getLibelleTache() {
        return libelleTache;
    }

    public void setLibelleTache(String libelleTache) {
        this.libelleTache = libelleTache;
    }

    @Basic
    @Column(name = "commentaire_mop", nullable = true, length = -1)
    public String getCommentaireMop() {
        return commentaireMop;
    }

    public void setCommentaireMop(String commentaireMop) {
        this.commentaireMop = commentaireMop;
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
    @Column(name = "statut_tache", nullable = false, length = -1)
    public String getStatutTache() {
        return statutTache;
    }

    public void setStatutTache(String statutTache) {
        this.statutTache = statutTache;
    }

    @Basic
    @Column(name = "date_validation", nullable = true)
    public UUID getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(UUID dateValidation) {
        this.dateValidation = dateValidation;
    }

    @Basic
    @Column(name = "realise_date_debut", nullable = true)
    public UUID getRealiseDateDebut() {
        return realiseDateDebut;
    }

    public void setRealiseDateDebut(UUID realiseDateDebut) {
        this.realiseDateDebut = realiseDateDebut;
    }

    @Basic
    @Column(name = "realise_date_fin", nullable = true)
    public UUID getRealiseDateFin() {
        return realiseDateFin;
    }

    public void setRealiseDateFin(UUID realiseDateFin) {
        this.realiseDateFin = realiseDateFin;
    }

    @Basic
    @Column(name = "realise_duree", nullable = true)
    public Integer getRealiseDuree() {
        return realiseDuree;
    }

    public void setRealiseDuree(Integer realiseDuree) {
        this.realiseDuree = realiseDuree;
    }

    @Basic
    @Column(name = "id_intervenant", nullable = true, length = -1)
    public String getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(String idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    @Basic
    @Column(name = "id_formulaire", nullable = true, length = -1)
    public String getIdFormulaire() {
        return idFormulaire;
    }

    public void setIdFormulaire(String idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    @Basic
    @Column(name = "id_localisation", nullable = true, length = -1)
    public String getIdLocalisation() {
        return idLocalisation;
    }

    public void setIdLocalisation(String idLocalisation) {
        this.idLocalisation = idLocalisation;
    }

    @Basic
    @Column(name = "id_tache_gmao", nullable = true, length = -1)
    public String getIdTacheGmao() {
        return idTacheGmao;
    }

    public void setIdTacheGmao(String idTacheGmao) {
        this.idTacheGmao = idTacheGmao;
    }

    @Basic
    @Column(name = "commentaire_interne", nullable = true, length = -1)
    public String getCommentaireInterne() {
        return commentaireInterne;
    }

    public void setCommentaireInterne(String commentaireInterne) {
        this.commentaireInterne = commentaireInterne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TacheEntity that = (TacheEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idGmao, that.idGmao) &&
                Objects.equals(idEquipement, that.idEquipement) &&
                Objects.equals(ordonnancement, that.ordonnancement) &&
                Objects.equals(libelleTache, that.libelleTache) &&
                Objects.equals(commentaireMop, that.commentaireMop) &&
                Objects.equals(commentaireClient, that.commentaireClient) &&
                Objects.equals(statutTache, that.statutTache) &&
                Objects.equals(dateValidation, that.dateValidation) &&
                Objects.equals(realiseDateDebut, that.realiseDateDebut) &&
                Objects.equals(realiseDateFin, that.realiseDateFin) &&
                Objects.equals(realiseDuree, that.realiseDuree) &&
                Objects.equals(idIntervenant, that.idIntervenant) &&
                Objects.equals(idFormulaire, that.idFormulaire) &&
                Objects.equals(idLocalisation, that.idLocalisation) &&
                Objects.equals(idTacheGmao, that.idTacheGmao) &&
                Objects.equals(commentaireInterne, that.commentaireInterne);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idGmao, idEquipement, ordonnancement, libelleTache, commentaireMop, commentaireClient, statutTache, dateValidation, realiseDateDebut, realiseDateFin, realiseDuree, idIntervenant, idFormulaire, idLocalisation, idTacheGmao, commentaireInterne);
    }

    @ManyToOne
    @JoinColumn(name = "id_ot", referencedColumnName = "id")
    public OtEntity getOt() {
        return ot;
    }

    public void setOt(OtEntity ot) {
        this.ot = ot;
    }
}

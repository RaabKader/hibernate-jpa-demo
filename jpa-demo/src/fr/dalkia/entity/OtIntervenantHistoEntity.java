package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_intervenant_histo", schema = "activite", catalog = "activite")
public class OtIntervenantHistoEntity extends UuidEntity{

    private UUID dateVersion;
    private Integer numeroVersion;
    private UUID idIntervenant;
    private UUID idOt;
    private Boolean isPrincipal;
    private String matricule;
    private UUID dateDebutPlanifiee;
    private UUID dateFinPlanifiee;
    private UUID dateCreation;
    private UUID dateAffectation;
    private String corpsDeMetier;
    private String idGmao;
    private String origine;
    private String canalModification;
    private String typeAffectation;
    private String statutAffectation;
    private OtIntervenantEntity otIntervenant;

    @Basic
    @Column(name = "date_version", nullable = true)
    public UUID getDateVersion() {
        return dateVersion;
    }

    public void setDateVersion(UUID dateVersion) {
        this.dateVersion = dateVersion;
    }

    @Basic
    @Column(name = "numero_version", nullable = true)
    public Integer getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(Integer numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    @Basic
    @Column(name = "id_intervenant", nullable = true)
    public UUID getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(UUID idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    @Basic
    @Column(name = "id_ot", nullable = true)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Basic
    @Column(name = "is_principal", nullable = true)
    public Boolean getPrincipal() {
        return isPrincipal;
    }

    public void setPrincipal(Boolean principal) {
        isPrincipal = principal;
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
    @Column(name = "date_debut_planifiee", nullable = true)
    public UUID getDateDebutPlanifiee() {
        return dateDebutPlanifiee;
    }

    public void setDateDebutPlanifiee(UUID dateDebutPlanifiee) {
        this.dateDebutPlanifiee = dateDebutPlanifiee;
    }

    @Basic
    @Column(name = "date_fin_planifiee", nullable = true)
    public UUID getDateFinPlanifiee() {
        return dateFinPlanifiee;
    }

    public void setDateFinPlanifiee(UUID dateFinPlanifiee) {
        this.dateFinPlanifiee = dateFinPlanifiee;
    }

    @Basic
    @Column(name = "date_creation", nullable = true)
    public UUID getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(UUID dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_affectation", nullable = true)
    public UUID getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(UUID dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    @Basic
    @Column(name = "corps_de_metier", nullable = true, length = -1)
    public String getCorpsDeMetier() {
        return corpsDeMetier;
    }

    public void setCorpsDeMetier(String corpsDeMetier) {
        this.corpsDeMetier = corpsDeMetier;
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
    @Column(name = "origine", nullable = true, length = -1)
    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
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
    @Column(name = "type_affectation", nullable = true, length = -1)
    public String getTypeAffectation() {
        return typeAffectation;
    }

    public void setTypeAffectation(String typeAffectation) {
        this.typeAffectation = typeAffectation;
    }

    @Basic
    @Column(name = "statut_affectation", nullable = true, length = -1)
    public String getStatutAffectation() {
        return statutAffectation;
    }

    public void setStatutAffectation(String statutAffectation) {
        this.statutAffectation = statutAffectation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtIntervenantHistoEntity that = (OtIntervenantHistoEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dateVersion, that.dateVersion) &&
                Objects.equals(numeroVersion, that.numeroVersion) &&
                Objects.equals(idIntervenant, that.idIntervenant) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(isPrincipal, that.isPrincipal) &&
                Objects.equals(matricule, that.matricule) &&
                Objects.equals(dateDebutPlanifiee, that.dateDebutPlanifiee) &&
                Objects.equals(dateFinPlanifiee, that.dateFinPlanifiee) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(dateAffectation, that.dateAffectation) &&
                Objects.equals(corpsDeMetier, that.corpsDeMetier) &&
                Objects.equals(idGmao, that.idGmao) &&
                Objects.equals(origine, that.origine) &&
                Objects.equals(canalModification, that.canalModification) &&
                Objects.equals(typeAffectation, that.typeAffectation) &&
                Objects.equals(statutAffectation, that.statutAffectation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateVersion, numeroVersion, idIntervenant, idOt, isPrincipal, matricule, dateDebutPlanifiee, dateFinPlanifiee, dateCreation, dateAffectation, corpsDeMetier, idGmao, origine, canalModification, typeAffectation, statutAffectation);
    }

    @ManyToOne
    @JoinColumn(name = "id_ot_intervenant", referencedColumnName = "id")
    public OtIntervenantEntity getOtIntervenant() {
        return otIntervenant;
    }

    public void setOtIntervenant(OtIntervenantEntity otIntervenant) {
        this.otIntervenant = otIntervenant;
    }
}

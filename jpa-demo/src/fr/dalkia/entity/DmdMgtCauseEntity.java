package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_mgt_cause", schema = "activite", catalog = "activite")
public class DmdMgtCauseEntity {
    private UUID idDemande;
    private String refCauseCode;
    private String refCauseLabel;
    private String refInfoAdditionnelle;
    private String refDomaineCode;
    private String refDomaineLabel;
    private String refNatureCode;
    private String refNatureLabel;
    private String partenaireCauseCode;
    private String partenaireCauseLabel;
    private String partenaireInfoAdditionnelle;
    private String partenaireDomaineCode;
    private String partenaireDomaineLabel;
    private String partenaireNatureCode;
    private String partenaireNatureLabel;
    private String causeDescription;
    private String impact;
    private UUID id;
    private DemandeEntity demandeByIdDemande;
    private DemandeEntity demandeByIdDemande_0;

    @Id
    @Column(name = "id_demande", nullable = false)
    public UUID getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(UUID idDemande) {
        this.idDemande = idDemande;
    }

    @Basic
    @Column(name = "ref_cause_code", nullable = true, length = -1)
    public String getRefCauseCode() {
        return refCauseCode;
    }

    public void setRefCauseCode(String refCauseCode) {
        this.refCauseCode = refCauseCode;
    }

    @Basic
    @Column(name = "ref_cause_label", nullable = true, length = -1)
    public String getRefCauseLabel() {
        return refCauseLabel;
    }

    public void setRefCauseLabel(String refCauseLabel) {
        this.refCauseLabel = refCauseLabel;
    }

    @Basic
    @Column(name = "ref_info_additionnelle", nullable = true, length = -1)
    public String getRefInfoAdditionnelle() {
        return refInfoAdditionnelle;
    }

    public void setRefInfoAdditionnelle(String refInfoAdditionnelle) {
        this.refInfoAdditionnelle = refInfoAdditionnelle;
    }

    @Basic
    @Column(name = "ref_domaine_code", nullable = true, length = -1)
    public String getRefDomaineCode() {
        return refDomaineCode;
    }

    public void setRefDomaineCode(String refDomaineCode) {
        this.refDomaineCode = refDomaineCode;
    }

    @Basic
    @Column(name = "ref_domaine_label", nullable = true, length = -1)
    public String getRefDomaineLabel() {
        return refDomaineLabel;
    }

    public void setRefDomaineLabel(String refDomaineLabel) {
        this.refDomaineLabel = refDomaineLabel;
    }

    @Basic
    @Column(name = "ref_nature_code", nullable = true, length = -1)
    public String getRefNatureCode() {
        return refNatureCode;
    }

    public void setRefNatureCode(String refNatureCode) {
        this.refNatureCode = refNatureCode;
    }

    @Basic
    @Column(name = "ref_nature_label", nullable = true, length = -1)
    public String getRefNatureLabel() {
        return refNatureLabel;
    }

    public void setRefNatureLabel(String refNatureLabel) {
        this.refNatureLabel = refNatureLabel;
    }

    @Basic
    @Column(name = "partenaire_cause_code", nullable = true, length = -1)
    public String getPartenaireCauseCode() {
        return partenaireCauseCode;
    }

    public void setPartenaireCauseCode(String partenaireCauseCode) {
        this.partenaireCauseCode = partenaireCauseCode;
    }

    @Basic
    @Column(name = "partenaire_cause_label", nullable = true, length = -1)
    public String getPartenaireCauseLabel() {
        return partenaireCauseLabel;
    }

    public void setPartenaireCauseLabel(String partenaireCauseLabel) {
        this.partenaireCauseLabel = partenaireCauseLabel;
    }

    @Basic
    @Column(name = "partenaire_info_additionnelle", nullable = true, length = -1)
    public String getPartenaireInfoAdditionnelle() {
        return partenaireInfoAdditionnelle;
    }

    public void setPartenaireInfoAdditionnelle(String partenaireInfoAdditionnelle) {
        this.partenaireInfoAdditionnelle = partenaireInfoAdditionnelle;
    }

    @Basic
    @Column(name = "partenaire_domaine_code", nullable = true, length = -1)
    public String getPartenaireDomaineCode() {
        return partenaireDomaineCode;
    }

    public void setPartenaireDomaineCode(String partenaireDomaineCode) {
        this.partenaireDomaineCode = partenaireDomaineCode;
    }

    @Basic
    @Column(name = "partenaire_domaine_label", nullable = true, length = -1)
    public String getPartenaireDomaineLabel() {
        return partenaireDomaineLabel;
    }

    public void setPartenaireDomaineLabel(String partenaireDomaineLabel) {
        this.partenaireDomaineLabel = partenaireDomaineLabel;
    }

    @Basic
    @Column(name = "partenaire_nature_code", nullable = true, length = -1)
    public String getPartenaireNatureCode() {
        return partenaireNatureCode;
    }

    public void setPartenaireNatureCode(String partenaireNatureCode) {
        this.partenaireNatureCode = partenaireNatureCode;
    }

    @Basic
    @Column(name = "partenaire_nature_label", nullable = true, length = -1)
    public String getPartenaireNatureLabel() {
        return partenaireNatureLabel;
    }

    public void setPartenaireNatureLabel(String partenaireNatureLabel) {
        this.partenaireNatureLabel = partenaireNatureLabel;
    }

    @Basic
    @Column(name = "cause_description", nullable = true, length = -1)
    public String getCauseDescription() {
        return causeDescription;
    }

    public void setCauseDescription(String causeDescription) {
        this.causeDescription = causeDescription;
    }

    @Basic
    @Column(name = "impact", nullable = true, length = -1)
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    @Basic
    @Column(name = "id", nullable = true)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdMgtCauseEntity that = (DmdMgtCauseEntity) o;
        return Objects.equals(idDemande, that.idDemande) &&
                Objects.equals(refCauseCode, that.refCauseCode) &&
                Objects.equals(refCauseLabel, that.refCauseLabel) &&
                Objects.equals(refInfoAdditionnelle, that.refInfoAdditionnelle) &&
                Objects.equals(refDomaineCode, that.refDomaineCode) &&
                Objects.equals(refDomaineLabel, that.refDomaineLabel) &&
                Objects.equals(refNatureCode, that.refNatureCode) &&
                Objects.equals(refNatureLabel, that.refNatureLabel) &&
                Objects.equals(partenaireCauseCode, that.partenaireCauseCode) &&
                Objects.equals(partenaireCauseLabel, that.partenaireCauseLabel) &&
                Objects.equals(partenaireInfoAdditionnelle, that.partenaireInfoAdditionnelle) &&
                Objects.equals(partenaireDomaineCode, that.partenaireDomaineCode) &&
                Objects.equals(partenaireDomaineLabel, that.partenaireDomaineLabel) &&
                Objects.equals(partenaireNatureCode, that.partenaireNatureCode) &&
                Objects.equals(partenaireNatureLabel, that.partenaireNatureLabel) &&
                Objects.equals(causeDescription, that.causeDescription) &&
                Objects.equals(impact, that.impact) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDemande, refCauseCode, refCauseLabel, refInfoAdditionnelle, refDomaineCode, refDomaineLabel, refNatureCode, refNatureLabel, partenaireCauseCode, partenaireCauseLabel, partenaireInfoAdditionnelle, partenaireDomaineCode, partenaireDomaineLabel, partenaireNatureCode, partenaireNatureLabel, causeDescription, impact, id);
    }

    @OneToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemandeByIdDemande() {
        return demandeByIdDemande;
    }

    public void setDemandeByIdDemande(DemandeEntity demandeByIdDemande) {
        this.demandeByIdDemande = demandeByIdDemande;
    }

    @OneToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemandeByIdDemande_0() {
        return demandeByIdDemande_0;
    }

    public void setDemandeByIdDemande_0(DemandeEntity demandeByIdDemande_0) {
        this.demandeByIdDemande_0 = demandeByIdDemande_0;
    }
}

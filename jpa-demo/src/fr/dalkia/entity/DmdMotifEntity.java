package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_motif", schema = "activite", catalog = "activite")
public class DmdMotifEntity extends UuidEntity{

    private String codeMotif;
    private String descriptionMotif;
    private String codeSsmotif;
    private String descriptionSsmotif;
    private Object idSousMotif;
    private Boolean motifEstSla;
    private Boolean sousMotifEstSla;
    private UUID idMotif;
    private DemandeEntity demande;


    @Basic
    @Column(name = "code_motif", nullable = true, length = -1)
    public String getCodeMotif() {
        return codeMotif;
    }

    public void setCodeMotif(String codeMotif) {
        this.codeMotif = codeMotif;
    }

    @Basic
    @Column(name = "description_motif", nullable = true, length = -1)
    public String getDescriptionMotif() {
        return descriptionMotif;
    }

    public void setDescriptionMotif(String descriptionMotif) {
        this.descriptionMotif = descriptionMotif;
    }

    @Basic
    @Column(name = "code_ssmotif", nullable = true, length = -1)
    public String getCodeSsmotif() {
        return codeSsmotif;
    }

    public void setCodeSsmotif(String codeSsmotif) {
        this.codeSsmotif = codeSsmotif;
    }

    @Basic
    @Column(name = "description_ssmotif", nullable = true, length = -1)
    public String getDescriptionSsmotif() {
        return descriptionSsmotif;
    }

    public void setDescriptionSsmotif(String descriptionSsmotif) {
        this.descriptionSsmotif = descriptionSsmotif;
    }

    @Basic
    @Column(name = "id_sous_motif", nullable = true)
    public Object getIdSousMotif() {
        return idSousMotif;
    }

    public void setIdSousMotif(Object idSousMotif) {
        this.idSousMotif = idSousMotif;
    }

    @Basic
    @Column(name = "motif_est_sla", nullable = true)
    public Boolean getMotifEstSla() {
        return motifEstSla;
    }

    public void setMotifEstSla(Boolean motifEstSla) {
        this.motifEstSla = motifEstSla;
    }

    @Basic
    @Column(name = "sous_motif_est_sla", nullable = true)
    public Boolean getSousMotifEstSla() {
        return sousMotifEstSla;
    }

    public void setSousMotifEstSla(Boolean sousMotifEstSla) {
        this.sousMotifEstSla = sousMotifEstSla;
    }

    @Basic
    @Column(name = "id_motif", nullable = false)
    public UUID getIdMotif() {
        return idMotif;
    }

    public void setIdMotif(UUID idMotif) {
        this.idMotif = idMotif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdMotifEntity that = (DmdMotifEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(codeMotif, that.codeMotif) &&
                Objects.equals(descriptionMotif, that.descriptionMotif) &&
                Objects.equals(codeSsmotif, that.codeSsmotif) &&
                Objects.equals(descriptionSsmotif, that.descriptionSsmotif) &&
                Objects.equals(idSousMotif, that.idSousMotif) &&
                Objects.equals(motifEstSla, that.motifEstSla) &&
                Objects.equals(sousMotifEstSla, that.sousMotifEstSla) &&
                Objects.equals(idMotif, that.idMotif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeMotif, descriptionMotif, codeSsmotif, descriptionSsmotif, idSousMotif, motifEstSla, sousMotifEstSla, idMotif);
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemande() {
        return demande;
    }

    public void setDemande(DemandeEntity demande) {
        this.demande = demande;
    }
}

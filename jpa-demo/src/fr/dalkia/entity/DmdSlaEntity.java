package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dmd_sla", schema = "activite", catalog = "activite")
public class DmdSlaEntity extends UuidEntity{

    private String codeGmao;
    private String valeur;
    private String delaiResolution;
    private DemandeEntity demande;

    @Basic
    @Column(name = "code_gmao", nullable = true, length = -1)
    public String getCodeGmao() {
        return codeGmao;
    }

    public void setCodeGmao(String codeGmao) {
        this.codeGmao = codeGmao;
    }

    @Basic
    @Column(name = "valeur", nullable = false, length = -1)
    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Basic
    @Column(name = "delai_resolution", nullable = true, length = -1)
    public String getDelaiResolution() {
        return delaiResolution;
    }

    public void setDelaiResolution(String delaiResolution) {
        this.delaiResolution = delaiResolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdSlaEntity that = (DmdSlaEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(codeGmao, that.codeGmao) &&
                Objects.equals(valeur, that.valeur) &&
                Objects.equals(delaiResolution, that.delaiResolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeGmao, valeur, delaiResolution);
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id")
    public DemandeEntity getDemande() {
        return demande;
    }

    public void setDemande(DemandeEntity demande) {
        this.demande = demande;
    }
}

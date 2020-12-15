package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_sla", schema = "activite", catalog = "activite")
public class DmdSlaEntity {
    private UUID id;
    private String codeGmao;
    private String valeur;
    private String delaiResolution;
    private DemandeEntity demandeByIdDemande;

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
    public DemandeEntity getDemandeByIdDemande() {
        return demandeByIdDemande;
    }

    public void setDemandeByIdDemande(DemandeEntity demandeByIdDemande) {
        this.demandeByIdDemande = demandeByIdDemande;
    }
}

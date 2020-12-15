package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_prise_en_compte_intervenant", schema = "activite", catalog = "activite")
public class OtPriseEnCompteIntervenantEntity {
    private UUID id;
    private Object idIntervenant;
    private String typePriseEnCompte;
    private String motifRefusOtUrgent;
    private String matricule;
    private Object datePriseEnCompte;
    private Object dateEnvoiVersGmao;
    private Object idCr;
    private OtEntity otByIdOt;

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
    @Column(name = "id_intervenant", nullable = false)
    public Object getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(Object idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    @Basic
    @Column(name = "type_prise_en_compte", nullable = false, length = -1)
    public String getTypePriseEnCompte() {
        return typePriseEnCompte;
    }

    public void setTypePriseEnCompte(String typePriseEnCompte) {
        this.typePriseEnCompte = typePriseEnCompte;
    }

    @Basic
    @Column(name = "motif_refus_ot_urgent", nullable = true, length = -1)
    public String getMotifRefusOtUrgent() {
        return motifRefusOtUrgent;
    }

    public void setMotifRefusOtUrgent(String motifRefusOtUrgent) {
        this.motifRefusOtUrgent = motifRefusOtUrgent;
    }

    @Basic
    @Column(name = "matricule", nullable = false, length = -1)
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Basic
    @Column(name = "date_prise_en_compte", nullable = false)
    public Object getDatePriseEnCompte() {
        return datePriseEnCompte;
    }

    public void setDatePriseEnCompte(Object datePriseEnCompte) {
        this.datePriseEnCompte = datePriseEnCompte;
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
    @Column(name = "id_cr", nullable = true)
    public Object getIdCr() {
        return idCr;
    }

    public void setIdCr(Object idCr) {
        this.idCr = idCr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtPriseEnCompteIntervenantEntity that = (OtPriseEnCompteIntervenantEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idIntervenant, that.idIntervenant) &&
                Objects.equals(typePriseEnCompte, that.typePriseEnCompte) &&
                Objects.equals(motifRefusOtUrgent, that.motifRefusOtUrgent) &&
                Objects.equals(matricule, that.matricule) &&
                Objects.equals(datePriseEnCompte, that.datePriseEnCompte) &&
                Objects.equals(dateEnvoiVersGmao, that.dateEnvoiVersGmao) &&
                Objects.equals(idCr, that.idCr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idIntervenant, typePriseEnCompte, motifRefusOtUrgent, matricule, datePriseEnCompte, dateEnvoiVersGmao, idCr);
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

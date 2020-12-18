package fr.dalkia.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_prise_en_compte_intervenant", schema = "activite", catalog = "activite")
public class OtPriseEnCompteIntervenantEntity extends UuidEntity{

    private UUID idIntervenant;
    private String typePriseEnCompte;
    private String motifRefusOtUrgent;
    private String matricule;
    private ZonedDateTime datePriseEnCompte;
    private ZonedDateTime dateEnvoiVersGmao;
    private UUID idCr;
    private OtEntity ot;

    @Basic
    @Column(name = "id_intervenant", nullable = false)
    public UUID getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(UUID idIntervenant) {
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
    public ZonedDateTime getDatePriseEnCompte() {
        return datePriseEnCompte;
    }

    public void setDatePriseEnCompte(ZonedDateTime datePriseEnCompte) {
        this.datePriseEnCompte = datePriseEnCompte;
    }

    @Basic
    @Column(name = "date_envoi_vers_gmao", nullable = true)
    public ZonedDateTime getDateEnvoiVersGmao() {
        return dateEnvoiVersGmao;
    }

    public void setDateEnvoiVersGmao(ZonedDateTime dateEnvoiVersGmao) {
        this.dateEnvoiVersGmao = dateEnvoiVersGmao;
    }

    @Basic
    @Column(name = "id_cr", nullable = true)
    public UUID getIdCr() {
        return idCr;
    }

    public void setIdCr(UUID idCr) {
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
    public OtEntity getOt() {
        return ot;
    }

    public void setOt(OtEntity ot) {
        this.ot = ot;
    }
}

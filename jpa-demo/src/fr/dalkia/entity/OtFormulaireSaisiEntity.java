package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ot_formulaire_saisi", schema = "activite", catalog = "activite")
@IdClass(OtFormulaireSaisiEntityPK.class)
public class OtFormulaireSaisiEntity {
    private UUID idOt;
    private UUID idFormulaire;

    @Id
    @Column(name = "id_ot", nullable = false)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Id
    @Column(name = "id_formulaire", nullable = false)
    public UUID getIdFormulaire() {
        return idFormulaire;
    }

    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtFormulaireSaisiEntity that = (OtFormulaireSaisiEntity) o;
        return Objects.equals(idOt, that.idOt) &&
                Objects.equals(idFormulaire, that.idFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOt, idFormulaire);
    }
}

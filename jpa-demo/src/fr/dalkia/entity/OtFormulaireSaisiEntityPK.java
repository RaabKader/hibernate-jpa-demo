package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OtFormulaireSaisiEntityPK implements Serializable {
    private UUID idOt;
    private UUID idFormulaire;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id_ot", nullable = false)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id_formulaire", nullable = false)
    public UUID getIdFormulaire() {
        return idFormulaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtFormulaireSaisiEntityPK that = (OtFormulaireSaisiEntityPK) o;
        return Objects.equals(idOt, that.idOt) &&
                Objects.equals(idFormulaire, that.idFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOt, idFormulaire);
    }
}

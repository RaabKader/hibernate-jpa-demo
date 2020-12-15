package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class FormulaireSaisiEntityPK implements Serializable {
    private UUID idFormulaire;
    private UUID idTypeFormulaire;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id_formulaire", nullable = false)
    public UUID getIdFormulaire() {
        return idFormulaire;
    }

    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {@org.hibernate.annotations.Parameter(name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")})
    @Column(name = "id_type_formulaire", nullable = false)
    public UUID getIdTypeFormulaire() {
        return idTypeFormulaire;
    }

    public void setIdTypeFormulaire(UUID idTypeFormulaire) {
        this.idTypeFormulaire = idTypeFormulaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormulaireSaisiEntityPK that = (FormulaireSaisiEntityPK) o;
        return Objects.equals(idFormulaire, that.idFormulaire) &&
                Objects.equals(idTypeFormulaire, that.idTypeFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormulaire, idTypeFormulaire);
    }
}

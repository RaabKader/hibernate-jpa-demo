package fr.dalkia.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "formulaire_saisi", schema = "activite", catalog = "activite")
@IdClass(FormulaireSaisiEntityPK.class)
public class FormulaireSaisiEntity {

    private UUID idFormulaire;
    private String contenu;
    private ZonedDateTime dateCreation;
    private ZonedDateTime dateModification;
    private String idAuteur;
    private UUID idTypeFormulaire;

    @Id
    @Column(name = "id_formulaire", nullable = false)
    public UUID getIdFormulaire() {
        return idFormulaire;
    }

    public void setIdFormulaire(UUID idFormulaire) {
        this.idFormulaire = idFormulaire;
    }

    @Basic
    @Column(name = "contenu", nullable = false, length = -1)
    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Basic
    @Column(name = "date_creation", nullable = false)
    public ZonedDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(ZonedDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_modification", nullable = true)
    public ZonedDateTime getDateModification() {
        return dateModification;
    }

    public void setDateModification(ZonedDateTime dateModification) {
        this.dateModification = dateModification;
    }

    @Basic
    @Column(name = "id_auteur", nullable = true, length = -1)
    public String getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(String idAuteur) {
        this.idAuteur = idAuteur;
    }

    @Id
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
        FormulaireSaisiEntity that = (FormulaireSaisiEntity) o;
        return Objects.equals(idFormulaire, that.idFormulaire) &&
                Objects.equals(contenu, that.contenu) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(dateModification, that.dateModification) &&
                Objects.equals(idAuteur, that.idAuteur) &&
                Objects.equals(idTypeFormulaire, that.idTypeFormulaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormulaire, contenu, dateCreation, dateModification, idAuteur, idTypeFormulaire);
    }
}

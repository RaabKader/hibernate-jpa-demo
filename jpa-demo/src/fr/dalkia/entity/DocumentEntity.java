package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "document", schema = "activite", catalog = "activite")
public class DocumentEntity extends UuidEntity{

    private Object idDocumentSisdoc;
    private String nom;
    private String description;
    private Object dateCreation;
    private Object dateMaj;
    private String typeContenu;
    private String serviceProprietaire;
    private Boolean estPublic;
    private String origine;

    @Basic
    @Column(name = "id_document_sisdoc", nullable = true)
    public Object getIdDocumentSisdoc() {
        return idDocumentSisdoc;
    }

    public void setIdDocumentSisdoc(Object idDocumentSisdoc) {
        this.idDocumentSisdoc = idDocumentSisdoc;
    }

    @Basic
    @Column(name = "nom", nullable = true, length = -1)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "date_creation", nullable = false)
    public Object getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Object dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_maj", nullable = false)
    public Object getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Object dateMaj) {
        this.dateMaj = dateMaj;
    }

    @Basic
    @Column(name = "type_contenu", nullable = true, length = -1)
    public String getTypeContenu() {
        return typeContenu;
    }

    public void setTypeContenu(String typeContenu) {
        this.typeContenu = typeContenu;
    }

    @Basic
    @Column(name = "service_proprietaire", nullable = true, length = -1)
    public String getServiceProprietaire() {
        return serviceProprietaire;
    }

    public void setServiceProprietaire(String serviceProprietaire) {
        this.serviceProprietaire = serviceProprietaire;
    }

    @Basic
    @Column(name = "est_public", nullable = true)
    public Boolean getEstPublic() {
        return estPublic;
    }

    public void setEstPublic(Boolean estPublic) {
        this.estPublic = estPublic;
    }

    @Basic
    @Column(name = "origine", nullable = true, length = -1)
    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentEntity that = (DocumentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idDocumentSisdoc, that.idDocumentSisdoc) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(dateMaj, that.dateMaj) &&
                Objects.equals(typeContenu, that.typeContenu) &&
                Objects.equals(serviceProprietaire, that.serviceProprietaire) &&
                Objects.equals(estPublic, that.estPublic) &&
                Objects.equals(origine, that.origine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDocumentSisdoc, nom, description, dateCreation, dateMaj, typeContenu, serviceProprietaire, estPublic, origine);
    }
}

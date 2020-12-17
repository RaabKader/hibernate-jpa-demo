package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "cr_document", schema = "activite", catalog = "activite")
public class CrDocumentEntity extends UuidEntity {
    private UUID id;
    private UUID idDocument;
    private Boolean signatureClient;
    private Boolean signatureIntervenant;
    private Object dateCreation;
    private String categorie;
    private Integer size;
    private CrEntity crByIdCr;

    @Basic
    @Column(name = "id_document", nullable = true)
    public UUID getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(UUID idDocument) {
        this.idDocument = idDocument;
    }

    @Basic
    @Column(name = "signature_client", nullable = true)
    public Boolean getSignatureClient() {
        return signatureClient;
    }

    public void setSignatureClient(Boolean signatureClient) {
        this.signatureClient = signatureClient;
    }

    @Basic
    @Column(name = "signature_intervenant", nullable = true)
    public Boolean getSignatureIntervenant() {
        return signatureIntervenant;
    }

    public void setSignatureIntervenant(Boolean signatureIntervenant) {
        this.signatureIntervenant = signatureIntervenant;
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
    @Column(name = "categorie", nullable = true, length = -1)
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Basic
    @Column(name = "size", nullable = true)
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrDocumentEntity that = (CrDocumentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idDocument, that.idDocument) &&
                Objects.equals(signatureClient, that.signatureClient) &&
                Objects.equals(signatureIntervenant, that.signatureIntervenant) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(categorie, that.categorie) &&
                Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDocument, signatureClient, signatureIntervenant, dateCreation, categorie, size);
    }

    @ManyToOne
    @JoinColumn(name = "id_cr", referencedColumnName = "id")
    public CrEntity getCrByIdCr() {
        return crByIdCr;
    }

    public void setCrByIdCr(CrEntity crByIdCr) {
        this.crByIdCr = crByIdCr;
    }
}

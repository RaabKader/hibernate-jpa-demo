package fr.dalkia.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "document_email", schema = "activite", catalog = "activite")
public class DocumentEmailEntity extends UuidEntity{

    private UUID idDocument;
    private String email;
    private ZonedDateTime date;

    @Basic
    @Column(name = "id_document", nullable = true)
    public UUID getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(UUID idDocument) {
        this.idDocument = idDocument;
    }

    @Basic
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentEmailEntity that = (DocumentEmailEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idDocument, that.idDocument) &&
                Objects.equals(email, that.email) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idDocument, email, date);
    }
}

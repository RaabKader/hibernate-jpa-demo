package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "document_email", schema = "activite", catalog = "activite")
public class DocumentEmailEntity {
    private UUID id;
    private UUID idDocument;
    private String email;
    private Object date;

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
    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
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

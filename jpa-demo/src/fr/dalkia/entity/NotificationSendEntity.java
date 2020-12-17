package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "notification_send", schema = "activite", catalog = "activite")
public class NotificationSendEntity extends UuidEntity{

    private UUID idOt;
    private UUID idUser;
    private Object date;
    private String matricule;
    private String origine;
    private String type;

    @Basic
    @Column(name = "id_ot", nullable = false)
    public UUID getIdOt() {
        return idOt;
    }

    public void setIdOt(UUID idOt) {
        this.idOt = idOt;
    }

    @Basic
    @Column(name = "id_user", nullable = false)
    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    @Basic
    @Column(name = "matricule", nullable = true, length = -1)
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Basic
    @Column(name = "origine", nullable = true, length = -1)
    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Basic
    @Column(name = "type", nullable = true, length = -1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationSendEntity that = (NotificationSendEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idOt, that.idOt) &&
                Objects.equals(idUser, that.idUser) &&
                Objects.equals(date, that.date) &&
                Objects.equals(matricule, that.matricule) &&
                Objects.equals(origine, that.origine) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idOt, idUser, date, matricule, origine, type);
    }
}

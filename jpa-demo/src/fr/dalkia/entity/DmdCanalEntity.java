package fr.dalkia.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dmd_canal", schema = "activite", catalog = "activite")
public class DmdCanalEntity extends IntEntity {
    private String code;

    @Basic
    @Column(name = "code", nullable = false, length = -1)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdCanalEntity that = (DmdCanalEntity) o;
        return id == that.id &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }
}

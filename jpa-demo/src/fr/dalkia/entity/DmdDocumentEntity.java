package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_document", schema = "activite", catalog = "activite")
public class DmdDocumentEntity {
    private UUID id;
    private DemandeEntity demandeByIdDemande;
    private DemandeEntity demandeByIdDemande_0;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdDocumentEntity that = (DmdDocumentEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemandeByIdDemande() {
        return demandeByIdDemande;
    }

    public void setDemandeByIdDemande(DemandeEntity demandeByIdDemande) {
        this.demandeByIdDemande = demandeByIdDemande;
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id", nullable = false)
    public DemandeEntity getDemandeByIdDemande_0() {
        return demandeByIdDemande_0;
    }

    public void setDemandeByIdDemande_0(DemandeEntity demandeByIdDemande_0) {
        this.demandeByIdDemande_0 = demandeByIdDemande_0;
    }
}

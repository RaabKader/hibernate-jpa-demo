package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "dmd_contact", schema = "activite", catalog = "activite")
public class DmdContactEntity {
    private UUID id;
    private String civilite;
    private String prenom;
    private String nom;
    private String email;
    private String mobile;
    private String fixe;
    private String fax;
    private String numeroVoie;
    private String libelleVoie;
    private String complementAdresse;
    private String codePostal;
    private String ville;
    private String pays;
    private Integer idTypeContact;
    private UUID idDemandeur;
    private String fonction;
    private DemandeEntity demandeByIdDemande;

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
    @Column(name = "civilite", nullable = true, length = -1)
    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    @Basic
    @Column(name = "prenom", nullable = true, length = -1)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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
    @Column(name = "email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = -1)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "fixe", nullable = true, length = -1)
    public String getFixe() {
        return fixe;
    }

    public void setFixe(String fixe) {
        this.fixe = fixe;
    }

    @Basic
    @Column(name = "fax", nullable = true, length = -1)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "numero_voie", nullable = true, length = -1)
    public String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    @Basic
    @Column(name = "libelle_voie", nullable = true, length = -1)
    public String getLibelleVoie() {
        return libelleVoie;
    }

    public void setLibelleVoie(String libelleVoie) {
        this.libelleVoie = libelleVoie;
    }

    @Basic
    @Column(name = "complement_adresse", nullable = true, length = -1)
    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    @Basic
    @Column(name = "code_postal", nullable = true, length = -1)
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Basic
    @Column(name = "ville", nullable = true, length = -1)
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "pays", nullable = true, length = -1)
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Basic
    @Column(name = "id_type_contact", nullable = true)
    public Integer getIdTypeContact() {
        return idTypeContact;
    }

    public void setIdTypeContact(Integer idTypeContact) {
        this.idTypeContact = idTypeContact;
    }

    @Basic
    @Column(name = "id_demandeur", nullable = true)
    public UUID getIdDemandeur() {
        return idDemandeur;
    }

    public void setIdDemandeur(UUID idDemandeur) {
        this.idDemandeur = idDemandeur;
    }

    @Basic
    @Column(name = "fonction", nullable = true, length = -1)
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmdContactEntity that = (DmdContactEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(civilite, that.civilite) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(email, that.email) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(fixe, that.fixe) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(numeroVoie, that.numeroVoie) &&
                Objects.equals(libelleVoie, that.libelleVoie) &&
                Objects.equals(complementAdresse, that.complementAdresse) &&
                Objects.equals(codePostal, that.codePostal) &&
                Objects.equals(ville, that.ville) &&
                Objects.equals(pays, that.pays) &&
                Objects.equals(idTypeContact, that.idTypeContact) &&
                Objects.equals(idDemandeur, that.idDemandeur) &&
                Objects.equals(fonction, that.fonction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, civilite, prenom, nom, email, mobile, fixe, fax, numeroVoie, libelleVoie, complementAdresse, codePostal, ville, pays, idTypeContact, idDemandeur, fonction);
    }

    @ManyToOne
    @JoinColumn(name = "id_demande", referencedColumnName = "id")
    public DemandeEntity getDemandeByIdDemande() {
        return demandeByIdDemande;
    }

    public void setDemandeByIdDemande(DemandeEntity demandeByIdDemande) {
        this.demandeByIdDemande = demandeByIdDemande;
    }
}

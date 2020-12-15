package fr.dalkia.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "utilisation_dactech", schema = "activite", catalog = "activite")
public class UtilisationDactechEntity {
    private UUID id;
    private UUID idIntervenant;
    private Object date;
    private Object dateCreation;
    private String deviceOsVersion;
    private String deviceAppVersion;
    private String deviceManufacturer;
    private String deviceModel;

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
    @Column(name = "id_intervenant", nullable = false)
    public UUID getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(UUID idIntervenant) {
        this.idIntervenant = idIntervenant;
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
    @Column(name = "date_creation", nullable = false)
    public Object getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Object dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "device_os_version", nullable = true, length = -1)
    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion;
    }

    @Basic
    @Column(name = "device_app_version", nullable = true, length = -1)
    public String getDeviceAppVersion() {
        return deviceAppVersion;
    }

    public void setDeviceAppVersion(String deviceAppVersion) {
        this.deviceAppVersion = deviceAppVersion;
    }

    @Basic
    @Column(name = "device_manufacturer", nullable = true, length = -1)
    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    @Basic
    @Column(name = "device_model", nullable = true, length = -1)
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilisationDactechEntity that = (UtilisationDactechEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idIntervenant, that.idIntervenant) &&
                Objects.equals(date, that.date) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(deviceOsVersion, that.deviceOsVersion) &&
                Objects.equals(deviceAppVersion, that.deviceAppVersion) &&
                Objects.equals(deviceManufacturer, that.deviceManufacturer) &&
                Objects.equals(deviceModel, that.deviceModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idIntervenant, date, dateCreation, deviceOsVersion, deviceAppVersion, deviceManufacturer, deviceModel);
    }
}

package fr.dalkia.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "utilisation_dactech", schema = "activite", catalog = "activite")
public class UtilisationDactechEntity extends UuidEntity{

    private UUID idIntervenant;
    private ZonedDateTime date;
    private ZonedDateTime dateCreation;
    private String deviceOsVersion;
    private String deviceAppVersion;
    private String deviceManufacturer;
    private String deviceModel;

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
    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
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

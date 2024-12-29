package com.mesure.temp.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "temperature_logs")
public class TemperatureLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Auto-incrementing log ID

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "device_id", nullable = false, referencedColumnName = "id", 
                foreignKey = @ForeignKey(name = "fk_temperature_logs_device"))
    private Device device; // Foreign key to the device

    @Column(name = "temperature_value", precision = 5, scale = 2, nullable = false)
    private BigDecimal temperatureValue; // Temperature value

    @Column(name = "log_date", nullable = false)
    private LocalDate logDate; // Date of the log

    @Column(name = "log_time", nullable = false)
    private LocalTime logTime; // Time of the log

    // Constructors
    public TemperatureLog() {}

    public TemperatureLog(Device device, BigDecimal temperatureValue, LocalDate logDate, LocalTime logTime) {
        this.device = device;
        this.temperatureValue = temperatureValue;
        this.logDate = logDate;
        this.logTime = logTime;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public BigDecimal getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(BigDecimal temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public LocalDate getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDate logDate) {
        this.logDate = logDate;
    }

    public LocalTime getLogTime() {
        return logTime;
    }

    public void setLogTime(LocalTime logTime) {
        this.logTime = logTime;
    }

    @Override
    public String toString() {
        return "TemperatureLog{" +
                "id=" + id +
                ", device=" + (device != null ? device.getId() : "null") +
                ", temperatureValue=" + temperatureValue +
                ", logDate=" + logDate +
                ", logTime=" + logTime +
                '}';
    }
}

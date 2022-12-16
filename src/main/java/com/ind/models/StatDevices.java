package com.ind.models;


import javax.persistence.*;

@Entity
public class StatDevices {
    @Id
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Devices device;
    private int repaired;
    private int testing;

    public StatDevices() {
    }

    public StatDevices(Devices device) {
        this.device = device;
        this.repaired = 0;
        this.testing = 0;
    }

    public Long getId() {
        return id;
    }

    public Devices getDevice() {
        return device;
    }

    public void setDevice(Devices device) {
        this.device = device;
    }

    public int getRepaired() {
        return repaired;
    }

    public void setRepaired(int repaired) {
        this.repaired = repaired;
    }

    public int getTesting() {
        return testing;
    }

    public void setTesting(int testing) {
        this.testing = testing;
    }
}

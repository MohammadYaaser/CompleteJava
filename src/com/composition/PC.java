package com.composition;

public class PC {
    private Case thCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thCase, Monitor monitor, Motherboard motherboard) {
        this.thCase = thCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getThCase() {
        return thCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

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

    public void powerUp(){
        thCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 500, "yellow");
    }

}

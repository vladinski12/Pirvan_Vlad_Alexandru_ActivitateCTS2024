package Models;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    protected Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }
}

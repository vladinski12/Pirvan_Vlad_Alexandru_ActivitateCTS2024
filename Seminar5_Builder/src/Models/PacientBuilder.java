package Models;

public class PacientBuilder implements Builder {

    @Override
    public Pacient build() {
        return this.patient;
    }

    Pacient patient;

    public PacientBuilder() {
        patient = new Pacient(false, false, false, false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.patient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.patient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.patient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        this.patient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }
}

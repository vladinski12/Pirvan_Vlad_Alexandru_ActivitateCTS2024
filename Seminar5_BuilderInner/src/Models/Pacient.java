package Models;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public static class PacientBuilder implements Builder {
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciDeCamera;
        private boolean halatPentruInterior;

        public PacientBuilder() {
            this.patRabatabil = false;
            this.micDejunInclus = false;
            this.papuciDeCamera = false;
            this.halatPentruInterior = false;
        }

        @Override
        public Pacient build() {
            return new Pacient(patRabatabil, micDejunInclus, papuciDeCamera, halatPentruInterior);
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
            this.papuciDeCamera = papuciDeCamera;
            return this;
        }

        public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
            this.halatPentruInterior = halatPentruInterior;
            return this;
        }
    }

    private Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
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

package Models;

public class SubObservatie implements Stare {
    protected SubObservatie() {
    }

    @Override
    public void setStare(Pacient pacient) {
        pacient.setStare(this);
    }
}

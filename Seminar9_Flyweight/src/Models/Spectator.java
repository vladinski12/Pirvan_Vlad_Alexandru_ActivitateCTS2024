package Models;

public class Spectator implements Flyweight {
    private int inaltime;
    private int latime;

    public Spectator(int inaltime, int latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public void deseneaza(Caracteristici caracteristici) {
        System.out.println("Spectatorul cu inaltimea " + this.inaltime + " si latimea " + this.latime + " deseneaza " + caracteristici);
    }
}

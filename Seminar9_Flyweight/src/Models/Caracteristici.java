package Models;

public class Caracteristici {
    int pozX;
    int pozY;
    String culoare;

    public Caracteristici(int pozX, int pozY, String culoare) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.culoare = culoare;
    }

    public int getPozX() {
        return pozX;
    }

    public int getPozY() {
        return pozY;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozX=" + pozX +
                ", pozY=" + pozY +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}

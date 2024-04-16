package Models;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    Map<String, Flyweight> spectatori;

    public Fabrica() {
        this.spectatori = new HashMap<String, Flyweight>();
    }

    public Flyweight getSpectator(int inaltime, int latime) {
        String cheie = inaltime + "_" + latime;
        Flyweight spectator = spectatori.get(cheie);
        if (spectator == null) {
            spectator = new Spectator(inaltime, latime);
            spectatori.put(cheie, spectator);
        }
        return spectator;
    }
}

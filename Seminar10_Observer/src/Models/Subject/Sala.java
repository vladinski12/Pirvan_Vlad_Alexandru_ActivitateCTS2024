package Models.Subject;

import Models.Observer.Observer;

import java.util.List;

public class Sala extends Subject {


    @Override
    public void notificaMeciFotbal() {
        String mesaj = "A fost programat un meci de fotbal!";
        this.notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {
        String mesaj = "A fost programat un meci de handbal!";
        this.notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj = "A fost programat un meci de volei!";
        this.notificaAbonati(mesaj);
    }
}

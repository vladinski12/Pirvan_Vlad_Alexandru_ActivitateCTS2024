package Models.Subject;

public class Stadion extends Subject {
    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonati("A fost programat un meci de fotbal!");
    }

    @Override
    public void notificaMeciHandbal() {
        super.notificaAbonati("A fost programat un meci de handbal!");
    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonati("A fost programat un meci de volei!");
    }

    public void notificaConcert() {
        super.notificaAbonati("A fost programat un concert!");
    }
}
